package com.aaa.project.system.betInfo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aaa.project.system.betInfo.mapper.BetInfoMapper;
import com.aaa.project.system.betInfo.domain.BetInfo;
import com.aaa.common.support.Convert;

/**
 * 资源分配 服务层实现
 * 
 * @author teacherChen
 * @date 2019-08-06
 */
@Service
public class BetInfoServiceImpl implements IBetInfoService 
{
	@Autowired
	private BetInfoMapper betInfoMapper;

	/**
     * 查询资源分配信息
     * 
     * @param resId 资源分配ID
     * @return 资源分配信息
     */
    @Override
	public BetInfo selectBetInfoById(Integer resId)
	{
	    return betInfoMapper.selectBetInfoById(resId);
	}
	
	/**
     * 查询资源分配列表
     * 
     * @param betInfo 资源分配信息
     * @return 资源分配集合
     */
	@Override
	public List<BetInfo> selectBetInfoList(BetInfo betInfo)
	{
	    return betInfoMapper.selectBetInfoList(betInfo);
	}
	
    /**
     * 新增资源分配
     * 
     * @param betInfo 资源分配信息
     * @return 结果
     */
	@Override
	public int insertBetInfo(BetInfo betInfo)
	{
	    return betInfoMapper.insertBetInfo(betInfo);
	}
	
	/**
     * 修改资源分配
     * 
     * @param betInfo 资源分配信息
     * @return 结果
     */
	@Override
	public int updateBetInfo(BetInfo betInfo)
	{
	    return betInfoMapper.updateBetInfo(betInfo);
	}

	/**
     * 删除资源分配对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteBetInfoByIds(String ids)
	{
		return betInfoMapper.deleteBetInfoByIds(Convert.toStrArray(ids));
	}
	
}
