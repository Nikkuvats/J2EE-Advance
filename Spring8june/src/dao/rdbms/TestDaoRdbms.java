package dao.rdbms;


import javax.sql.DataSource;

import org.apache.commons.collections.map.HashedMap;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.TestDao;

public class TestDaoRdbms implements TestDao{
	
	private DataSource dataSource = null;
	private SessionFactory sessionFactory = null;
	private HibernateTemplate hibernateTemplate = null;
	private NamedParameterJdbcTemplate jdbcTemplate = null;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		System.out.println("data source created");
		jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
		this.dataSource = dataSource;
	}



	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		System.out.println("session factory created");
		hibernateTemplate = new HibernateTemplate(sessionFactory);
		this.sessionFactory = sessionFactory;
	}



	@Override
	public String Test() {
		// TODO Auto-generated method stub
		jdbcTemplate.update("insert into test values(102,'Pradeep','Mishra','9 June')", new HashedMap());
		return "This is dao layer method";
	}

}
