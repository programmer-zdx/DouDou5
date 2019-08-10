package com.aaa.project.system.hidInfo.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.aaa.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 隐患表 hn_hid_info
 * 
 * @author teacherChen
 * @date 2019-08-07
 */
public class HidInfo extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 隐患编号 */
	private Integer hidId;
	/** 计划id */
	private Integer planId;
	/** 资源编号 */
	private Integer resId;
	/** 隐患描述 */
	private String hidDescribe;
	/** 站点名 */
	private String deptId;
	/** 严重程度 */
	private String degree;
	/** 巡检人员编号 */
	private String inspectId;
	/** 巡检日期 */
	private Date inspectDate;
	/** 上传图片 */
	private Integer pId;
	/** 巡检内容 */
	private String hidCont;
	/** 状态 */
	private String status;

	/** 计划名字*/
	private String planName;

	/** 资源名字*/
	private String sitename;

	/** 驻点名字*/
	private String deptName;

	/** 人员名字*/
	private String userName;

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}



	public void setHidId(Integer hidId)
	{
		this.hidId = hidId;
	}

	public Integer getHidId() 
	{
		return hidId;
	}
	public void setPlanId(Integer planId) 
	{
		this.planId = planId;
	}

	public Integer getPlanId() 
	{
		return planId;
	}
	public void setResId(Integer resId) 
	{
		this.resId = resId;
	}

	public Integer getResId() 
	{
		return resId;
	}
	public void setHidDescribe(String hidDescribe) 
	{
		this.hidDescribe = hidDescribe;
	}

	public String getHidDescribe() 
	{
		return hidDescribe;
	}
	public void setDeptId(String deptId) 
	{
		this.deptId = deptId;
	}

	public String getDeptId() 
	{
		return deptId;
	}
	public void setDegree(String degree) 
	{
		this.degree = degree;
	}

	public String getDegree() 
	{
		return degree;
	}
	public void setInspectId(String inspectId) 
	{
		this.inspectId = inspectId;
	}

	public String getInspectId() 
	{
		return inspectId;
	}
	public void setInspectDate(Date inspectDate) 
	{
		this.inspectDate = inspectDate;
	}

	public Date getInspectDate() 
	{
		return inspectDate;
	}
	public void setPId(Integer pId) 
	{
		this.pId = pId;
	}

	public Integer getPId() 
	{
		return pId;
	}
	public void setHidCont(String hidCont) 
	{
		this.hidCont = hidCont;
	}

	public String getHidCont() 
	{
		return hidCont;
	}
	public void setStatus(String status) 
	{
		this.status = status;
	}

	public String getStatus() 
	{
		return status;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("hidId", getHidId())
            .append("planId", getPlanId())
            .append("resId", getResId())
            .append("hidDescribe", getHidDescribe())
            .append("deptId", getDeptId())
            .append("degree", getDegree())
            .append("inspectId", getInspectId())
            .append("inspectDate", getInspectDate())
            .append("pId", getPId())
            .append("hidCont", getHidCont())
            .append("status", getStatus())
            .toString();
    }
}
