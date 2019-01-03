package pojo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="state")
public class StatePojo {
	@Id
	@GeneratedValue
	@Column(name="StateId")
	private int StateId;
	
	@ManyToOne()
	@JoinColumn(name="CountryId")
	private CountryPojo countryPojo;
	
	@OneToMany(fetch=FetchType.EAGER, targetEntity=CityPojo.class, mappedBy="statePojo")
	@Fetch(FetchMode.SELECT)
	@Cascade({CascadeType.ALL})
	
	List<CityPojo> cityPojo;
	
	public CountryPojo getCountryPojo() {
		return countryPojo;
	}

	public void setCountryPojo(CountryPojo countryPojo) {
		this.countryPojo = countryPojo;
	}

	public List<CityPojo> getCityPojo() {
		return cityPojo;
	}

	public void setCityPojo(List<CityPojo> cityPojo) {
		this.cityPojo = cityPojo;
	}

	@Column(name="StateName")
	private String StateName;

	public int getStateId() {
		return StateId;
	}

	public void setStateId(int stateId) {
		StateId = stateId;
	}

	public String getStateName() {
		return StateName;
	}

	public void setStateName(String stateName) {
		StateName = stateName;
	}
	
	
	

}
