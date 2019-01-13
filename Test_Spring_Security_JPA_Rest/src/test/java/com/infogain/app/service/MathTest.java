package com.infogain.app.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathTest {

	private Math math = new Math();
	int a = 5;
	int b = 10;
	int c = 0;

	@BeforeClass
	public static void setUp1() throws Exception {
		System.out.println("before class");
	}

	@Before
	public void setUp() throws Exception {
		c = 0;
		System.out.println("before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after");
	}

	@AfterClass
	public static void tearDown1() throws Exception {
		System.out.println("afterclass ");
	}

	@Test
	public void testSum() {
		int a = 5;
		int b = 10;
		int c = math.sum(a, b);
		assertEquals("sum fail,since output mismatch", 15, c);
	}

	@Test
	public void testSub() {
		fail("Not yet implemented");
	}

}
