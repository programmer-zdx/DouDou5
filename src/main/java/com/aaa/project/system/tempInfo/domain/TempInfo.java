package com.aaa.project.system.tempInfo.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.aaa.framework.web.domain.BaseEntity;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 计划模板表 hn_temp_info
 * 
 * @author teacherChen
 * @date 2019-07-30
 */
public class TempInfo extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 序号 */
	private Integer tempId;
	/** 模板类型 */
	private String tempType;
	/** 规范id */
	private Integer standardId;
	/** 模板概述 */
	private String tempDescribe;
	/** 模板制作时间 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date tempTime;
    /*资源点名称*/
	private String stpo_Name;
	/*巡检项名称*/
	private String standard_name;
	/*质量标准*/
	private String standard_quality;
	/*周期*/
	private String standard_cycle;

	public void setTempId(Integer tempId)
	{
		this.tempId = tempId;
	}

	public Integer getTempId() 
	{
		return tempId;
	}
	public void setTempType(String tempType) 
	{
		this.tempType = tempType;
	}

	public String getTempType() 
	{
		return tempType;
	}
	public void setStandardId(Integer standardId) 
	{
		this.standardId = standardId;
	}

	public Integer getStandardId() 
	{
		return standardId;
	}
	public void setTempDescribe(String tempDescribe) 
	{
		this.tempDescribe = tempDescribe;
	}

	public String getTempDescribe() 
	{
		return tempDescribe;
	}
	public void setTempTime(Date tempTime) 
	{
		this.tempTime = tempTime;
	}


	public Date getTempTime() 
	{
		return tempTime;
	}


	public String getStpo_Name() {
		return stpo_Name;
	}

	public void setStpo_Name(String stpo_Name) {
		this.stpo_Name = stpo_Name;
	}


	public String getStandard_quality() {
		return standard_quality;
	}

	public void setStandard_quality(String standard_quality) {
		this.standard_quality = standard_quality;
	}

	public String getStandard_cycle() {
		return standard_cycle;
	}

	public void setStandard_cycle(String standard_cycle) {
		this.standard_cycle = standard_cycle;
	}

	public String getStandard_name() {
		return standard_name;
	}

	public void setStandard_name(String standard_name) {
		this.standard_name = standard_name;
	}




	@Override
	public String toString() {
		return "TempInfo{" +
				"tempId=" + tempId +
				", tempType='" + tempType + '\'' +
				", standardId=" + standardId +
				", tempDescribe='" + tempDescribe + '\'' +
				", tempTime=" + tempTime +
				", stpo_Name='" + stpo_Name + '\'' +
				", standard_name='" + standard_name + '\'' +
				", standard_quality='" + standard_quality + '\'' +
				", standard_cycle='" + standard_cycle + '\'' +
				'}';
	}
}
