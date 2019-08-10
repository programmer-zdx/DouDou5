package com.aaa.project.system.checkplanInfo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aaa.project.system.checkplanInfo.mapper.CheckplanInfoMapper;
import com.aaa.project.system.checkplanInfo.domain.CheckplanInfo;
import com.aaa.project.system.checkplanInfo.service.ICheckplanInfoService;
import com.aaa.common.support.Convert;

/**
 * 审核 服务层实现
 * 
 * @author teacherChen
 * @date 2019-08-01
 */
@Service
public class CheckplanInfoServiceImpl implements ICheckplanInfoService 
{
	@Autowired
	private CheckplanInfoMapper checkplanInfoMapper;

	/**
     * 查询审核信息
     * 
     * @param checkId 审核ID
     * @return 审核信息
     */
    @Override
	public CheckplanInfo selectCheckplanInfoById(Integer checkId)
	{
	    return checkplanInfoMapper.selectCheckplanInfoById(checkId);
	}
	
	/**
     * 查询审核列表
     * 
     * @param checkplanInfo 审核信息
     * @return 审核集合
     */
	@Override
	public List<CheckplanInfo> selectCheckplanInfoList(CheckplanInfo checkplanInfo)
	{
	    return checkplanInfoMapper.selectCheckplanInfoList(checkplanInfo);
	}
	
    /**
     * 新增审核
     * 
     * @param checkplanInfo 审核信息
     * @return 结果
     */
	@Override
	public int insertCheckplanInfo(CheckplanInfo checkplanInfo)
	{
	    return checkplanInfoMapper.insertCheckplanInfo(checkplanInfo);
	}
	
	/**
     * 修改审核
     * 
     * @param checkplanInfo 审核信息
     * @return 结果
     */
	@Override
	public int updateCheckplanInfo(CheckplanInfo checkplanInfo)
	{
	    return checkplanInfoMapper.updateCheckplanInfo(checkplanInfo);
	}

	/**
     * 删除审核对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteCheckplanInfoByIds(String ids)
	{
		return checkplanInfoMapper.deleteCheckplanInfoByIds(Convert.toStrArray(ids));
	}
	
}
