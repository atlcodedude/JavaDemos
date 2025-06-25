/*
 * Copyright 2015-2024 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

//@TestMethodOrder(value = MethodOrderer.Random.class)
class CalculatorTests {
	private Calculator calculator = new Calculator();

//	@BeforeAll
//	public static void setUpClass() {
//		System.out.println("setUpClass: triggered by @BeforeAll annotation");
//	}
//
//	@BeforeEach
//	public void setUp() {
//		System.out.println("setUp: triggered by @BeforeEach annotation");
//	}
//
//	@Test
//	@Order(2)
//	@DisplayName("1 + 1 = 2")
//	void addsTwoNumbers() {
//		System.out.println("addsTwoNumbers: This is test 1 using @DisplayName");
//		int vResult = calculator.add(1, 1);
//		assertEquals(2, vResult, "1 + 1 should equal 2");
//	}
//
//	@Test
//	@Order(1)
//	void testAdditionDifferentNumbers() {
//		System.out.println("testAdditionDifferentNumbers: This is test 2");
//		int vResult = calculator.add(2, 1);
//		assertEquals(3, vResult, "2 + 1 should equal 3");
//	}
//
//	@ParameterizedTest(name = "{0} + {1} = {2}")
//	@Order(3)
//	@CsvSource({
//			"0,    1,   1",
//			"1,    2,   3",
//			"49,  51, 100",
//			"1,  100, 101"
//	})
//	void add(int first, int second, int expectedResult) {
//		System.out.println("add: This is test 3 using @ParameterizedTest and @CsvSource");
//		int vResult = calculator.add(first, second);
//		assertEquals(expectedResult, vResult,
//				() -> first + " + " + second + " should equal " + expectedResult);
//	}
//
//	@AfterEach
//	public void tearDown() {
//		System.out.println("tearDown: triggered by @AfterEach annotation");
//	}
}
