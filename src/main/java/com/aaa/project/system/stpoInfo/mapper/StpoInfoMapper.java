package com.aaa.project.system.stpoInfo.mapper;

import com.aaa.project.system.stpoInfo.domain.StpoInfo;
import java.util.List;	

/**
 * 驻点  数据层
 * 
 * @author teacherChen
 * @date 2019-07-31
 */
public interface StpoInfoMapper 
{
	/**
     * 查询驻点 信息
     * 
     * @param stpoId 驻点 ID
     * @return 驻点 信息
     */
	public StpoInfo selectStpoInfoById(Integer stpoId);
	
	/**
     * 查询驻点 列表
     * 
     * @param stpoInfo 驻点 信息
     * @return 驻点 集合
     */
	public List<StpoInfo> selectStpoInfoList(StpoInfo stpoInfo);
	
	/**
     * 新增驻点 
     * 
     * @param stpoInfo 驻点 信息
     * @return 结果
     */
	public int insertStpoInfo(StpoInfo stpoInfo);
	
	/**
     * 修改驻点 
     * 
     * @param stpoInfo 驻点 信息
     * @return 结果
     */
	public int updateStpoInfo(StpoInfo stpoInfo);
	
	/**
     * 删除驻点 
     * 
     * @param stpoId 驻点 ID
     * @return 结果
     */
	public int deleteStpoInfoById(Integer stpoId);
	
	/**
     * 批量删除驻点 
     * 
     * @param stpoIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteStpoInfoByIds(String[] stpoIds);
	
}