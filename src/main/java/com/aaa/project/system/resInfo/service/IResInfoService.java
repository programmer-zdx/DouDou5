package com.aaa.project.system.resInfo.service;

import com.aaa.project.system.resInfo.domain.ResInfo;
import java.util.List;

/**
 * 资源管理 服务层
 * 
 * @author teacherChen
 * @date 2019-08-05
 */
public interface IResInfoService 
{
	/**
	 * 更新状态
	 * @param resId
	 */
	public void updateStatus(ResInfo resInfo);



	public ResInfo selectResInfoById(Integer resId);
	
	/**
     * 查询资源管理列表
     * 
     * @param resInfo 资源管理信息
     * @return 资源管理集合
     */
	public List<ResInfo> selectResInfoList(ResInfo resInfo);
	
	/**
     * 新增资源管理
     * 
     * @param resInfo 资源管理信息
     * @return 结果
     */
	public int insertResInfo(ResInfo resInfo);
	
	/**
     * 修改资源管理
     * 
     * @param resInfo 资源管理信息
     * @return 结果
     */
	public int updateResInfo(ResInfo resInfo);
		
	/**
     * 删除资源管理信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteResInfoByIds(String ids);
	
}
