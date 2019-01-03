package com.ms.master.formbeans;

import java.sql.Date;

public class leaveMasterbean {

	
	private Integer leaveId;
	private Integer studentRegNo;
	private Date startDate;
	private Date endDate;
	private Integer nodays;
	private String leaveType;
	private String reason;
	private Integer status=0;
	
	public Integer getLeaveId() {
		return leaveId;
	}
	public void setLeaveId(Integer leaveId) {
		this.leaveId = leaveId;
	}
	public Integer getStudentRegNo() {
		return studentRegNo;
	}
	public void setStudentRegNo(Integer studentRegNo) {
		this.studentRegNo = studentRegNo;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Integer getNodays() {
		return nodays;
	}
	public void setNodays(Integer nodays) {
		this.nodays = nodays;
	}
	public String getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
}
