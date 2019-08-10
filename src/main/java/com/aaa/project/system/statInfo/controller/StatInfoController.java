package com.aaa.project.system.statInfo.controller;

import java.util.List;

import com.aaa.project.system.companyInfo.domain.CompanyInfo;
import com.aaa.project.system.companyInfo.service.ICompanyInfoService;
import com.aaa.project.system.dept.domain.Dept;
import com.aaa.project.system.dept.service.IDeptService;
import com.aaa.project.system.stpoInfo.domain.StpoInfo;
import com.aaa.project.system.stpoInfo.service.IStpoInfoService;
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
import com.aaa.project.system.statInfo.domain.StatInfo;
import com.aaa.project.system.statInfo.service.IStatInfoService;
import com.aaa.framework.web.controller.BaseController;
import com.aaa.framework.web.page.TableDataInfo;
import com.aaa.framework.web.domain.AjaxResult;
import com.aaa.common.utils.poi.ExcelUtil;

/**
 * 统计 信息操作处理
 * 
 * @author teacherChen
 * @date 2019-08-03
 */
@Controller
@RequestMapping("/system/statInfo")
public class StatInfoController extends BaseController
{
    private String prefix = "system/statInfo";
	
	@Autowired
	private IStatInfoService statInfoService;
	@Autowired
	private IStpoInfoService stpoInfoService;
	@Autowired
	private ICompanyInfoService companyInfoService;
	
	@RequiresPermissions("system:statInfo:list")
	@GetMapping()
	public String statInfo()
	{
	    return prefix + "/statInfo";
	}
	
	/**
	 * 查询统计列表
	 */
	@RequiresPermissions("system:statInfo:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(StatInfo statInfo)
	{
		startPage();
        List<StatInfo> list = statInfoService.selectStatInfoList(statInfo);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出统计列表
	 */
	@RequiresPermissions("system:statInfo:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(StatInfo statInfo)
    {
    	List<StatInfo> list = statInfoService.selectStatInfoList(statInfo);
        ExcelUtil<StatInfo> util = new ExcelUtil<StatInfo>(StatInfo.class);
        return util.exportExcel(list, "statInfo");
    }
	
	/**
	 * 新增统计
	 */
	@GetMapping("/add")
	public String add(Model model)
	{
		List<CompanyInfo> companyname=companyInfoService.selectCompanyInfoList(null);
		model.addAttribute("companynames",companyname);
		List<StpoInfo> stpoInfo=stpoInfoService.selectStpoInfoList(null);
		//System.out.println(inspectInfo);
		model.addAttribute("stpoInfos",stpoInfo);
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存统计
	 */
	@RequiresPermissions("system:statInfo:add")
	@Log(title = "统计", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(StatInfo statInfo)
	{		
		return toAjax(statInfoService.insertStatInfo(statInfo));
	}

	/**
	 * 修改统计
	 */
	@GetMapping("/edit/{statId}")
	public String edit(@PathVariable("statId") Integer statId, ModelMap mmap,Model model)
	{
		List<CompanyInfo> companyname=companyInfoService.selectCompanyInfoList(null);
		model.addAttribute("companynames",companyname);
		List<StpoInfo> stpoInfo=stpoInfoService.selectStpoInfoList(null);
		//System.out.println(inspectInfo);
		model.addAttribute("stpoInfos",stpoInfo);

		StatInfo statInfo = statInfoService.selectStatInfoById(statId);
		mmap.put("statInfo", statInfo);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存统计
	 */
	@RequiresPermissions("system:statInfo:edit")
	@Log(title = "统计", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(StatInfo statInfo)
	{		
		return toAjax(statInfoService.updateStatInfo(statInfo));
	}
	
	/**
	 * 删除统计
	 */
	@RequiresPermissions("system:statInfo:remove")
	@Log(title = "统计", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(statInfoService.deleteStatInfoByIds(ids));
	}


	@Autowired
	private IDeptService deptService;

	@RequiresPermissions("system:statinfo:showcount")
	@RequestMapping("showcount")
	@ResponseBody
	public List<Dept> showcount(){

		return deptService.selectcount();
	}
	
}
