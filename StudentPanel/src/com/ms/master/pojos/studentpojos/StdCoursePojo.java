package com.ms.master.pojos.studentpojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.ms.master.pojos.profilepojos.CourseMasterPojo;

@Entity
@Table(name="stdcoursemaster")
public class StdCoursePojo implements Serializable{

	private static final long serialVersionUID = 9073489671763081228L;
	
	@Id
	@GeneratedValue
	@Column(name="StdCourseId")
	private Integer stdCourseId;

	@Column(name="studentRegNo")
	private Integer studentRegNo;

	@Column(name="CourseId")
	private Integer courseId;
	
	@ManyToOne
	@JoinColumn(name="CourseId",insertable=false,updatable=false)
	private CourseMasterPojo course;

	public Integer getStdCourseId() {
		return stdCourseId;
	}

	public void setStdCourseId(Integer stdCourseId) {
		this.stdCourseId = stdCourseId;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public CourseMasterPojo getCourse() {
		return course;
	}

	public void setCourse(CourseMasterPojo course) {
		this.course = course;
	}
	
	/*@ManyToOne
	@JoinColumn(name="studentRegNo",insertable=false,updatable=false)
	private StudentRegPojo stdRegPojo;*/

	/*public StudentRegPojo getStdRegPojo() {
		return stdRegPojo;
	}

	public void setStdRegPojo(StudentRegPojo stdRegPojo) {
		this.stdRegPojo = stdRegPojo;
	}
*/  
	
		
}
