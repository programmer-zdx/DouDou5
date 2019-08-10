package com.aaa.project.system.areaInfo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aaa.project.system.areaInfo.mapper.AreaInfoMapper;
import com.aaa.project.system.areaInfo.domain.AreaInfo;
import com.aaa.project.system.areaInfo.service.IAreaInfoService;
import com.aaa.common.support.Convert;

/**
 * 地理位置 服务层实现
 * 
 * @author teacherChen
 * @date 2019-08-04
 */
@Service
public class AreaInfoServiceImpl implements IAreaInfoService 
{
	@Autowired
	private AreaInfoMapper areaInfoMapper;

	/**
     * 查询地理位置信息
     * 
     * @param areaId 地理位置ID
     * @return 地理位置信息
     */
    @Override
	public AreaInfo selectAreaInfoById(Integer areaId)
	{
	    return areaInfoMapper.selectAreaInfoById(areaId);
	}
	
	/**
     * 查询地理位置列表
     * 
     * @param areaInfo 地理位置信息
     * @return 地理位置集合
     */
	@Override
	public List<AreaInfo> selectAreaInfoList(AreaInfo areaInfo)
	{
	    return areaInfoMapper.selectAreaInfoList(areaInfo);
	}
	
    /**
     * 新增地理位置
     * 
     * @param areaInfo 地理位置信息
     * @return 结果
     */
	@Override
	public int insertAreaInfo(AreaInfo areaInfo)
	{
	    return areaInfoMapper.insertAreaInfo(areaInfo);
	}
	
	/**
     * 修改地理位置
     * 
     * @param areaInfo 地理位置信息
     * @return 结果
     */
	@Override
	public int updateAreaInfo(AreaInfo areaInfo)
	{
	    return areaInfoMapper.updateAreaInfo(areaInfo);
	}

	/**
     * 删除地理位置对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteAreaInfoByIds(String ids)
	{
		return areaInfoMapper.deleteAreaInfoByIds(Convert.toStrArray(ids));
	}
	
}
