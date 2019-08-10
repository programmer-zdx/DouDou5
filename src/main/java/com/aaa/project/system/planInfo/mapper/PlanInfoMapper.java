package com.aaa.project.system.planInfo.mapper;

import com.aaa.project.system.planInfo.domain.PlanInfo;
import java.util.List;	

/**
 * 计划定制 数据层
 * 
 * @author teacherChen
 * @date 2019-07-30
 */
public interface PlanInfoMapper 
{
	/**
     * 查询计划定制信息
     * 
     * @param planId 计划定制ID
     * @return 计划定制信息
     */
	public PlanInfo selectPlanInfoById(Integer planId);
	
	/**
     * 查询计划定制列表
     * 
     * @param planInfo 计划定制信息
     * @return 计划定制集合
     */
	public List<PlanInfo> selectPlanInfoList(PlanInfo planInfo);
	
	/**
     * 新增计划定制
     * 
     * @param planInfo 计划定制信息
     * @return 结果
     */
	public int insertPlanInfo(PlanInfo planInfo);

	
	/**
     * 删除计划定制
     * 
     * @param planId 计划定制ID
     * @return 结果
     */
	public int deletePlanInfoById(Integer planId);
	
	/**
     * 批量删除计划定制
     * 
     * @param planIds 需要删除的数据ID
     * @return 结果
     */
	public int deletePlanInfoByIds(String[] planIds);

	public List<PlanInfo> findPlan();

	public int updatePlanInfo(PlanInfo planInfo);
	
}