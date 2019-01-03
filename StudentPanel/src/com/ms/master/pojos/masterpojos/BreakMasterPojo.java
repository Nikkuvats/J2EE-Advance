package com.ms.master.pojos.masterpojos;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="breakmaster")
public class BreakMasterPojo {

	@Id
	@GeneratedValue
	
	@Column(name="BreakId")
	private Integer breakId;
	
	@Column(name="StudentRegNo")
	private Integer studentRegNo;
	
	@Column(name="StartDate")
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

	public Integer getBreakId() {
		return breakId;
	}

	public void setBreakId(Integer breakId) {
		this.breakId = breakId;
	}

	public Integer getStudentRegNo() {
		return studentRegNo;
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

	public void setStudentRegNo(Integer studentRegNo) {
		this.studentRegNo = studentRegNo;
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
