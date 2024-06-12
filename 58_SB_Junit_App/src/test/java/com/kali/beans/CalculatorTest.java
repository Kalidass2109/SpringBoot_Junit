package com.kali.beans;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	@Test
	public void addTest() {
		Calculator c=new Calculator();
		
		int actualResult = c.add(10, 20);
		int expectedResult=30;
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void mulTest() {
		Calculator c=new Calculator();
		
		int actualResult = c.mul(2, 2);
		int expectedResult=4;
		
		assertEquals(expectedResult, actualResult);
	}

}
