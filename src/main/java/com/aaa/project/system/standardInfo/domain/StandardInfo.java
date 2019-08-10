package com.aaa.project.system.standardInfo.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.aaa.framework.web.domain.BaseEntity;

/**
 * 规范表 hn_standard_info
 * 
 * @author teacherChen
 * @date 2019-08-05
 */
public class StandardInfo extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 规范序号 */
	private Integer standardId;
	/** 驻点id */
	private Integer stpoId;
	/** 巡检项名称 */
	private String standardName;
	/** 质量标准 */
	private String standardQuality;
	/** 巡检周期 */
	private String standardCycle;

	public void setStandardId(Integer standardId) 
	{
		this.standardId = standardId;
	}

	public Integer getStandardId() 
	{
		return standardId;
	}
	public void setStpoId(Integer stpoId) 
	{
		this.stpoId = stpoId;
	}

	public Integer getStpoId() 
	{
		return stpoId;
	}
	public void setStandardName(String standardName) 
	{
		this.standardName = standardName;
	}

	public String getStandardName() 
	{
		return standardName;
	}
	public void setStandardQuality(String standardQuality) 
	{
		this.standardQuality = standardQuality;
	}

	public String getStandardQuality() 
	{
		return standardQuality;
	}
	public void setStandardCycle(String standardCycle) 
	{
		this.standardCycle = standardCycle;
	}

	public String getStandardCycle() 
	{
		return standardCycle;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("standardId", getStandardId())
            .append("stpoId", getStpoId())
            .append("standardName", getStandardName())
            .append("standardQuality", getStandardQuality())
            .append("standardCycle", getStandardCycle())
            .toString();
    }
}
