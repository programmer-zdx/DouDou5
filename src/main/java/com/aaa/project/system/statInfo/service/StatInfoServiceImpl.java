package com.aaa.project.system.statInfo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aaa.project.system.statInfo.mapper.StatInfoMapper;
import com.aaa.project.system.statInfo.domain.StatInfo;
import com.aaa.project.system.statInfo.service.IStatInfoService;
import com.aaa.common.support.Convert;

/**
 * 统计 服务层实现
 * 
 * @author teacherChen
 * @date 2019-08-03
 */
@Service
public class StatInfoServiceImpl implements IStatInfoService 
{
	@Autowired
	private StatInfoMapper statInfoMapper;

	/**
     * 查询统计信息
     * 
     * @param statId 统计ID
     * @return 统计信息
     */
    @Override
	public StatInfo selectStatInfoById(Integer statId)
	{
	    return statInfoMapper.selectStatInfoById(statId);
	}
	
	/**
     * 查询统计列表
     * 
     * @param statInfo 统计信息
     * @return 统计集合
     */
	@Override
	public List<StatInfo> selectStatInfoList(StatInfo statInfo)
	{
	    return statInfoMapper.selectStatInfoList(statInfo);
	}
	
    /**
     * 新增统计
     * 
     * @param statInfo 统计信息
     * @return 结果
     */
	@Override
	public int insertStatInfo(StatInfo statInfo)
	{
	    return statInfoMapper.insertStatInfo(statInfo);
	}
	
	/**
     * 修改统计
     * 
     * @param statInfo 统计信息
     * @return 结果
     */
	@Override
	public int updateStatInfo(StatInfo statInfo)
	{
	    return statInfoMapper.updateStatInfo(statInfo);
	}

	/**
     * 删除统计对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteStatInfoByIds(String ids)
	{
		return statInfoMapper.deleteStatInfoByIds(Convert.toStrArray(ids));
	}
	
}
