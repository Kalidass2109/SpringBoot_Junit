package com.kali.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.kali.dao.UserDao;

@SpringBootTest
@ExtendWith(value = {MockitoExtension.class})// mock beans will be injected into our target with the help of injectMocks
public class UserServiceTest {

	@MockBean //it used to create mock object for the dao
	private UserDao userDao;
	
	@InjectMocks //this used to represents as mock object should inserted into our target class
	private UserService userService;
	
	@Test
	public void testGetUsername() {
		when(userDao.findName(101)).thenReturn("Kalidass");
		String userName = userService.getUserName(101);
		assertEquals("Kalidass", userName);
	}
	
	
}
