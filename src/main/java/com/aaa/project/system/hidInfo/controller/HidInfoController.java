package com.aaa.project.system.hidInfo.controller;

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
import com.aaa.project.system.hidInfo.domain.HidInfo;
import com.aaa.project.system.hidInfo.service.IHidInfoService;
import com.aaa.framework.web.controller.BaseController;
import com.aaa.framework.web.page.TableDataInfo;
import com.aaa.framework.web.domain.AjaxResult;
import com.aaa.common.utils.poi.ExcelUtil;

/**
 * 隐患 信息操作处理
 * 
 * @author teacherChen
 * @date 2019-08-07
 */
@Controller
@RequestMapping("/system/hidInfo")
public class HidInfoController extends BaseController
{
    private String prefix = "system/hidInfo";
	
	@Autowired
	private IHidInfoService hidInfoService;
	
	@RequiresPermissions("system:hidInfo:list")
	@GetMapping()
	public String hidInfo()
	{
	    return prefix + "/hidInfo";
	}
	
	/**
	 * 查询隐患列表
	 */
	@RequiresPermissions("system:hidInfo:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(HidInfo hidInfo)
	{
		startPage();
        List<HidInfo> list = hidInfoService.selectHidInfoList(hidInfo);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出隐患列表
	 */
	@RequiresPermissions("system:hidInfo:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(HidInfo hidInfo)
    {
    	List<HidInfo> list = hidInfoService.selectHidInfoList(hidInfo);
        ExcelUtil<HidInfo> util = new ExcelUtil<HidInfo>(HidInfo.class);
        return util.exportExcel(list, "hidInfo");
    }
	
	/**
	 * 新增隐患
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存隐患
	 */
	@RequiresPermissions("system:hidInfo:add")
	@Log(title = "隐患", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(HidInfo hidInfo)
	{		
		return toAjax(hidInfoService.insertHidInfo(hidInfo));
	}

	/**
	 * 修改隐患
	 */
	@GetMapping("/edit/{hidId}")
	public String edit(@PathVariable("hidId") Integer hidId, ModelMap mmap)
	{
		HidInfo hidInfo = hidInfoService.selectHidInfoById(hidId);
		mmap.put("hidInfo", hidInfo);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存隐患
	 */
	@RequiresPermissions("system:hidInfo:edit")
	@Log(title = "隐患", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(HidInfo hidInfo)
	{		
		return toAjax(hidInfoService.updateHidInfo(hidInfo));
	}
	
	/**
	 * 删除隐患
	 */
	@RequiresPermissions("system:hidInfo:remove")
	@Log(title = "隐患", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(hidInfoService.deleteHidInfoByIds(ids));
	}
	
}
