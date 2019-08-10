package com.aaa.project.system.standardInfo.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.aaa.framework.aspectj.lang.annotation.Log;
import com.aaa.framework.aspectj.lang.enums.BusinessType;
import com.aaa.project.system.standardInfo.domain.StandardInfo;
import com.aaa.project.system.standardInfo.service.IStandardInfoService;
import com.aaa.framework.web.controller.BaseController;
import com.aaa.framework.web.page.TableDataInfo;
import com.aaa.framework.web.domain.AjaxResult;
import com.aaa.common.utils.poi.ExcelUtil;

/**
 * 规范 信息操作处理
 * 
 * @author teacherChen
 * @date 2019-08-05
 */
@Controller
@RequestMapping("/system/standardInfo")
public class StandardInfoController extends BaseController
{
    private String prefix = "system/standardInfo";
	
	@Autowired
	private IStandardInfoService standardInfoService;
	
	@RequiresPermissions("system:standardInfo:list")
	@GetMapping()
	public String standardInfo()
	{
	    return prefix + "/standardInfo";
	}
	
	/**
	 * 查询规范列表
	 */
	@RequiresPermissions("system:standardInfo:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(StandardInfo standardInfo)
	{
		startPage();
        List<StandardInfo> list = standardInfoService.selectStandardInfoList(standardInfo);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出规范列表
	 */
	@RequiresPermissions("system:standardInfo:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(StandardInfo standardInfo)
    {
    	List<StandardInfo> list = standardInfoService.selectStandardInfoList(standardInfo);
        ExcelUtil<StandardInfo> util = new ExcelUtil<StandardInfo>(StandardInfo.class);
        return util.exportExcel(list, "standardInfo");
    }
	
	/**
	 * 新增规范
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存规范
	 */
	@RequiresPermissions("system:standardInfo:add")
	@Log(title = "规范", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(StandardInfo standardInfo)
	{		
		return toAjax(standardInfoService.insertStandardInfo(standardInfo));
	}

	/**
	 * 修改规范
	 */
	@GetMapping("/edit/{standardId}")
	public String edit(@PathVariable("standardId") Integer standardId, ModelMap mmap)
	{
		StandardInfo standardInfo = standardInfoService.selectStandardInfoById(standardId);
		mmap.put("standardInfo", standardInfo);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存规范
	 */
	@RequiresPermissions("system:standardInfo:edit")
	@Log(title = "规范", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(StandardInfo standardInfo)
	{		
		return toAjax(standardInfoService.updateStandardInfo(standardInfo));
	}
	
	/**
	 * 删除规范
	 */
	@RequiresPermissions("system:standardInfo:remove")
	@Log(title = "规范", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(standardInfoService.deleteStandardInfoByIds(ids));
	}
	
}
