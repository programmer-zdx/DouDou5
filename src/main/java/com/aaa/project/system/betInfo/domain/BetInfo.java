package com.aaa.project.system.betInfo.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.aaa.framework.web.domain.BaseEntity;

/**
 * 资源分配表 hn_bet_info
 * 
 * @author teacherChen
 * @date 2019-08-06
 */
public class BetInfo extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 资源id */
	private Integer resId;
	/** 驻点id */
	private Integer deptId;
	/** 状态 */
	private String resState;

	/** 资源编号*/
	private String resSernum;

	/** 资源名*/
	private String sitename;
	/** 驻点名*/
	private String deptName;

	public String getSitename() {
		return sitename;
	}

	public void setSitename(String sitename) {
		this.sitename = sitename;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getResSernum() {
		return resSernum;
	}

	public void setResSernum(String resSernum) {
		this.resSernum = resSernum;
	}

	public void setResId(Integer resId)
	{
		this.resId = resId;
	}

	public Integer getResId() 
	{
		return resId;
	}
	public void setDeptId(Integer deptId) 
	{
		this.deptId = deptId;
	}

	public Integer getDeptId() 
	{
		return deptId;
	}
	public void setResState(String resState) 
	{
		this.resState = resState;
	}

	public String getResState() 
	{
		return resState;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("resId", getResId())
            .append("deptId", getDeptId())
            .append("resState", getResState())
			.append("resSernum", getResSernum())
			.append("deptName", getDeptName())
			.append("sitename", getSitename())
			.toString();
    }
}
