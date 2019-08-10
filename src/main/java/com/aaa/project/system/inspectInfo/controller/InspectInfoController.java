package com.aaa.project.system.inspectInfo.controller;

import java.util.List;

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
import com.aaa.project.system.inspectInfo.domain.InspectInfo;
import com.aaa.project.system.inspectInfo.service.IInspectInfoService;
import com.aaa.framework.web.controller.BaseController;
import com.aaa.framework.web.page.TableDataInfo;
import com.aaa.framework.web.domain.AjaxResult;
import com.aaa.common.utils.poi.ExcelUtil;

/**
 * 巡检人员 信息操作处理
 * 
 * @author teacherChen
 * @date 2019-07-31
 */
@Controller
@RequestMapping("/system/inspectInfo")
public class InspectInfoController extends BaseController
{
    private String prefix = "system/inspectInfo";
	
	@Autowired
	private IInspectInfoService inspectInfoService;
	@Autowired
	private IStpoInfoService stpoInfoService;
	
	@RequiresPermissions("system:inspectInfo:list")
	@GetMapping()
	public String inspectInfo()
	{
	    return prefix + "/inspectInfo";
	}
	
	/**
	 * 查询巡检人员列表
	 */
	@RequiresPermissions("system:inspectInfo:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(InspectInfo inspectInfo)
	{
		startPage();
        List<InspectInfo> list = inspectInfoService.selectInspectInfoList(inspectInfo);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出巡检人员列表
	 */
	@RequiresPermissions("system:inspectInfo:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(InspectInfo inspectInfo)
    {
    	List<InspectInfo> list = inspectInfoService.selectInspectInfoList(inspectInfo);
        ExcelUtil<InspectInfo> util = new ExcelUtil<InspectInfo>(InspectInfo.class);
        return util.exportExcel(list, "inspectInfo");
    }

	/**
	 * 新增巡检人员
	 */
	@GetMapping("/add")
	public String add(Model model)
	{
		List<StpoInfo> stpoId=stpoInfoService.selectStpoInfoList(null);
		Model stpoIds = model.addAttribute("stpoIds", stpoId);
		//System.out.println(stpoIds);
		return prefix + "/add";
	}
	
	/**
	 * 新增保存巡检人员
	 */
	@RequiresPermissions("system:inspectInfo:add")
	@Log(title = "巡检人员", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(InspectInfo inspectInfo)
	{		
		return toAjax(inspectInfoService.insertInspectInfo(inspectInfo));
	}

	/**
	 * 修改巡检人员
	 */
	@GetMapping("/edit/{inspectId}")
	public String edit(@PathVariable("inspectId") Integer inspectId, ModelMap mmap, Model model)
	{
		List<StpoInfo> stpoId=stpoInfoService.selectStpoInfoList(null);
		model.addAttribute("stpoIds", stpoId);
		InspectInfo inspectInfo = inspectInfoService.selectInspectInfoById(inspectId);
		mmap.put("inspectInfo", inspectInfo);
		return prefix + "/edit";
	}
	
	/**
	 * 修改保存巡检人员
	 */
	@RequiresPermissions("system:inspectInfo:edit")
	@Log(title = "巡检人员", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(InspectInfo inspectInfo)
	{		
		return toAjax(inspectInfoService.updateInspectInfo(inspectInfo));
	}
	
	/**
	 * 删除巡检人员
	 */
	@RequiresPermissions("system:inspectInfo:remove")
	@Log(title = "巡检人员", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(inspectInfoService.deleteInspectInfoByIds(ids));
	}
	
}
