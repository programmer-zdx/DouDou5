package com.aaa.project.system.wx;

import com.aaa.framework.web.controller.BaseController;
import com.aaa.framework.web.page.TableDataInfo;
import com.aaa.project.system.inspectInfo.domain.InspectInfo;
import com.aaa.project.system.inspectInfo.service.IInspectInfoService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/system/wx/inspectInfo")
public class WXInspectInfoController extends BaseController {
    @Autowired
    private IInspectInfoService inspectInfoService;

    /**
     * 登录验证
     * @param phone
     * @param password
     * @return
     */
    @PostMapping("/login")
    @ResponseBody
    public Boolean login(String phone,String password)
    {
        InspectInfo inspectInfo=inspectInfoService.selectInspectInfoToLogin(phone,password);
        if(inspectInfo != null){
            return true;
        }
        return false;
    }

    /**
     * 手机号查找巡检人员
     * @param phone
     * @return
     */
    @PostMapping("/find")
    @ResponseBody
    public InspectInfo find(String phone)
    {
        InspectInfo inspectInfo=inspectInfoService.find(phone);
        return inspectInfo;
    }

    /**
     * 更新巡检人员信息
     * @param password
     * @param phone
     * @param id
     * @return
     */
    @PostMapping("/update")
    @ResponseBody
    public Boolean update(String password,String phone,Integer id)
    {
        InspectInfo inspectInfo=new InspectInfo();
        inspectInfo.setInspectId(id);
        inspectInfo.setPassword(password);
        inspectInfo.setPhone(phone);
        inspectInfoService.updateInfo(inspectInfo);
        return true;
    }
}
