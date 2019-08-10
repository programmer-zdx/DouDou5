package com.aaa.project.system.checkplanInfo.controller;

import java.util.List;

import com.aaa.project.system.dept.service.IDeptService;
import com.aaa.project.system.planInfo.domain.PlanInfo;
import com.aaa.project.system.planInfo.service.IPlanInfoService;
import com.aaa.project.system.resInfo.service.IResInfoService;
import com.aaa.project.system.tempInfo.service.ITempInfoService;
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
import com.aaa.project.system.checkplanInfo.domain.CheckplanInfo;
import com.aaa.project.system.checkplanInfo.service.ICheckplanInfoService;
import com.aaa.framework.web.controller.BaseController;
import com.aaa.framework.web.page.TableDataInfo;
import com.aaa.framework.web.domain.AjaxResult;
import com.aaa.common.utils.poi.ExcelUtil;

/**
 * 审核 信息操作处理
 * 
 * @author teacherChen
 * @date 2019-08-01
 */
@Controller
@RequestMapping("/system/checkplanInfo")
public class CheckplanInfoController extends BaseController
{
    private String prefix = "system/checkplanInfo";
	
	@Autowired
	private ICheckplanInfoService checkplanInfoService;
@Autowired
private IPlanInfoService planInfoService;



	@Autowired
	private IResInfoService resInfoService;

	@Autowired
	private ITempInfoService tempInfoService;

	@Autowired
	private IDeptService deptService;
	
	@RequiresPermissions("system:checkplanInfo:list")
	@GetMapping()
	public String checkplanInfo()
	{
	    return prefix + "/checkplanInfo";
	}
	
	/**
	 * 查询审核列表
	 */
	@RequiresPermissions("system:checkplanInfo:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(/*CheckplanInfo checkplanInfo*/ PlanInfo planInfo)
	{
		startPage();
//        List<CheckplanInfo> list = checkplanInfoService.selectCheckplanInfoList(checkplanInfo);
		List<PlanInfo> list = planInfoService.selectPlanInfoList(planInfo);
		return getDataTable(list);
	}


	/**
	 * 修改审核
	 */
	@GetMapping("/edit/{planId}")
	public String edit(@PathVariable("planId") Integer planId, ModelMap mmap)
	{
       // CheckplanInfo checkplanInfo = checkplanInfoService.selectCheckplanInfoById(planId);
		PlanInfo planInfo = planInfoService.selectPlanInfoById(planId);
		mmap.put("planInfo", planInfo);
		//mmap.put("checkplanInfo",checkplanInfo);

	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存审核
	 */
	@RequiresPermissions("system:checkplanInfo:edit")
	@Log(title = "审核", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(PlanInfo planInfo)
	{
		//checkplanInfoService.updateCheckplanInfo(checkplanInfo);
		planInfoService.updatePlanInfo(planInfo);

	//return toAjax(checkplanInfoService.updateCheckplanInfo(checkplanInfo));
   return  toAjax(planInfoService.updatePlanInfo(planInfo));
	}
	
	/**
	 * 删除审核
	 */
	@RequiresPermissions("system:checkplanInfo:remove")
	@Log(title = "审核", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(planInfoService.deletePlanInfoByIds(ids));
	}
	
}


