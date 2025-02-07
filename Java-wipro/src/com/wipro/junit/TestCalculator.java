package com.wipro.junit;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TestCalculator {
	
	private Calculator cal;
	
	@beforeEach
	void setUp() {
		cal = new Calculator();
	}
/*	
@beforeEach
	void setUp() {
		cal = new Calculator();
	}
@test
	
	void testAddition() {
	
		assertEquals(9,cal.add(5,4));
	
}
	void Subtraction() {
	
		assertEquals(2,cal.subtract(5,3),"5-3 should be 2");
	
}

	void tearDown() {
		cal = null;
	
}
*/	
	void testDivision() {
		assertThrows(ArithmeticException.class, ()-> cal.divide(10,0),"should throw divide by zero");
		
	}
	void tearDown() {
		cal = null;
	
}

	
}
