package services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import dao.TestDao;
import services.TestService;

public class TestServiceImpl implements TestService{
	TestDao testDao = null;
	
	@Autowired
	public void setTestDao(TestDao testDao) {
		System.out.println("dao Object created");
		this.testDao = testDao;
	}

	@Override
	public String Test() {
		return testDao.Test();
	}
}

