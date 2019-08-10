package com.aaa.project.system.inspectInfo.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.aaa.framework.web.domain.BaseEntity;

/**
 * 巡检人员表 hn_inspect_info
 * 
 * @author teacherChen
 * @date 2019-07-31
 */
public class InspectInfo extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 巡检人员编号 */
	private Integer inspectId;
	/** 巡检人员姓名 */
	private String inspectName;
	/** 巡检人员年龄 */
	private Integer inspectAge;
	/** 巡检人员性别 */
	private String inspectSex;
	/** 巡检人员账号 */
	private String user;
	/** 巡检人员密码 */
	private String password;
	/** 驻点id */
	private Integer stpoId;
	/** 电话 */
	private String phone;
	/**资源点名称*/
	private String stpoName;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getStpoName() {
		return stpoName;
	}

	public void setStpoName(String stpoName) {
		this.stpoName = stpoName;
	}

	public void setInspectId(Integer inspectId)
	{
		this.inspectId = inspectId;
	}

	public Integer getInspectId() 
	{
		return inspectId;
	}
	public void setInspectName(String inspectName) 
	{
		this.inspectName = inspectName;
	}

	public String getInspectName() 
	{
		return inspectName;
	}
	public void setInspectAge(Integer inspectAge) 
	{
		this.inspectAge = inspectAge;
	}

	public Integer getInspectAge() 
	{
		return inspectAge;
	}
	public void setInspectSex(String inspectSex) 
	{
		this.inspectSex = inspectSex;
	}

	public String getInspectSex() 
	{
		return inspectSex;
	}
	public void setUser(String user) 
	{
		this.user = user;
	}

	public String getUser() 
	{
		return user;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}

	public String getPassword() 
	{
		return password;
	}
	public void setStpoId(Integer stpoId) 
	{
		this.stpoId = stpoId;
	}

	public Integer getStpoId() 
	{
		return stpoId;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
				.append("inspectId", getInspectId())
				.append("inspectName", getInspectName())
				.append("inspectAge", getInspectAge())
				.append("inspectSex", getInspectSex())
				.append("user", getUser())
				.append("password", getPassword())
				.append("phone", getPhone())
				.append("stpoId", getStpoId())
				.toString();
	}
}
