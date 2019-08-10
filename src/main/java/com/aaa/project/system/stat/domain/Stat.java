package com.aaa.project.system.stat.domain;

import com.aaa.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 统计表
 */
public class Stat extends BaseEntity
{
    /*资源id*/
	private String resId;
    /*计划id*/
	private String planId;
    /*隐患id*/
	private String hidId;

    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getHidId() {
        return hidId;
    }

    public void setHidId(String hidId) {
        this.hidId = hidId;
    }

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("resId", getResId())
            .append("planId", getPlanId())
            .append("hidId", getHidId())
            .toString();
    }
}
