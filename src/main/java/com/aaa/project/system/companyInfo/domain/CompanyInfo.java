package com.aaa.project.system.companyInfo.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.aaa.framework.web.domain.BaseEntity;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 代维公司表 hn_company_info
 * 
 * @author teacherChen
 * @date 2019-07-30
 */
public class CompanyInfo extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 公司编号 */
	private Integer companyId;
	/** 公司名称 */
	private String companyName;
	/** 地址 */
	private Integer areaId;


	private String cityname;

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}


	public void setCompanyId(Integer companyId)
	{
		this.companyId = companyId;
	}

	public Integer getCompanyId() 
	{
		return companyId;
	}
	public void setCompanyName(String companyName) 
	{
		this.companyName = companyName;
	}

	public String getCompanyName() 
	{
		return companyName;
	}
	public void setAreaId(Integer areaId) 
	{
		this.areaId = areaId;
	}

	public Integer getAreaId() 
	{
		return areaId;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("companyId", getCompanyId())
            .append("companyName", getCompanyName())
            .append("areaId", getAreaId())
            .toString();
    }
}
