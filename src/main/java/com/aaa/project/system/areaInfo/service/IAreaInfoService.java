package com.aaa.project.system.areaInfo.service;

import com.aaa.project.system.areaInfo.domain.AreaInfo;
import java.util.List;

/**
 * 地理位置 服务层
 * 
 * @author teacherChen
 * @date 2019-08-04
 */
public interface IAreaInfoService 
{
	/**
     * 查询地理位置信息
     * 
     * @param areaId 地理位置ID
     * @return 地理位置信息
     */
	public AreaInfo selectAreaInfoById(Integer areaId);
	
	/**
     * 查询地理位置列表
     * 
     * @param areaInfo 地理位置信息
     * @return 地理位置集合
     */
	public List<AreaInfo> selectAreaInfoList(AreaInfo areaInfo);
	
	/**
     * 新增地理位置
     * 
     * @param areaInfo 地理位置信息
     * @return 结果
     */
	public int insertAreaInfo(AreaInfo areaInfo);
	
	/**
     * 修改地理位置
     * 
     * @param areaInfo 地理位置信息
     * @return 结果
     */
	public int updateAreaInfo(AreaInfo areaInfo);
		
	/**
     * 删除地理位置信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteAreaInfoByIds(String ids);
	
}
