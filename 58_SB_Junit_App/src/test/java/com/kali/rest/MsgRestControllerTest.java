package com.kali.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.kali.service.MsgService;

@WebMvcTest(controllers = MsgRestController.class)
public class MsgRestControllerTest {
	
	@MockBean
	private MsgService msgService;
	
	@Autowired
	private MockMvc mockMvc; //MockMvc is used to send http request to our rest controller
	
	@Test
	public void testGreetMsg() throws Exception {
		
		//define mock obj behaviour
		when(msgService.getGreetMsg()).thenReturn("Dummy Text");
		
		//to send the request to rest controller method, we can use MockMvcRequestBuilders
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/greet");
		
		//once we build the requestBuilders, we can use MockMvc object to send request
		MvcResult mvcResult = mockMvc.perform(requestBuilder).andReturn();
		
		MockHttpServletResponse response = mvcResult.getResponse();
		
		int actualStatusCode = response.getStatus();
		
		int expectedStatusCode=200;
		
		assertEquals(expectedStatusCode, actualStatusCode);
	}
	
	@Test
	public void testWelcome() throws Exception {
		
		//define mock behavior
		when(msgService.getWelcomeMsg()).thenReturn("Good Afternoon...!");
		
		//create http request to access our rest controller method
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/welcome");
		
		//sending http request
		MvcResult mvcResult = mockMvc.perform(requestBuilder).andReturn();
			
		//get response
		MockHttpServletResponse response = mvcResult.getResponse();
		
		//validate response
		String actualResp = response.getContentAsString();
		
		assertEquals("GOOD AFTERNOON...!", actualResp);
	}

}
