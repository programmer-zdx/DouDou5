package com.aaa.project.system.betInfo.controller;

import java.util.List;

import com.aaa.project.system.dept.domain.Dept;
import com.aaa.project.system.dept.service.IDeptService;
import com.aaa.project.system.resInfo.domain.ResInfo;
import com.aaa.project.system.resInfo.service.IResInfoService;
import com.aaa.project.system.user.service.IUserService;
import com.jcraft.jsch.UserInfo;
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
import com.aaa.project.system.betInfo.domain.BetInfo;
import com.aaa.project.system.betInfo.service.IBetInfoService;
import com.aaa.framework.web.controller.BaseController;
import com.aaa.framework.web.page.TableDataInfo;
import com.aaa.framework.web.domain.AjaxResult;
import com.aaa.common.utils.poi.ExcelUtil;

/**
 * 资源分配 信息操作处理
 * 
 * @author teacherChen
 * @date 2019-08-06
 */
@Controller
@RequestMapping("/system/betInfo")
public class BetInfoController extends BaseController
{
    private String prefix = "system/betInfo";
	
	@Autowired
	private IBetInfoService betInfoService;

	@Autowired
	private IResInfoService resInfoService;

	@Autowired
	private IDeptService deptService;

	
	@RequiresPermissions("system:betInfo:list")
	@GetMapping()
	public String betInfo()
	{
	    return prefix + "/betInfo";
	}
	
	/**
	 * 查询资源分配列表
	 */
	@RequiresPermissions("system:betInfo:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(BetInfo betInfo)
	{
		startPage();
        List<BetInfo> list = betInfoService.selectBetInfoList(betInfo);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出资源分配列表
	 */
	@RequiresPermissions("system:betInfo:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(BetInfo betInfo)
    {
    	List<BetInfo> list = betInfoService.selectBetInfoList(betInfo);
        ExcelUtil<BetInfo> util = new ExcelUtil<BetInfo>(BetInfo.class);
        return util.exportExcel(list, "betInfo");
    }
	
	/**
	 * 新增资源分配
	 */
	@GetMapping("/add")
	public String add(Model model)
	{
		List<ResInfo> betinfoListRes = resInfoService.selectResInfoList(null);
		model.addAttribute("betTypesRes",betinfoListRes);

		List<Dept> betinfoListDept = deptService.selectDeptInfoList(null);
		model.addAttribute("betTypesDept",betinfoListDept);

	    return prefix + "/add";
	}
	
	/**
	 * 新增保存资源分配
	 */
	@RequiresPermissions("system:betInfo:add")
	@Log(title = "资源分配", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(BetInfo betInfo)
	{		
		return toAjax(betInfoService.insertBetInfo(betInfo));
	}

	/**
	 * 修改资源分配
	 */
	@GetMapping("/edit/{resId}")
	public String edit(@PathVariable("resId") Integer resId, ModelMap mmap)
	{
		BetInfo betInfo = betInfoService.selectBetInfoById(resId);
		mmap.put("betInfo", betInfo);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存资源分配
	 */
	@RequiresPermissions("system:betInfo:edit")
	@Log(title = "资源分配", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(BetInfo betInfo)
	{		
		return toAjax(betInfoService.updateBetInfo(betInfo));
	}
	
	/**
	 * 删除资源分配
	 */
	@RequiresPermissions("system:betInfo:remove")
	@Log(title = "资源分配", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(betInfoService.deleteBetInfoByIds(ids));
	}
	
}
