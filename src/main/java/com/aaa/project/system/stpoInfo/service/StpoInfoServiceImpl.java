package com.aaa.project.system.stpoInfo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aaa.project.system.stpoInfo.mapper.StpoInfoMapper;
import com.aaa.project.system.stpoInfo.domain.StpoInfo;
import com.aaa.project.system.stpoInfo.service.IStpoInfoService;
import com.aaa.common.support.Convert;

/**
 * 驻点  服务层实现
 * 
 * @author teacherChen
 * @date 2019-07-31
 */
@Service
public class StpoInfoServiceImpl implements IStpoInfoService 
{
	@Autowired
	private StpoInfoMapper stpoInfoMapper;

	/**
     * 查询驻点 信息
     * 
     * @param stpoId 驻点 ID
     * @return 驻点 信息
     */
    @Override
	public StpoInfo selectStpoInfoById(Integer stpoId)
	{
	    return stpoInfoMapper.selectStpoInfoById(stpoId);
	}
	
	/**
     * 查询驻点 列表
     * 
     * @param stpoInfo 驻点 信息
     * @return 驻点 集合
     */
	@Override
	public List<StpoInfo> selectStpoInfoList(StpoInfo stpoInfo)
	{
	    return stpoInfoMapper.selectStpoInfoList(stpoInfo);
	}
	
    /**
     * 新增驻点 
     * 
     * @param stpoInfo 驻点 信息
     * @return 结果
     */
	@Override
	public int insertStpoInfo(StpoInfo stpoInfo)
	{
	    return stpoInfoMapper.insertStpoInfo(stpoInfo);
	}
	
	/**
     * 修改驻点 
     * 
     * @param stpoInfo 驻点 信息
     * @return 结果
     */
	@Override
	public int updateStpoInfo(StpoInfo stpoInfo)
	{
	    return stpoInfoMapper.updateStpoInfo(stpoInfo);
	}

	/**
     * 删除驻点 对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteStpoInfoByIds(String ids)
	{
		return stpoInfoMapper.deleteStpoInfoByIds(Convert.toStrArray(ids));
	}
	
}
