package com.aaa.project.system.standardInfo.mapper;

import com.aaa.project.system.standardInfo.domain.StandardInfo;
import java.util.List;	

/**
 * 规范 数据层
 * 
 * @author teacherChen
 * @date 2019-08-05
 */
public interface StandardInfoMapper 
{
	/**
     * 查询规范信息
     * 
     * @param standardId 规范ID
     * @return 规范信息
     */
	public StandardInfo selectStandardInfoById(Integer standardId);
	
	/**
     * 查询规范列表
     * 
     * @param standardInfo 规范信息
     * @return 规范集合
     */
	public List<StandardInfo> selectStandardInfoList(StandardInfo standardInfo);
	
	/**
     * 新增规范
     * 
     * @param standardInfo 规范信息
     * @return 结果
     */
	public int insertStandardInfo(StandardInfo standardInfo);
	
	/**
     * 修改规范
     * 
     * @param standardInfo 规范信息
     * @return 结果
     */
	public int updateStandardInfo(StandardInfo standardInfo);
	
	/**
     * 删除规范
     * 
     * @param standardId 规范ID
     * @return 结果
     */
	public int deleteStandardInfoById(Integer standardId);
	
	/**
     * 批量删除规范
     * 
     * @param standardIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteStandardInfoByIds(String[] standardIds);
	
}