package com.aaa.project.system.statInfo.service;

import com.aaa.project.system.statInfo.domain.StatInfo;
import java.util.List;

/**
 * 统计 服务层
 * 
 * @author teacherChen
 * @date 2019-08-03
 */
public interface IStatInfoService 
{
	/**
     * 查询统计信息
     * 
     * @param statId 统计ID
     * @return 统计信息
     */
	public StatInfo selectStatInfoById(Integer statId);
	
	/**
     * 查询统计列表
     * 
     * @param statInfo 统计信息
     * @return 统计集合
     */
	public List<StatInfo> selectStatInfoList(StatInfo statInfo);
	
	/**
     * 新增统计
     * 
     * @param statInfo 统计信息
     * @return 结果
     */
	public int insertStatInfo(StatInfo statInfo);
	
	/**
     * 修改统计
     * 
     * @param statInfo 统计信息
     * @return 结果
     */
	public int updateStatInfo(StatInfo statInfo);
		
	/**
     * 删除统计信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteStatInfoByIds(String ids);
	
}
