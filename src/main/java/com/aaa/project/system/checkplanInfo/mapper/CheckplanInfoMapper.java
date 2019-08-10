package com.aaa.project.system.checkplanInfo.mapper;

import com.aaa.project.system.checkplanInfo.domain.CheckplanInfo;
import java.util.List;	

/**
 * 审核 数据层
 * 
 * @author teacherChen
 * @date 2019-08-01
 */
public interface CheckplanInfoMapper 
{
	/**
     * 查询审核信息
     * 
     * @param checkId 审核ID
     * @return 审核信息
     */
	public CheckplanInfo selectCheckplanInfoById(Integer checkId);
	
	/**
     * 查询审核列表
     * 
     * @param checkplanInfo 审核信息
     * @return 审核集合
     */
	public List<CheckplanInfo> selectCheckplanInfoList(CheckplanInfo checkplanInfo);
	
	/**
     * 新增审核
     * 
     * @param checkplanInfo 审核信息
     * @return 结果
     */
	public int insertCheckplanInfo(CheckplanInfo checkplanInfo);
	
	/**
     * 修改审核
     * 
     * @param checkplanInfo 审核信息
     * @return 结果
     */
	public int updateCheckplanInfo(CheckplanInfo checkplanInfo);
	
	/**
     * 删除审核
     * 
     * @param checkId 审核ID
     * @return 结果
     */
	public int deleteCheckplanInfoById(Integer checkId);
	
	/**
     * 批量删除审核
     * 
     * @param checkIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteCheckplanInfoByIds(String[] checkIds);
	
}