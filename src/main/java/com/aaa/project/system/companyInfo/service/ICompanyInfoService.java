package com.aaa.project.system.companyInfo.service;

import com.aaa.project.system.companyInfo.domain.CompanyInfo;
import java.util.List;

/**
 * 代维公司 服务层
 * 
 * @author teacherChen
 * @date 2019-07-30
 */
public interface ICompanyInfoService 
{
	/**
     * 查询代维公司信息
     * 
     * @param companyId 代维公司ID
     * @return 代维公司信息
     */
	public CompanyInfo selectCompanyInfoById(Integer companyId);
	
	/**
     * 查询代维公司列表
     * 
     * @param companyInfo 代维公司信息
     * @return 代维公司集合
     */
	public List<CompanyInfo> selectCompanyInfoList(CompanyInfo companyInfo);
	
	/**
     * 新增代维公司
     * 
     * @param companyInfo 代维公司信息
     * @return 结果
     */
	public int insertCompanyInfo(CompanyInfo companyInfo);
	
	/**
     * 修改代维公司
     * 
     * @param companyInfo 代维公司信息
     * @return 结果
     */
	public int updateCompanyInfo(CompanyInfo companyInfo);
		
	/**
     * 删除代维公司信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteCompanyInfoByIds(String ids);
	
}
