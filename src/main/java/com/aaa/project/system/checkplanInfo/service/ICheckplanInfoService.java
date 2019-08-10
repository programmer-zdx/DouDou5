package com.aaa.project.system.checkplanInfo.service;

import com.aaa.project.system.checkplanInfo.domain.CheckplanInfo;
import java.util.List;

/**
 * 审核 服务层
 * 
 * @author teacherChen
 * @date 2019-08-01
 */
public interface ICheckplanInfoService 
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
     * 删除审核信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteCheckplanInfoByIds(String ids);
	
}
