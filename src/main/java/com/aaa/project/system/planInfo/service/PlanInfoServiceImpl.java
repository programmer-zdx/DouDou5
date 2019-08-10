package com.aaa.project.system.planInfo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aaa.project.system.planInfo.mapper.PlanInfoMapper;
import com.aaa.project.system.planInfo.domain.PlanInfo;
import com.aaa.project.system.planInfo.service.IPlanInfoService;
import com.aaa.common.support.Convert;

/**
 * 计划定制 服务层实现
 * 
 * @author teacherChen
 * @date 2019-08-07
 */
@Service
public class PlanInfoServiceImpl implements IPlanInfoService 
{
	@Autowired
	private PlanInfoMapper planInfoMapper;

	/**
     * 查询计划定制信息
     * 
     * @param planId 计划定制ID
     * @return 计划定制信息
     */
    @Override
	public PlanInfo selectPlanInfoById(Integer planId)
	{
	    return planInfoMapper.selectPlanInfoById(planId);
	}
	
	/**
     * 查询计划定制列表
     * 
     * @param planInfo 计划定制信息
     * @return 计划定制集合
     */
	@Override
	public List<PlanInfo> selectPlanInfoList(PlanInfo planInfo)
	{
	    return planInfoMapper.selectPlanInfoList(planInfo);
	}
	
    /**
     * 新增计划定制
     * 
     * @param planInfo 计划定制信息
     * @return 结果
     */
	@Override
	public int insertPlanInfo(PlanInfo planInfo)
	{
	    return planInfoMapper.insertPlanInfo(planInfo);
	}
	
	/**
     * 修改计划定制
     * 
     * @param planInfo 计划定制信息
     * @return 结果
     */
	@Override
	public int updatePlanInfo(PlanInfo planInfo)
	{
	    return planInfoMapper.updatePlanInfo(planInfo);
	}


	/**
     * 删除计划定制对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deletePlanInfoByIds(String ids)
	{
		return planInfoMapper.deletePlanInfoByIds(Convert.toStrArray(ids));
	}

	public List<PlanInfo> findPlan( ){
		return planInfoMapper.findPlan();
	}
}
