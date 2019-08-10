package com.aaa.project.system.inspectInfo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aaa.project.system.inspectInfo.mapper.InspectInfoMapper;
import com.aaa.project.system.inspectInfo.domain.InspectInfo;
import com.aaa.project.system.inspectInfo.service.IInspectInfoService;
import com.aaa.common.support.Convert;

/**
 * 巡检人员 服务层实现
 * 
 * @author teacherChen
 * @date 2019-07-31
 */
@Service
public class InspectInfoServiceImpl implements IInspectInfoService 
{
	@Autowired
	private InspectInfoMapper inspectInfoMapper;

	/**
	 * 登录验证
	 * @param phone
	 * @param password
	 * @return
	 */
	public InspectInfo selectInspectInfoToLogin(String phone,String password){
		return inspectInfoMapper.selectInspectInfoToLogin(phone,password);
	}
	public InspectInfo find(String phone){
		return inspectInfoMapper.find(phone);
	}
	/**
	 * 更改人员信息
	 * @param inspectInfo
	 */
	public void updateInfo(InspectInfo inspectInfo){
		inspectInfoMapper.updateInfo(inspectInfo);
	}



	/**
     * 查询巡检人员信息
     * 
     * @param inspectId 巡检人员ID
     * @return 巡检人员信息
     */
    @Override
	public InspectInfo selectInspectInfoById(Integer inspectId)
	{
	    return inspectInfoMapper.selectInspectInfoById(inspectId);
	}
	
	/**
     * 查询巡检人员列表
     * 
     * @param inspectInfo 巡检人员信息
     * @return 巡检人员集合
     */
	@Override
	public List<InspectInfo> selectInspectInfoList(InspectInfo inspectInfo)
	{
	    return inspectInfoMapper.selectInspectInfoList(inspectInfo);
	}
	
    /**
     * 新增巡检人员
     * 
     * @param inspectInfo 巡检人员信息
     * @return 结果
     */
	@Override
	public int insertInspectInfo(InspectInfo inspectInfo)
	{
	    return inspectInfoMapper.insertInspectInfo(inspectInfo);
	}
	
	/**
     * 修改巡检人员
     * 
     * @param inspectInfo 巡检人员信息
     * @return 结果
     */
	@Override
	public int updateInspectInfo(InspectInfo inspectInfo)
	{
	    return inspectInfoMapper.updateInspectInfo(inspectInfo);
	}

	/**
     * 删除巡检人员对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteInspectInfoByIds(String ids)
	{
		return inspectInfoMapper.deleteInspectInfoByIds(Convert.toStrArray(ids));
	}
	
}
