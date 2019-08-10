package com.aaa.project.system.tempInfo.service;

import com.aaa.project.system.tempInfo.domain.TempInfo;
import java.util.List;

/**
 * 计划模板 服务层
 * 
 * @author teacherChen
 * @date 2019-07-30
 */
public interface ITempInfoService 
{
	/**
     * 查询计划模板信息
     * 
     * @param tempId 计划模板ID
     * @return 计划模板信息
     */
	public TempInfo selectTempInfoById(Integer tempId);
	
	/**
     * 查询计划模板列表
     * 
     * @param tempInfo 计划模板信息
     * @return 计划模板集合
     */
	public List<TempInfo> selectTempInfoList(TempInfo tempInfo);
	
	/**
     * 新增计划模板
     * 
     * @param tempInfo 计划模板信息
     * @return 结果
     */
	public int insertTempInfo(TempInfo tempInfo);
	

		
	/**
     * 删除计划模板信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteTempInfoByIds(String ids);
	
}
