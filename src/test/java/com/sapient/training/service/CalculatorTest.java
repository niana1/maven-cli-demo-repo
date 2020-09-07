package com.sapient.training.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	System.out.println("before test");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after test");
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testAddition() {
		Calculator calculator =new Calculator();
		assertEquals("Addition passed",5.0,calculator.addition(2.0, 3.0),0.01);
	}

	@Test
	public void testSubtraction() {
		Calculator calculator1 =new Calculator();
		assertEquals("sub passes",1, calculator1.subtraction(2, 1));

	}

}
