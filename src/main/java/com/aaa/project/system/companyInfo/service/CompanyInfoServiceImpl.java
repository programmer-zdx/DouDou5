package com.aaa.project.system.companyInfo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aaa.project.system.companyInfo.mapper.CompanyInfoMapper;
import com.aaa.project.system.companyInfo.domain.CompanyInfo;
import com.aaa.project.system.companyInfo.service.ICompanyInfoService;
import com.aaa.common.support.Convert;

/**
 * 代维公司 服务层实现
 * 
 * @author teacherChen
 * @date 2019-07-30
 */
@Service
public class CompanyInfoServiceImpl implements ICompanyInfoService 
{
	@Autowired
	private CompanyInfoMapper companyInfoMapper;

	/**
     * 查询代维公司信息
     * 
     * @param companyId 代维公司ID
     * @return 代维公司信息
     */
    @Override
	public CompanyInfo selectCompanyInfoById(Integer companyId)
	{
	    return companyInfoMapper.selectCompanyInfoById(companyId);
	}
	
	/**
     * 查询代维公司列表
     * 
     * @param companyInfo 代维公司信息
     * @return 代维公司集合
     */
	@Override
	public List<CompanyInfo> selectCompanyInfoList(CompanyInfo companyInfo)
	{
	    return companyInfoMapper.selectCompanyInfoList(companyInfo);
	}
	
    /**
     * 新增代维公司
     * 
     * @param companyInfo 代维公司信息
     * @return 结果
     */
	@Override
	public int insertCompanyInfo(CompanyInfo companyInfo)
	{
	    return companyInfoMapper.insertCompanyInfo(companyInfo);
	}
	
	/**
     * 修改代维公司
     * 
     * @param companyInfo 代维公司信息
     * @return 结果
     */
	@Override
	public int updateCompanyInfo(CompanyInfo companyInfo)
	{
	    return companyInfoMapper.updateCompanyInfo(companyInfo);
	}

	/**
     * 删除代维公司对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteCompanyInfoByIds(String ids)
	{
		return companyInfoMapper.deleteCompanyInfoByIds(Convert.toStrArray(ids));
	}
	
}
