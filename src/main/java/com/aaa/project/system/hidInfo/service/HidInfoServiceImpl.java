package com.aaa.project.system.hidInfo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aaa.project.system.hidInfo.mapper.HidInfoMapper;
import com.aaa.project.system.hidInfo.domain.HidInfo;
import com.aaa.project.system.hidInfo.service.IHidInfoService;
import com.aaa.common.support.Convert;

/**
 * 隐患 服务层实现
 * 
 * @author teacherChen
 * @date 2019-08-07
 */
@Service
public class HidInfoServiceImpl implements IHidInfoService 
{
	@Autowired
	private HidInfoMapper hidInfoMapper;

	/**
     * 查询隐患信息
     * 
     * @param hidId 隐患ID
     * @return 隐患信息
     */
    @Override
	public HidInfo selectHidInfoById(Integer hidId)
	{
	    return hidInfoMapper.selectHidInfoById(hidId);
	}
	
	/**
     * 查询隐患列表
     * 
     * @param hidInfo 隐患信息
     * @return 隐患集合
     */
	@Override
	public List<HidInfo> selectHidInfoList(HidInfo hidInfo)
	{
	    return hidInfoMapper.selectHidInfoList(hidInfo);
	}
	
    /**
     * 新增隐患
     * 
     * @param hidInfo 隐患信息
     * @return 结果
     */
	@Override
	public int insertHidInfo(HidInfo hidInfo)
	{
	    return hidInfoMapper.insertHidInfo(hidInfo);
	}
	
	/**
     * 修改隐患
     * 
     * @param hidInfo 隐患信息
     * @return 结果
     */
	@Override
	public int updateHidInfo(HidInfo hidInfo)
	{
	    return hidInfoMapper.updateHidInfo(hidInfo);
	}

	/**
     * 删除隐患对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteHidInfoByIds(String ids)
	{
		return hidInfoMapper.deleteHidInfoByIds(Convert.toStrArray(ids));
	}

	public List<HidInfo> findAll(){
		return hidInfoMapper.findAll();
	}
}
