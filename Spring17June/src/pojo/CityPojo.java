package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="city")
public class CityPojo {
	@Id
	@GeneratedValue
	@Column(name="CityId")
	private int CityId;
		
	@ManyToOne()
	@JoinColumn(name="StateId")
	private StatePojo statePojo;
	
	
	public StatePojo getStatePojo() {
		return statePojo;
	}

	public void setStatePojo(StatePojo statePojo) {
		this.statePojo = statePojo;
	}

	@Column(name="CityName")
	private String CityName;

	public int getCityId() {
		return CityId;
	}

	public void setCityId(int cityId) {
		CityId = cityId;
	}


	public String getCityName() {
		return CityName;
	}

	public void setCityName(String cityName) {
		CityName = cityName;
	}
	
	

}
