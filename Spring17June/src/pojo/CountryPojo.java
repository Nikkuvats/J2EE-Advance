package pojo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="country")
public class CountryPojo {
	@Id
	@GeneratedValue
	@Column(name="CountryId")
	private int CountryId;
	
	@Column(name="CountryName")
	private String CountryName;
	
	@OneToMany(fetch=FetchType.EAGER, targetEntity=StatePojo.class, mappedBy="countryPojo")
	@Fetch(FetchMode.SELECT)
	@Cascade({CascadeType.ALL})
	
	List<StatePojo> statePojo;

	public List<StatePojo> getStatePojo() {
		return statePojo;
	}

	public void setStatePojo(List<StatePojo> statePojo) {
		this.statePojo = statePojo;
	}


	public int getCountryId() {
		return CountryId;
	}

	public void setCountryId(int countryId) {
		CountryId = countryId;
	}

	public String getCountryName() {
		return CountryName;
	}

	public void setCountryName(String countryName) {
		CountryName = countryName;
	}
	
	
}
