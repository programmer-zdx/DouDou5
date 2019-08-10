package com.aaa.project.system.betInfo.service;

import com.aaa.project.system.betInfo.domain.BetInfo;
import java.util.List;

/**
 * 资源分配 服务层
 * 
 * @author teacherChen
 * @date 2019-08-06
 */
public interface IBetInfoService 
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
     * 删除资源分配信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteBetInfoByIds(String ids);
	
}
