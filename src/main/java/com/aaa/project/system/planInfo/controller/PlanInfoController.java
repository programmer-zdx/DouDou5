package com.aaa.project.system.planInfo.controller;

import java.util.List;

import com.aaa.project.system.dept.domain.Dept;
import com.aaa.project.system.dept.service.IDeptService;
import com.aaa.project.system.resInfo.domain.ResInfo;
import com.aaa.project.system.resInfo.service.IResInfoService;
import com.aaa.project.system.stpoInfo.domain.StpoInfo;
import com.aaa.project.system.stpoInfo.service.IStpoInfoService;
import com.aaa.project.system.tempInfo.domain.TempInfo;
import com.aaa.project.system.tempInfo.service.ITempInfoService;
import com.sun.org.apache.xpath.internal.operations.Mod;
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
import com.aaa.project.system.planInfo.domain.PlanInfo;
import com.aaa.project.system.planInfo.service.IPlanInfoService;
import com.aaa.framework.web.controller.BaseController;
import com.aaa.framework.web.page.TableDataInfo;
import com.aaa.framework.web.domain.AjaxResult;
import com.aaa.common.utils.poi.ExcelUtil;

/**
 * 计划定制 信息操作处理
 * 
 * @author teacherChen
 * @date 2019-07-30
 */
@Controller
@RequestMapping("/system/planInfo")
public class PlanInfoController extends BaseController
{
    private String prefix = "system/planInfo";
	
	@Autowired
	private IPlanInfoService planInfoService;



	@Autowired
	private IResInfoService resInfoService;

	@Autowired
	private ITempInfoService tempInfoService;

	@Autowired
	private IDeptService deptService;

	@RequiresPermissions("system:planInfo:list")
	@GetMapping()
	public String planInfo()
	{
	    return prefix + "/planInfo";
	}
	
	/**
	 * 查询计划定制列表
	 */
	@RequiresPermissions("system:planInfo:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(PlanInfo planInfo)
	{

		startPage();
        List<PlanInfo> list = planInfoService.selectPlanInfoList(planInfo);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出计划定制列表
	 */
	@RequiresPermissions("system:planInfo:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(PlanInfo planInfo)
    {
    	List<PlanInfo> list = planInfoService.selectPlanInfoList(planInfo);
        ExcelUtil<PlanInfo> util = new ExcelUtil<PlanInfo>(PlanInfo.class);
        return util.exportExcel(list, "planInfo");
    }
	
	/**
	 * 新增计划定制
	 */
	@GetMapping("/add")
    public String add(Model model,TempInfo tempInfo)
    {
    	List<ResInfo>  resInfoList = resInfoService.selectResInfoList(null);
    	List<TempInfo> tempInfoList = tempInfoService.selectTempInfoList(null);
		List<Dept> planinfoListDept = deptService.selectDeptInfoList(null);


		tempInfoService.selectTempInfoList(tempInfo);



		model.addAttribute("planTypesDept",planinfoListDept);
		model.addAttribute("planress",resInfoList);
		model.addAttribute("plantemps",tempInfoList);
        return prefix + "/add";
    }
	
	/**
	 * 新增保存计划定制
	 */
	/*@RequiresPermissions("system:planInfo:add")*/
	@Log(title = "计划定制", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(PlanInfo planInfo,Dept dept,ResInfo resInfo,TempInfo tempInfo) {

		return toAjax(planInfoService.insertPlanInfo(planInfo));
	}

    /**
     * 修改计划定制
     */
    @GetMapping("/edit/{planId}")
    public String edit(@PathVariable("planId") Integer planId, ModelMap mmap,Model model)
    {
        List<ResInfo> resInfoList = resInfoService.selectResInfoList(null);
        List<TempInfo> tempInfoList = tempInfoService.selectTempInfoList(null);
        List<Dept> planinfoListDept = deptService.selectDeptInfoList(null);

        model.addAttribute("planTypesDept",planinfoListDept);
        model.addAttribute("planress",resInfoList);
        model.addAttribute("plantemps",tempInfoList);

        PlanInfo planInfo = planInfoService.selectPlanInfoById(planId);
        mmap.put("planInfo", planInfo);
        return prefix + "/edit";
    }

    /**
     * 修改保存计划定制
     */
    @RequiresPermissions("system:planInfo:edit")
    @Log(title = "计划定制", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(PlanInfo planInfo)
    {
        return toAjax(planInfoService.updatePlanInfo(planInfo));
    }


	/**
	 * 删除计划定制
	 */
	@RequiresPermissions("system:planInfo:remove")
	@Log(title = "计划定制", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(planInfoService.deletePlanInfoByIds(ids));
	}
	
}
