package com.ms.master.service;

import javax.servlet.http.HttpSession;

public interface EmpService {
	
	public boolean secureLogin(String StudentName, Integer StudentIds, HttpSession session);

	
}
