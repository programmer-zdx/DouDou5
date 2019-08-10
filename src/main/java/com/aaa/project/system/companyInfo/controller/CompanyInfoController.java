package com.aaa.project.system.companyInfo.controller;

import java.util.List;

import com.aaa.project.system.areaInfo.domain.AreaInfo;
import com.aaa.project.system.areaInfo.service.IAreaInfoService;
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
import com.aaa.project.system.companyInfo.domain.CompanyInfo;
import com.aaa.project.system.companyInfo.service.ICompanyInfoService;
import com.aaa.framework.web.controller.BaseController;
import com.aaa.framework.web.page.TableDataInfo;
import com.aaa.framework.web.domain.AjaxResult;
import com.aaa.common.utils.poi.ExcelUtil;

/**
 * 代维公司 信息操作处理
 * 
 * @author teacherChen
 * @date 2019-07-30
 */
@Controller
@RequestMapping("/system/companyInfo")
public class CompanyInfoController extends BaseController

{
    private String prefix = "system/companyInfo";

	
	@Autowired
	private ICompanyInfoService companyInfoService;

	@Autowired
	private IAreaInfoService comareaInfoService;
	
	@RequiresPermissions("system:companyInfo:list")
	@GetMapping()
	public String companyInfo()
	{
	    return prefix + "/companyInfo";
	}
	
	/**
	 * 查询代维公司列表
	 */
	@RequiresPermissions("system:companyInfo:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(CompanyInfo companyInfo)
	{
		startPage();
        List<CompanyInfo> list = companyInfoService.selectCompanyInfoList(companyInfo);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出代维公司列表
	 */
	@RequiresPermissions("system:companyInfo:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CompanyInfo companyInfo)
    {
    	List<CompanyInfo> list = companyInfoService.selectCompanyInfoList(companyInfo);
        ExcelUtil<CompanyInfo> util = new ExcelUtil<CompanyInfo>(CompanyInfo.class);
        return util.exportExcel(list, "companyInfo");
    }
	
	/**
	 * 新增代维公司
	 */
	@GetMapping("/add")
	public String add(Model model)
	{
		List<AreaInfo> companyInfoList = comareaInfoService.selectAreaInfoList(null);
		model.addAttribute("areaTypesCom",companyInfoList);

	    return prefix + "/add";
	}
	
	/**
	 * 新增保存代维公司
	 */
	@RequiresPermissions("system:companyInfo:add")
	@Log(title = "代维公司", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(CompanyInfo companyInfo)
	{		
		return toAjax(companyInfoService.insertCompanyInfo(companyInfo));
	}


	/*@GetMapping("/add")
	public String add(Model model)
	{
		List<AreaInfo> companyInfoList = areaInfoService.selectAreaInfoList(null);
		model.addAttribute("areaTypes",companyInfoList);

	    return prefix + "/add";
	}*/

	/**
	 * 修改代维公司
	 */
	@GetMapping("/edit/{companyId}")
	public String edit(@PathVariable("companyId") Integer companyId, ModelMap mmap,Model model)
	{
		List<AreaInfo> companyInfoList = comareaInfoService.selectAreaInfoList(null);
		model.addAttribute("areaTypesCom",companyInfoList);

		CompanyInfo companyInfo = companyInfoService.selectCompanyInfoById(companyId);
		mmap.put("companyInfo", companyInfo);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存代维公司
	 */
	@RequiresPermissions("system:companyInfo:edit")
	@Log(title = "代维公司", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(CompanyInfo companyInfo)
	{		
		return toAjax(companyInfoService.updateCompanyInfo(companyInfo));
	}
	
	/**
	 * 删除代维公司
	 */
	@RequiresPermissions("system:companyInfo:remove")
	@Log(title = "代维公司", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(companyInfoService.deleteCompanyInfoByIds(ids));
	}
	
}
