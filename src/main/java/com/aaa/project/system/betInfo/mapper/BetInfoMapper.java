package com.aaa.project.system.betInfo.mapper;

import com.aaa.project.system.betInfo.domain.BetInfo;
import java.util.List;	

/**
 * 资源分配 数据层
 * 
 * @author teacherChen
 * @date 2019-08-06
 */
public interface BetInfoMapper 
{
	/**
     * 查询资源分配信息
     * 
     * @param resId 资源分配ID
     * @return 资源分配信息
     */
	public BetInfo selectBetInfoById(Integer resId);
	
	/**
     * 查询资源分配列表
     * 
     * @param betInfo 资源分配信息
     * @return 资源分配集合
     */
	public List<BetInfo> selectBetInfoList(BetInfo betInfo);
	
	/**
     * 新增资源分配
     * 
     * @param betInfo 资源分配信息
     * @return 结果
     */
	public int insertBetInfo(BetInfo betInfo);
	
	/**
     * 修改资源分配
     * 
     * @param betInfo 资源分配信息
     * @return 结果
     */
	public int updateBetInfo(BetInfo betInfo);
	
	/**
     * 删除资源分配
     * 
     * @param resId 资源分配ID
     * @return 结果
     */
	public int deleteBetInfoById(Integer resId);
	
	/**
     * 批量删除资源分配
     * 
     * @param resIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteBetInfoByIds(String[] resIds);
	
}