package com.aaa.project.system.standardInfo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aaa.project.system.standardInfo.mapper.StandardInfoMapper;
import com.aaa.project.system.standardInfo.domain.StandardInfo;
import com.aaa.project.system.standardInfo.service.IStandardInfoService;
import com.aaa.common.support.Convert;

/**
 * 规范 服务层实现
 * 
 * @author teacherChen
 * @date 2019-08-05
 */
@Service
public class StandardInfoServiceImpl implements IStandardInfoService 
{
	@Autowired
	private StandardInfoMapper standardInfoMapper;

	/**
     * 查询规范信息
     * 
     * @param standardId 规范ID
     * @return 规范信息
     */
    @Override
	public StandardInfo selectStandardInfoById(Integer standardId)
	{
	    return standardInfoMapper.selectStandardInfoById(standardId);
	}
	
	/**
     * 查询规范列表
     * 
     * @param standardInfo 规范信息
     * @return 规范集合
     */
	@Override
	public List<StandardInfo> selectStandardInfoList(StandardInfo standardInfo)
	{
	    return standardInfoMapper.selectStandardInfoList(standardInfo);
	}
	
    /**
     * 新增规范
     * 
     * @param standardInfo 规范信息
     * @return 结果
     */
	@Override
	public int insertStandardInfo(StandardInfo standardInfo)
	{
	    return standardInfoMapper.insertStandardInfo(standardInfo);
	}
	
	/**
     * 修改规范
     * 
     * @param standardInfo 规范信息
     * @return 结果
     */
	@Override
	public int updateStandardInfo(StandardInfo standardInfo)
	{
	    return standardInfoMapper.updateStandardInfo(standardInfo);
	}

	/**
     * 删除规范对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteStandardInfoByIds(String ids)
	{
		return standardInfoMapper.deleteStandardInfoByIds(Convert.toStrArray(ids));
	}
	
}
