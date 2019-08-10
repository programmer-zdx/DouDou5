package com.aaa.project.system.planInfo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.aaa.framework.web.domain.BaseEntity;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 计划定制表 hn_plan_info
 * 
 * @author teacherChen
 * @date 2019-07-30
 */
public class PlanInfo extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 计划id */
	private  Integer planId;
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
	/** 审核结果id */
	private Integer checkId;
	/** 模板id */
	private Integer templateId;
   /*模板类型*/
	private String temp_type;
   /*驻点名称*/
	private String stpo_name;
   /*站点名称*/
	private String sitename;
    /*审核结果*/
	private String check_reasons;
    /*巡检项名称*/
    private String standard_name;
	/*质量标注*/
	private String standard_quality;
	/*周期*/
	private String standard_cycle;
	/*驻点地址*/
	private String stpo_address;
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

	private String checkReasons;

	private String checkState;

	public String getCheckState() {
		return checkState;
	}

	public void setCheckState(String checkState) {
		this.checkState = checkState;
	}

	public String getCheckReasons() {
		return checkReasons;
	}

	public void setCheckReasons(String checkReasons) {
		this.checkReasons = checkReasons;
	}

	public Integer getDept_id() {
		return dept_id;
	}

	public void setDept_id(Integer dept_id) {
		this.dept_id = dept_id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Integer getTempId() {
		return tempId;
	}

	public void setTempId(Integer tempId) {
		this.tempId = tempId;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getCheckResult() {
		return checkResult;
	}

	public void setCheckResult(String checkResult) {
		this.checkResult = checkResult;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
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

	public String getTempType() {
		return tempType;
	}

	public void setTempType(String tempType) {
		this.tempType = tempType;
	}

	public void setPlanId(Integer planId)
	{
		this.planId = planId;
	}

	public Integer getPlanId() 
	{
		return planId;
	}
	public void setPlanName(String planName) 
	{
		this.planName = planName;
	}

	public String getPlanName() 
	{
		return planName;
	}
	public void setResId(Integer resId) 
	{
		this.resId = resId;
	}

	public Integer getResId() 
	{
		return resId;
	}
	public void setStpoId(Integer stpoId) 
	{
		this.stpoId = stpoId;
	}

	public Integer getStpoId() 
	{
		return stpoId;
	}
	public void setStarttime(Date starttime) 
	{
		this.starttime = starttime;
	}

	public Date getStarttime() 
	{
		return starttime;
	}
	public void setEndtime(Date endtime) 
	{
		this.endtime = endtime;
	}

	public Date getEndtime() 
	{
		return endtime;
	}
	public void setPlanState(String planState) 
	{
		this.planState = planState;
	}

	public String getPlanState() 
	{
		return planState;
	}
	public void setCheckId(Integer checkId) 
	{
		this.checkId = checkId;
	}

	public Integer getCheckId() 
	{
		return checkId;
	}
	public void setTemplateId(Integer templateId) 
	{
		this.templateId = templateId;
	}

	public Integer getTemplateId() 
	{
		return templateId;
	}

	public String getTemp_type() {
		return temp_type;
	}

	public void setTemp_type(String temp_type) {
		this.temp_type = temp_type;
	}

	public String getStpo_name() {
		return stpo_name;
	}

	public void setStpo_name(String stpo_name) {
		this.stpo_name = stpo_name;
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

	public String getStpo_address() {
		return stpo_address;
	}

	public void setStpo_address(String stpo_address) {
		this.stpo_address = stpo_address;
	}

	public String getLongandlat() {
		return longandlat;
	}

	public void setLongandlat(String longandlat) {
		this.longandlat = longandlat;
	}


	@Override
	public String toString() {
		return "PlanInfo{" +
				"planId=" + planId +
				", planName='" + planName + '\'' +
				", resId=" + resId +
				", stpoId=" + stpoId +
				", starttime=" + starttime +
				", endtime=" + endtime +
				", planState='" + planState + '\'' +
				", checkId=" + checkId +
				", templateId=" + templateId +
				", temp_type='" + temp_type + '\'' +
				", stpo_name='" + stpo_name + '\'' +
				", sitename='" + sitename + '\'' +
				", check_reasons='" + check_reasons + '\'' +
				", standard_name='" + standard_name + '\'' +
				", standard_quality='" + standard_quality + '\'' +
				", standard_cycle='" + standard_cycle + '\'' +
				", stpo_address='" + stpo_address + '\'' +
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
				", checkReasons='" + checkReasons + '\'' +
				", checkState='" + checkState + '\'' +
				'}';
	}
}

