package com.aaa.project.system.hidInfo.service;

import com.aaa.project.system.hidInfo.domain.HidInfo;
import java.util.List;

/**
 * 隐患 服务层
 * 
 * @author teacherChen
 * @date 2019-08-07
 */
public interface IHidInfoService 
{
	/**
     * 查询隐患信息
     * 
     * @param hidId 隐患ID
     * @return 隐患信息
     */
	public HidInfo selectHidInfoById(Integer hidId);

	public List<HidInfo> findAll();
	
	/**
     * 查询隐患列表
     * 
     * @param hidInfo 隐患信息
     * @return 隐患集合
     */
	public List<HidInfo> selectHidInfoList(HidInfo hidInfo);
	
	/**
     * 新增隐患
     * 
     * @param hidInfo 隐患信息
     * @return 结果
     */
	public int insertHidInfo(HidInfo hidInfo);
	
	/**
     * 修改隐患
     * 
     * @param hidInfo 隐患信息
     * @return 结果
     */
	public int updateHidInfo(HidInfo hidInfo);
		
	/**
     * 删除隐患信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteHidInfoByIds(String ids);
	
}
