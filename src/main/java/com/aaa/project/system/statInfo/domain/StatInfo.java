package com.aaa.project.system.statInfo.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.aaa.framework.web.domain.BaseEntity;

/**
 * 统计表 hn_stat_info
 * 
 * @author teacherChen
 * @date 2019-08-03
 */
public class StatInfo extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	/** 统计编号 */
	private Integer statId;
	/** 代维公司编号 */
	private Integer companyId;
	/** 驻点编号 */
	private Integer stpoId;
	/** 完成情况 */
	private String type;
	/** 所属代维公司名称*/
	private String companyName;
	/** 驻点名称 */
	private String stpoName;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getStpoName() {
		return stpoName;
	}

	public void setStpoName(String stpoName) {
		this.stpoName = stpoName;
	}

	public void setStatId(Integer statId)
	{
		this.statId = statId;
	}

	public Integer getStatId() 
	{
		return statId;
	}
	public void setCompanyId(Integer companyId) 
	{
		this.companyId = companyId;
	}

	public Integer getCompanyId() 
	{
		return companyId;
	}
	public void setStpoId(Integer stpoId) 
	{
		this.stpoId = stpoId;
	}

	public Integer getStpoId() 
	{
		return stpoId;
	}
	public void setType(String type) 
	{
		this.type = type;
	}

	public String getType() 
	{
		return type;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("statId", getStatId())
            .append("companyId", getCompanyId())
            .append("stpoId", getStpoId())
            .append("type", getType())
            .toString();
    }
}
