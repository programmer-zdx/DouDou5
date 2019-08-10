package com.aaa.project.system.stpoInfo.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.aaa.framework.web.domain.BaseEntity;

/**
 * 驻点 表 hn_stpo_info
 * 
 * @author teacherChen
 * @date 2019-07-31
 */
public class StpoInfo extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 驻点编号 */
	private Integer stpoId;
	/** 驻点名称 */
	private String stpoName;
	/** 驻点位置 */
	private String stpoAddress;
	/** 所属代维公司id */
	private Integer companyId;
	/** 巡检人员 */
	private Integer inspectId;
	/** 所属代维公司名称*/
	private String companyName;
	/** 巡检人员姓名 */
	private String inspectName;

	private   Integer plan_id;

	private Integer stpo_id;

	private String sitename;

	public String getInspectName() {
		return inspectName;
	}

	public void setInspectName(String inspectName) {
		this.inspectName = inspectName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setStpoId(Integer stpoId)
	{
		this.stpoId = stpoId;
	}

	public Integer getStpoId()
	{
	    /*stpoId >= 1000;*/

	    return stpoId;
	}

	public void setStpoName(String stpoName)
	{
		this.stpoName = stpoName;
	}

	public String getStpoName() 
	{
		return stpoName;
	}
	public void setStpoAddress(String stpoAddress) 
	{
		this.stpoAddress = stpoAddress;
	}

	public String getStpoAddress() 
	{
		return stpoAddress;
	}
	public void setCompanyId(Integer companyId) 
	{
		this.companyId = companyId;
	}

	public Integer getCompanyId() 
	{
		return companyId;
	}
	public void setInspectId(Integer inspectId) 
	{
		this.inspectId = inspectId;
	}

	public Integer getInspectId() 
	{
		return inspectId;
	}

	public Integer getPlan_id() {
		return plan_id;
	}

	public void setPlan_id(Integer plan_id) {
		this.plan_id = plan_id;
	}

	public Integer getStpo_id() {
		return stpo_id;
	}

	public void setStpo_id(Integer stpo_id) {
		this.stpo_id = stpo_id;
	}

	public String getSitename() {
		return sitename;
	}

	public void setSitename(String sitename) {
		this.sitename = sitename;
	}

	@Override
	public String toString() {
		return "StpoInfo{" +
				"stpoId=" + stpoId +
				", stpoName='" + stpoName + '\'' +
				", stpoAddress='" + stpoAddress + '\'' +
				", companyId=" + companyId +
				", inspectId=" + inspectId +
				", companyName='" + companyName + '\'' +
				", inspectName='" + inspectName + '\'' +
				", plan_id=" + plan_id +
				", stpo_id=" + stpo_id +
				", sitename='" + sitename + '\'' +
				'}';
	}
}
