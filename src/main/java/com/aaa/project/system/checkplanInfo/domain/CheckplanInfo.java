package com.aaa.project.system.checkplanInfo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.aaa.framework.web.domain.BaseEntity;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 审核表 hn_checkplan_info
 * 
 * @author teacherChen
 * @date 2019-08-01
 */
public class CheckplanInfo extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 序号 */
	private Integer checkId;
	/** 审核时间 */
	private Date checkTime;
	/** 审核结果 */
	private String checkReasons;
	/** 计划编号 */
	private Integer planId;

	private String plan_name;

	private String siteName;

	private String stpo_name;

	private String stpo_address;
	/** 计划名称 */
	private String planName;
	/** 站点id */
	private Integer resId;
	/** 驻点id */
	private Integer stpoId;
	/** 起始时间 */
	@JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")//从javabean到js
	@DateTimeFormat(pattern="yyyy-MM-dd")//form表单到javabean
	private Date starttime;
	/** 结束时间 */
	@JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")//从javabean到js
	@DateTimeFormat(pattern="yyyy-MM-dd")//form表单到javabean
	private Date endtime;
	/** 审核结果 */
	private String planState;
	/** 模板id */
	private Integer templateId;
	/*模板类型*/
	private String temp_type;
	private String sitename;
	/*审核结果*/
	private String check_reasons;
	/*巡检项名称*/
	private String standard_name;
	/*质量标注*/
	private String standard_quality;
	/*周期*/
	private String standard_cycle;
	/*站点经纬度*/
	private String longandlat;

	private String dept_name;

	private String deptName;

	private String phone;

	private String email;

	private String checkResult;

	private Integer deptId;

	private String tempType;

	private Integer tempId;

	private Integer dept_id;

	private String checkState;

	private String planResult;

	private Integer plan_id;

	public Integer getPlan_id() {
		return plan_id;
	}

	public void setPlan_id(Integer plan_id) {
		this.plan_id = plan_id;
	}

	public String getPlanResult() {
		return planResult;
	}

	public void setPlanResult(String planResult) {
		this.planResult = planResult;
	}

	public String getCheckState() {
		return checkState;
	}

	public void setCheckState(String checkState) {
		this.checkState = checkState;
	}

	public Integer getCheckId() {
		return checkId;
	}

	public void setCheckId(Integer checkId) {
		this.checkId = checkId;
	}

	public void setCheckTime(Date checkTime)
	{
		this.checkTime = checkTime;
	}

	public Date getCheckTime() 
	{
		return checkTime;
	}
	public void setCheckReasons(String checkReasons) 
	{
		this.checkReasons = checkReasons;
	}

	public String getCheckReasons() 
	{
		return checkReasons;
	}
	public void setPlanId(Integer planId) 
	{
		this.planId = planId;
	}

	public Integer getPlanId() 
	{
		return planId;
	}

	public String getPlan_name() {
		return plan_name;
	}

	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public String getStpo_name() {
		return stpo_name;
	}

	public void setStpo_name(String stpo_name) {
		this.stpo_name = stpo_name;
	}

	public String getStpo_address() {
		return stpo_address;
	}

	public void setStpo_address(String stpo_address) {
		this.stpo_address = stpo_address;
	}

	public Date getStarttime() {
		return starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public String getStandard_name() {
		return standard_name;
	}

	public void setStandard_name(String standard_name) {
		this.standard_name = standard_name;
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

	public String getTemp_type() {
		return temp_type;
	}

	public void setTemp_type(String temp_type) {
		this.temp_type = temp_type;
	}

	public String getPlanState() {
		return planState;
	}

	public void setPlanState(String planState) {
		this.planState = planState;
	}

	public String getLongandlat() {
		return longandlat;
	}

	public void setLongandlat(String longandlat) {
		this.longandlat = longandlat;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public Integer getResId() {
		return resId;
	}

	public void setResId(Integer resId) {
		this.resId = resId;
	}

	public Integer getStpoId() {
		return stpoId;
	}

	public void setStpoId(Integer stpoId) {
		this.stpoId = stpoId;
	}

	public Integer getTemplateId() {
		return templateId;
	}

	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
	}

	public String getSitename() {
		return sitename;
	}

	public void setSitename(String sitename) {
		this.sitename = sitename;
	}

	public String getCheck_reasons() {
		return check_reasons;
	}

	public void setCheck_reasons(String check_reasons) {
		this.check_reasons = check_reasons;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCheckResult() {
		return checkResult;
	}

	public void setCheckResult(String checkResult) {
		this.checkResult = checkResult;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getTempType() {
		return tempType;
	}

	public void setTempType(String tempType) {
		this.tempType = tempType;
	}

	public Integer getTempId() {
		return tempId;
	}

	public void setTempId(Integer tempId) {
		this.tempId = tempId;
	}

	public Integer getDept_id() {
		return dept_id;
	}

	public void setDept_id(Integer dept_id) {
		this.dept_id = dept_id;
	}

	@Override
	public String toString() {
		return "CheckplanInfo{" +
				"checkId=" + checkId +
				", checkTime=" + checkTime +
				", checkReasons='" + checkReasons + '\'' +
				", planId=" + planId +
				", plan_name='" + plan_name + '\'' +
				", siteName='" + siteName + '\'' +
				", stpo_name='" + stpo_name + '\'' +
				", stpo_address='" + stpo_address + '\'' +
				", planName='" + planName + '\'' +
				", resId=" + resId +
				", stpoId=" + stpoId +
				", starttime=" + starttime +
				", endtime=" + endtime +
				", planState='" + planState + '\'' +
				", templateId=" + templateId +
				", temp_type='" + temp_type + '\'' +
				", sitename='" + sitename + '\'' +
				", check_reasons='" + check_reasons + '\'' +
				", standard_name='" + standard_name + '\'' +
				", standard_quality='" + standard_quality + '\'' +
				", standard_cycle='" + standard_cycle + '\'' +
				", longandlat='" + longandlat + '\'' +
				", dept_name='" + dept_name + '\'' +
				", deptName='" + deptName + '\'' +
				", phone='" + phone + '\'' +
				", email='" + email + '\'' +
				", checkResult='" + checkResult + '\'' +
				", deptId=" + deptId +
				", tempType='" + tempType + '\'' +
				", tempId=" + tempId +
				", dept_id=" + dept_id +
				", checkState='" + checkState + '\'' +
				", planResult='" + planResult + '\'' +
				", plan_id=" + plan_id +
				'}';
	}
}
