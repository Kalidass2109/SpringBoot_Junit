package com.kali.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kali.dao.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public String getUserName(Integer uid) {
		String findName = userDao.findName(uid);
		System.out.println("Name : "+findName);
		return findName;
	}
}
