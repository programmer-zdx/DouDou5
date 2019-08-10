package com.aaa.project.system.inspectInfo.mapper;

import com.aaa.project.system.inspectInfo.domain.InspectInfo;
import java.util.List;	

/**
 * 巡检人员 数据层
 * 
 * @author teacherChen
 * @date 2019-07-31
 */
public interface InspectInfoMapper 
{
	/**
	 * 手机号搜素用于展示
	 * @param phone
	 * @return
	 */
	public InspectInfo find(String phone);

	/**
	 * 更改人员信息
	 * @param inspectInfo
	 */
	public void updateInfo(InspectInfo inspectInfo);
	/**
	 * 登录验证
	 * @param phone
	 * @param password
	 * @return
	 */
	public InspectInfo selectInspectInfoToLogin(String phone, String password);

	/**
     * 查询巡检人员信息
     * 
     * @param inspectId 巡检人员ID
     * @return 巡检人员信息
     */
	public InspectInfo selectInspectInfoById(Integer inspectId);
	
	/**
     * 查询巡检人员列表
     * 
     * @param inspectInfo 巡检人员信息
     * @return 巡检人员集合
     */
	public List<InspectInfo> selectInspectInfoList(InspectInfo inspectInfo);
	
	/**
     * 新增巡检人员
     * 
     * @param inspectInfo 巡检人员信息
     * @return 结果
     */
	public int insertInspectInfo(InspectInfo inspectInfo);
	
	/**
     * 修改巡检人员
     * 
     * @param inspectInfo 巡检人员信息
     * @return 结果
     */
	public int updateInspectInfo(InspectInfo inspectInfo);
	
	/**
     * 删除巡检人员
     * 
     * @param inspectId 巡检人员ID
     * @return 结果
     */
	public int deleteInspectInfoById(Integer inspectId);
	
	/**
     * 批量删除巡检人员
     * 
     * @param inspectIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteInspectInfoByIds(String[] inspectIds);
	
}