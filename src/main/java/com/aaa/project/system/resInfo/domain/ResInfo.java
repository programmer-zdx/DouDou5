package com.aaa.project.system.resInfo.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.aaa.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 资源管理表 hn_res_info
 * 
 * @author teacherChen
 * @date 2019-08-05
 */
public class ResInfo extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 资源编号 */
	private Integer resId;
	/** 资源点编号 */
	private String resSernum;
	/** 站点名称 */
	private String sitename;
	/** 资源所在市 */
	private String areaCity;
	/** 经纬度 */
	private String longandlat;
	/** 入网时间 */
	private Date resContinue;
	/** 分配状态 */
	private String resState;
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setResId(Integer resId)
	{
		this.resId = resId;
	}

	public Integer getResId() 
	{
		return resId;
	}
	public void setResSernum(String resSernum) 
	{
		this.resSernum = resSernum;
	}

	public String getResSernum() 
	{
		return resSernum;
	}
	public void setSitename(String sitename) 
	{
		this.sitename = sitename;
	}

	public String getSitename() 
	{
		return sitename;
	}
	public void setAreaCity(String areaCity) 
	{
		this.areaCity = areaCity;
	}

	public String getAreaCity() 
	{
		return areaCity;
	}
	public void setLongandlat(String longandlat) 
	{
		this.longandlat = longandlat;
	}

	public String getLongandlat() 
	{
		return longandlat;
	}
	public void setResContinue(Date resContinue) 
	{
		this.resContinue = resContinue;
	}

	public Date getResContinue() 
	{
		return resContinue;
	}
	public void setResState(String resState) 
	{
		this.resState = resState;
	}

	public String getResState() 
	{
		return resState;
	}

	@Override
	public String toString() {
		return "ResInfo{" +
			"resId=" + resId +
			", resSernum='" + resSernum + '\'' +
			", sitename='" + sitename + '\'' +
			", areaCity='" + areaCity + '\'' +
			", longandlat='" + longandlat + '\'' +
			", resContinue=" + resContinue +
			", resState='" + resState + '\'' +
			", status='" + status + '\'' +
			'}';
	}
}
