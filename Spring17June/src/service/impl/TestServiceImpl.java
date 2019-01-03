package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pojo.CountryPojo;
import dao.TestDao;
import service.TestService;

public class TestServiceImpl implements TestService{
	TestDao testdao=null;

	@Autowired
	public void setTestdao(TestDao testdao) {
		System.out.println("dao object created");
		this.testdao = testdao;
	}

	@Override
	public List<CountryPojo> show() {
		// TODO Auto-generated method stub
		return testdao.show();
	}
	

}
