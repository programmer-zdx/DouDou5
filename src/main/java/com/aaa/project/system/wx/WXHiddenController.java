
package com.aaa.project.system.wx;

import com.aaa.framework.web.domain.AjaxResult;
import com.aaa.project.system.hidInfo.domain.HidInfo;
import com.aaa.project.system.hidInfo.service.IHidInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/system/wx/hidInfo")
public class WXHiddenController {
    @Autowired
    private IHidInfoService hidInfoService;

    /**
     * 隐患添加
     * @param hidInfo
     * @param time
     * @return
     */
    @PostMapping("/add")
    @ResponseBody
    public Boolean addSave(HidInfo hidInfo,String time) {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ParsePosition pos = new ParsePosition(0);
        Date strtodate = formatter.parse(time, pos);
       hidInfo.setInspectDate(strtodate);
        hidInfoService.insertHidInfo(hidInfo);
        return true;
    }

    /**
     * 查找隐患列表
     * @return
     */
    @PostMapping("/findAll")
    @ResponseBody
    public List<HidInfo> findAll() {
        List<HidInfo> hidInfosList=hidInfoService.findAll();
        return hidInfosList;
    }
}

