package com.kali.service;

import org.springframework.stereotype.Service;

@Service
public class MsgService {
	
	public String getWelcomeMsg() {
		String msg="Welcome to Programming";
		return msg;
	}
	
	public String getGreetMsg() {
		String msg="Good Evening...!!";
		return msg;
	}

}
