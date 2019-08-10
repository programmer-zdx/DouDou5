package com.aaa.project.system.resInfo.controller;

import java.util.Date;
import java.util.List;
import java.util.UUID;

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
import com.aaa.project.system.resInfo.domain.ResInfo;
import com.aaa.project.system.resInfo.service.IResInfoService;
import com.aaa.framework.web.controller.BaseController;
import com.aaa.framework.web.page.TableDataInfo;
import com.aaa.framework.web.domain.AjaxResult;
import com.aaa.common.utils.poi.ExcelUtil;

/**
 * 资源管理 信息操作处理
 * 
 * @author teacherChen
 * @date 2019-08-05
 */
@Controller
@RequestMapping("/system/resInfo")
public class ResInfoController extends BaseController
{
    private String prefix = "system/resInfo";
	
	@Autowired
	private IResInfoService resInfoService;
	
	@RequiresPermissions("system:resInfo:list")
	@GetMapping()
	public String resInfo()
	{
	    return prefix + "/resInfo";
	}
	
	/**
	 * 查询资源管理列表
	 */
	@RequiresPermissions("system:resInfo:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(ResInfo resInfo)
	{
		startPage();
        List<ResInfo> list = resInfoService.selectResInfoList(resInfo);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出资源管理列表
	 */
	@RequiresPermissions("system:resInfo:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ResInfo resInfo)
    {
    	List<ResInfo> list = resInfoService.selectResInfoList(resInfo);
        ExcelUtil<ResInfo> util = new ExcelUtil<ResInfo>(ResInfo.class);
        return util.exportExcel(list, "resInfo");
    }
	
	/**
	 * 新增资源管理
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存资源管理
	 */
	@RequiresPermissions("system:resInfo:add")
	@Log(title = "资源管理", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(ResInfo resInfo)
	{

		//设置入网时间
		resInfo.setResContinue(new Date());
		//设置资源编码
		resInfo.setResSernum(UUID.randomUUID().toString());
		return toAjax(resInfoService.insertResInfo(resInfo));
	}

	/**
	 * 修改资源管理
	 */
	@GetMapping("/edit/{resId}")
	public String edit(@PathVariable("resId") Integer resId, ModelMap mmap)
	{
		ResInfo resInfo = resInfoService.selectResInfoById(resId);
		mmap.put("resInfo", resInfo);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存资源管理
	 */
	@RequiresPermissions("system:resInfo:edit")
	@Log(title = "资源管理", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(ResInfo resInfo)
	{		
		return toAjax(resInfoService.updateResInfo(resInfo));
	}
	
	/**
	 * 删除资源管理
	 */
	@RequiresPermissions("system:resInfo:remove")
	@Log(title = "资源管理", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(resInfoService.deleteResInfoByIds(ids));
	}
	
}
