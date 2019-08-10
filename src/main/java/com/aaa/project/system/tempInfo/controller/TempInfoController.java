package com.aaa.project.system.tempInfo.controller;

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
import com.aaa.project.system.tempInfo.domain.TempInfo;
import com.aaa.project.system.tempInfo.service.ITempInfoService;
import com.aaa.framework.web.controller.BaseController;
import com.aaa.framework.web.page.TableDataInfo;
import com.aaa.framework.web.domain.AjaxResult;
import com.aaa.common.utils.poi.ExcelUtil;

/**
 * 计划模板 信息操作处理
 * 
 * @author teacherChen
 * @date 2019-07-30
 */
@Controller
@RequestMapping("/system/tempInfo")
public class TempInfoController extends BaseController
{
    private String prefix = "system/tempInfo";
	
	@Autowired
	private ITempInfoService tempInfoService;
	
	@RequiresPermissions("system:tempInfo:list")
	@GetMapping()
	public String tempInfo()
	{
	    return prefix + "/tempInfo";
	}
	
	/**
	 * 查询计划模板列表
	 */
	@RequiresPermissions("system:tempInfo:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(TempInfo tempInfo)
	{
		startPage();
        List<TempInfo> list = tempInfoService.selectTempInfoList(tempInfo);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出计划模板列表
	 */
	@RequiresPermissions("system:tempInfo:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TempInfo tempInfo)
    {
    	List<TempInfo> list = tempInfoService.selectTempInfoList(tempInfo);
        ExcelUtil<TempInfo> util = new ExcelUtil<TempInfo>(TempInfo.class);
        return util.exportExcel(list, "tempInfo");
    }
	
	/**
	 * 新增计划模板
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存计划模板
	 */
	@RequiresPermissions("system:tempInfo:add")
	@Log(title = "计划模板", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(TempInfo tempInfo)
	{		
		return toAjax(tempInfoService.insertTempInfo(tempInfo));
	}

	
	/**
	 * 删除计划模板
	 */
	@RequiresPermissions("system:tempInfo:remove")
	@Log(title = "计划模板", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(tempInfoService.deleteTempInfoByIds(ids));
	}
	
}
