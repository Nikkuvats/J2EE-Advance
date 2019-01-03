package dao.rdbms;

import java.util.List;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.orm.hibernate3.HibernateTemplate;

import pojo.CityPojo;
import pojo.CountryPojo;
import pojo.StatePojo;
import dao.TestDao;

public class TestDaoRdbms implements TestDao{
	private DataSource dataSource = null;
	private HibernateTemplate hibernateTemplate = null;
	private SessionFactory sessionFactory = null;
	private NamedParameterJdbcTemplate jdbcTemplate = null;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
		System.out.println("datasouce create");
		this.dataSource = dataSource;
	}
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		hibernateTemplate = new HibernateTemplate(sessionFactory);
		System.out.println("session factory create");
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<CountryPojo> show() {
		// TODO Auto-generated method stub
		DetachedCriteria criteria = DetachedCriteria.forClass(CountryPojo.class);
		List<CountryPojo> country = hibernateTemplate.findByCriteria(criteria);
		for(CountryPojo pojo:country)
		{
			System.out.println(pojo.getCountryName());
			for(StatePojo pojo1:pojo.getStatePojo())
			{
				System.out.println("    "+pojo1.getStateName());
				for(CityPojo pojo2:pojo1.getCityPojo())
				{
					System.out.println("      "+pojo2.getCityName());
				}
			}
		}
		
		return null;
	}
	
	

}
