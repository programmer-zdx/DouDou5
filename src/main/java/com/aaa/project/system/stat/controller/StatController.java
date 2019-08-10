package com.aaa.project.system.stat.controller;

import com.aaa.framework.web.controller.BaseController;
import com.aaa.project.system.stat.service.IStatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * 首页统计表
 */
@Controller
@RequestMapping("main")
public class StatController extends BaseController
{
    private String prefix = "main";
	
	@Autowired
	private IStatService statService;

	/**
	 * 统计查询
	 * @return
	 */
	@RequestMapping("statList")
	@ResponseBody
	public Map selectStat(){
		return statService.selectStat();
	}

	
}
