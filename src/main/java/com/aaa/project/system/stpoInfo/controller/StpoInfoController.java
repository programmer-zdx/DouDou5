package com.aaa.project.system.stpoInfo.controller;

import java.util.List;

import com.aaa.project.system.companyInfo.domain.CompanyInfo;
import com.aaa.project.system.companyInfo.service.ICompanyInfoService;
import com.aaa.project.system.inspectInfo.domain.InspectInfo;
import com.aaa.project.system.inspectInfo.service.IInspectInfoService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.aaa.framework.aspectj.lang.annotation.Log;
import com.aaa.framework.aspectj.lang.enums.BusinessType;
import com.aaa.project.system.stpoInfo.domain.StpoInfo;
import com.aaa.project.system.stpoInfo.service.IStpoInfoService;
import com.aaa.framework.web.controller.BaseController;
import com.aaa.framework.web.page.TableDataInfo;
import com.aaa.framework.web.domain.AjaxResult;
import com.aaa.common.utils.poi.ExcelUtil;

/**
 * 驻点  信息操作处理
 * 
 * @author teacherChen
 * @date 2019-07-31
 */
@Controller
@RequestMapping("/system/stpoInfo")
public class StpoInfoController extends BaseController
{
    private String prefix = "system/stpoInfo";
	
	@Autowired
	private IStpoInfoService stpoInfoService;
	@Autowired
	private ICompanyInfoService companyInfoService;
	@Autowired
	private IInspectInfoService inspectInfoService;
	
	@RequiresPermissions("system:stpoInfo:list")
	@GetMapping()
	public String stpoInfo()
	{
	    return prefix + "/stpoInfo";
	}
	
	/**
	 * 查询驻点 列表
	 */
	@RequiresPermissions("system:stpoInfo:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(StpoInfo stpoInfo)
	{
		startPage();
        List<StpoInfo> list = stpoInfoService.selectStpoInfoList(stpoInfo);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出驻点 列表
	 */
	@RequiresPermissions("system:stpoInfo:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(StpoInfo stpoInfo)
    {
    	List<StpoInfo> list = stpoInfoService.selectStpoInfoList(stpoInfo);
        ExcelUtil<StpoInfo> util = new ExcelUtil<StpoInfo>(StpoInfo.class);
        return util.exportExcel(list, "stpoInfo");
    }
	
	/**
	 * 新增驻点 
	 */
	@GetMapping("/add")
	public String add(Model model)
	{
		List<CompanyInfo> companyname=companyInfoService.selectCompanyInfoList(null);
		model.addAttribute("companynames",companyname);
		List<InspectInfo> inspectInfo=inspectInfoService.selectInspectInfoList(null);
		//System.out.println(inspectInfo);
		model.addAttribute("inspectInfos",inspectInfo);
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存驻点 
	 */
	@RequiresPermissions("system:stpoInfo:add")
	@Log(title = "驻点 ", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(StpoInfo stpoInfo)
	{		
		return toAjax(stpoInfoService.insertStpoInfo(stpoInfo));
	}

	/**
	 * 修改驻点 
	 */
	@GetMapping("/edit/{stpoId}")
	public String edit(@PathVariable("stpoId") Integer stpoId, ModelMap mmap,Model model)
	{
		List<CompanyInfo> companyname=companyInfoService.selectCompanyInfoList(null);
		model.addAttribute("companynames",companyname);
		List<InspectInfo> inspectInfo=inspectInfoService.selectInspectInfoList(null);
		//System.out.println(inspectInfo);
		model.addAttribute("inspectInfos",inspectInfo);
		StpoInfo stpoInfo = stpoInfoService.selectStpoInfoById(stpoId);
		mmap.put("stpoInfo", stpoInfo);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存驻点 
	 */
	@RequiresPermissions("system:stpoInfo:edit")
	@Log(title = "驻点 ", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(StpoInfo stpoInfo)
	{		
		return toAjax(stpoInfoService.updateStpoInfo(stpoInfo));
	}
	
	/**
	 * 删除驻点 
	 */
	@RequiresPermissions("system:stpoInfo:remove")
	@Log(title = "驻点 ", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(stpoInfoService.deleteStpoInfoByIds(ids));
	}
	
}
