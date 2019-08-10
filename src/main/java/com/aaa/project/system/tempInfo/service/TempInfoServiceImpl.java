package com.aaa.project.system.tempInfo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aaa.project.system.tempInfo.mapper.TempInfoMapper;
import com.aaa.project.system.tempInfo.domain.TempInfo;
import com.aaa.project.system.tempInfo.service.ITempInfoService;
import com.aaa.common.support.Convert;

/**
 * 计划模板 服务层实现
 * 
 * @author teacherChen
 * @date 2019-07-30
 */
@Service
public class TempInfoServiceImpl implements ITempInfoService 
{
	@Autowired
	private TempInfoMapper tempInfoMapper;

	/**
     * 查询计划模板信息
     * 
     * @param tempId 计划模板ID
     * @return 计划模板信息
     */
    @Override
	public TempInfo selectTempInfoById(Integer tempId)
	{
	    return tempInfoMapper.selectTempInfoById(tempId);
	}
	
	/**
     * 查询计划模板列表
     * 
     * @param tempInfo 计划模板信息
     * @return 计划模板集合
     */
	@Override
	public List<TempInfo> selectTempInfoList(TempInfo tempInfo)
	{
	    return tempInfoMapper.selectTempInfoList(tempInfo);
	}
	
    /**
     * 新增计划模板
     * 
     * @param tempInfo 计划模板信息
     * @return 结果
     */
	@Override
	public int insertTempInfo(TempInfo tempInfo)
	{
	    return tempInfoMapper.insertTempInfo(tempInfo);
	}


	/**
     * 删除计划模板对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteTempInfoByIds(String ids)
	{
		return tempInfoMapper.deleteTempInfoByIds(Convert.toStrArray(ids));
	}
	
}
