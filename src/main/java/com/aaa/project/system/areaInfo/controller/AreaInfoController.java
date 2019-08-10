package com.aaa.project.system.areaInfo.controller;

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
import com.aaa.project.system.areaInfo.domain.AreaInfo;
import com.aaa.project.system.areaInfo.service.IAreaInfoService;
import com.aaa.framework.web.controller.BaseController;
import com.aaa.framework.web.page.TableDataInfo;
import com.aaa.framework.web.domain.AjaxResult;
import com.aaa.common.utils.poi.ExcelUtil;

/**
 * 地理位置 信息操作处理
 * 
 * @author teacherChen
 * @date 2019-08-04
 */
@Controller
@RequestMapping("/system/areaInfo")
public class AreaInfoController extends BaseController
{
    private String prefix = "system/areaInfo";
	
	@Autowired
	private IAreaInfoService areaInfoService;
	
	@RequiresPermissions("system:areaInfo:list")
	@GetMapping()
	public String areaInfo()
	{
	    return prefix + "/areaInfo";
	}
	
	/**
	 * 查询地理位置列表
	 */
	@RequiresPermissions("system:areaInfo:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(AreaInfo areaInfo)
	{
		startPage();
        List<AreaInfo> list = areaInfoService.selectAreaInfoList(areaInfo);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出地理位置列表
	 */
	@RequiresPermissions("system:areaInfo:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(AreaInfo areaInfo)
    {
    	List<AreaInfo> list = areaInfoService.selectAreaInfoList(areaInfo);
        ExcelUtil<AreaInfo> util = new ExcelUtil<AreaInfo>(AreaInfo.class);
        return util.exportExcel(list, "areaInfo");
    }
	
	/**
	 * 新增地理位置
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存地理位置
	 */
	@RequiresPermissions("system:areaInfo:add")
	@Log(title = "地理位置", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(AreaInfo areaInfo)
	{		
		return toAjax(areaInfoService.insertAreaInfo(areaInfo));
	}

	/**
	 * 修改地理位置
	 */
	@GetMapping("/edit/{areaId}")
	public String edit(@PathVariable("areaId") Integer areaId, ModelMap mmap)
	{
		AreaInfo areaInfo = areaInfoService.selectAreaInfoById(areaId);
		mmap.put("areaInfo", areaInfo);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存地理位置
	 */
	@RequiresPermissions("system:areaInfo:edit")
	@Log(title = "地理位置", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(AreaInfo areaInfo)
	{		
		return toAjax(areaInfoService.updateAreaInfo(areaInfo));
	}
	
	/**
	 * 删除地理位置
	 */
	@RequiresPermissions("system:areaInfo:remove")
	@Log(title = "地理位置", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(areaInfoService.deleteAreaInfoByIds(ids));
	}
	
}
