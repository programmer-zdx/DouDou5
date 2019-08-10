package com.aaa.project.system.wx;

import com.aaa.framework.web.page.TableDataInfo;
import com.aaa.project.system.resInfo.domain.ResInfo;
import com.aaa.project.system.resInfo.service.IResInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/system/wx/resInfo")
public class WXResInfoController {
    @Autowired
    private IResInfoService resInfoService;

    /**
     * 查询资源列表
     */
    @PostMapping("/list")
    @ResponseBody
    public List<ResInfo> list(ResInfo resInfo)
    {
        List<ResInfo> list = resInfoService.selectResInfoList(resInfo);
        return list;
    }

    /**
     * 更改资源点状态
     */
    @PostMapping("/update")
    @ResponseBody
    public Boolean update(Integer id,String status)
    {
        ResInfo resInfo=new ResInfo();
        resInfo.setResId(id);
        resInfo.setStatus(status);
        resInfoService.updateStatus(resInfo);
        return true;
    }
}
