package com.ms.master.pojos.masterpojos;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="leavemaster")
public class leaveMasterPojo 
{
	@Id
	@GeneratedValue
	
	@Column(name="LeaveId")
	private Integer leaveId;
	
	@Column(name="StudentRegNo")
	private Integer studentRegNo;
	
	@Column(name="Date")
	private java.util.Date date;
	
	@Column(name="StratDate")
	private Date stratDate;
	
	@Column(name="EndDate")
	private Date endDate;
	
	@Column(name="NOD")
	private Integer nodays;
	
	@Column(name="LeaveType")
	private String leaveType;
	
	@Column(name="Reason")
	private String reason;
	
	@Column(name="Status")
	private Integer status;

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

	public java.util.Date getDate() {
		return date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}
    
	public Date getStratDate() {
		return stratDate;
	}

	public void setStratDate(Date stratDate) {
		this.stratDate = stratDate;
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
