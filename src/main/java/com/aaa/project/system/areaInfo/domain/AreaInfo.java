package com.aaa.project.system.areaInfo.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.aaa.framework.web.domain.BaseEntity;

/**
 * 地理位置表 hn_area_info
 * 
 * @author teacherChen
 * @date 2019-08-04
 */
public class AreaInfo extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Integer areaId;
	/** 城市名称 */
	private String cityname;

	public void setAreaId(Integer areaId) 
	{
		this.areaId = areaId;
	}

	public Integer getAreaId() 
	{
		return areaId;
	}
	public void setCityname(String cityname) 
	{
		this.cityname = cityname;
	}

	public String getCityname() 
	{
		return cityname;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("areaId", getAreaId())
            .append("cityname", getCityname())
            .toString();
    }
}
