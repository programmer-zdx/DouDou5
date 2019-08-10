package com.aaa.project.system.resInfo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aaa.project.system.resInfo.mapper.ResInfoMapper;
import com.aaa.project.system.resInfo.domain.ResInfo;
import com.aaa.project.system.resInfo.service.IResInfoService;
import com.aaa.common.support.Convert;

/**
 * 资源管理 服务层实现
 * 
 * @author teacherChen
 * @date 2019-08-05
 */
@Service
public class ResInfoServiceImpl implements IResInfoService 
{
	@Autowired
	private ResInfoMapper resInfoMapper;

	/**
     * 查询资源管理信息
     * 
     * @param resId 资源管理ID
     * @return 资源管理信息
     */
    @Override
	public ResInfo selectResInfoById(Integer resId)
	{
	    return resInfoMapper.selectResInfoById(resId);
	}
	
	/**
     * 查询资源管理列表
     * 
     * @param resInfo 资源管理信息
     * @return 资源管理集合
     */
	@Override
	public List<ResInfo> selectResInfoList(ResInfo resInfo)
	{
	    return resInfoMapper.selectResInfoList(resInfo);
	}
	
    /**
     * 新增资源管理
     * 
     * @param resInfo 资源管理信息
     * @return 结果
     */
	@Override
	public int insertResInfo(ResInfo resInfo)
	{
	    return resInfoMapper.insertResInfo(resInfo);
	}
	
	/**
     * 修改资源管理
     * 
     * @param resInfo 资源管理信息
     * @return 结果
     */
	@Override
	public int updateResInfo(ResInfo resInfo)
	{
	    return resInfoMapper.updateResInfo(resInfo);
	}

	/**
     * 删除资源管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteResInfoByIds(String ids)
	{
		return resInfoMapper.deleteResInfoByIds(Convert.toStrArray(ids));
	}

	/**
	 * 更新状态
	 * @param resId
	 */
	public void updateStatus(ResInfo resInfo){
		resInfoMapper.updateStatus(resInfo);
	}
}
