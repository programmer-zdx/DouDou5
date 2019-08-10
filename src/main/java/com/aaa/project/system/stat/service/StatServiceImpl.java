package com.aaa.project.system.stat.service;

import com.aaa.project.system.stat.mapper.StatMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 统计 服务层实现
 * 
 * @author teacherChen
 * @date 2019-08-03
 */
@Service
public class StatServiceImpl implements IStatService {
    @Autowired
    private StatMapper statMapper;

    /*查询统计*/
    @Override
    public Map selectStat() {
        return statMapper.selectStat();
    }
}
