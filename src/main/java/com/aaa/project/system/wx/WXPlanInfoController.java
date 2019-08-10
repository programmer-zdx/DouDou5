package com.aaa.project.system.wx;

import com.aaa.framework.web.controller.BaseController;
import com.aaa.project.system.planInfo.domain.PlanInfo;
import com.aaa.project.system.planInfo.service.IPlanInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/system/wx/planInfo")
public class WXPlanInfoController extends BaseController {
    @Autowired
    private IPlanInfoService planInfoService;

    /**
     * 寻找计划列表
     * @param planInfo
     * @param aa
     * @return
     */
    @PostMapping("/list")
    @ResponseBody
    public List<PlanInfo> list(PlanInfo planInfo, String aa) {
        System.out.println(aa);
        List<PlanInfo> list = planInfoService.selectPlanInfoList(planInfo);
        return list;
    }
}

