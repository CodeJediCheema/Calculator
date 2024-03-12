package project.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void twoPlusTwoEqualsFour() {
		
		Calculator c = new Calculator();
		
		int expectedResult = 4;
		int actualResult = c.add(2, 2);
		
		assertEquals(expectedResult, actualResult);
		
	}
	
	@Test
	public void threePlusSevenEqualsTen() {
		var c = new Calculator();
		
		int expectedResult = 10;
		int actualResult = c.add(3, 7);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	
	public void tenMinusTwoEqualsEight() {
		var c = new Calculator();
		
		int expectedResult = 8;
		int actualResult = c.subtract(10, 2);
		
		assertEquals(expectedResult, actualResult);
		
	}
	
	@Test	
	public void negativeTenMinusTenEqualsNegtiveTwenty() {
		var c = new Calculator();
		int expectedResult = -20;
		int actualResult = c.subtract(-10, 10);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void negativeSixMinusNegativeElevenEqualsFive() {
		var c = new Calculator();
		int expectedResult = 5;
		int actualResult = c.subtract(-6, -11);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void threeTimesFourNotEqualsTwelve() {
		var c = new Calculator();
		int expectedResult = 13;
		int actualResult = c.multiply(3, 4);
		
		assertNotEquals(expectedResult, actualResult);
		
	}
	
	@Test
	public void fiftyTimesSixEqualsThreeHundred() {
		var c = new Calculator();
		int expectedResult = 300;
		int actualResult = c.multiply(50, 6);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void negativeSevenTimesFourEqualsNegativeTwentyEight() {
		var c = new Calculator();
		
		int expectedResult = -28;
		int actualResult = c.multiply(-7, 4);
		
		assertEquals(expectedResult, actualResult);
	}
	

	@Test
	public void tenByTwoEqualsFive() {
		var c = new Calculator();
		float expectedResult = 5.0f;
		float actualResult = c.divide(10, 2);
		
		//assert Equals for two floating numbers is deprecated,
		// because there could be precision issues.
		// Therefore we add a third parameter which specifies the delta
		// within which two values must be equated.
		
		assertEquals(expectedResult, actualResult, 0.0001);
	}
	
	@Test
	public void twoByThreeEqualsZeroPointSix() {
		var c = new Calculator();
		float expectedResult = 0.6666667f;
		float actualResult = c.divide(2, 3);
		
		assertEquals(expectedResult, actualResult, 0.00001);
		
	}

}
