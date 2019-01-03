package com.ms.master.pojos.masterpojos;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="holiday")
public class HolidayPojo {

	@Id
	@GeneratedValue
	@Column(name="HoliId")
	private Integer holiId;
	
	@Column(name="FestivalId")
	private Integer festivalId;
	
	@Column(name="HoliDate")
	private String holiDate;

	public Integer getHoliId() {
		return holiId;
	}

	public void setHoliId(Integer holiId) {
		this.holiId = holiId;
	}

	public Integer getFestivalId() {
		return festivalId;
	}

	public void setFestivalId(Integer festivalId) {
		this.festivalId = festivalId;
	}

	public String getHoliDate() {
		return holiDate;
	}

	public void setHoliDate(String holiDate) {
		this.holiDate = holiDate;
	}
}
