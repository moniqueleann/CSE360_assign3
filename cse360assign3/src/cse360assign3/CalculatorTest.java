/** This class tests the methods within the Calculator class. 
 * 
 *  @author Monique Oliver
 *  		Pin 620
 *  		Assignment 3
 * 
 * */

package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	/** This method tests constructor for the Calculator class. */
	@Test
	public void tesCalculator() {
		Calculator calc = new Calculator();
		assertNotNull(calc);
	}
	
	/** This method tests the getTotal method. */
	@Test
	public void testGetTotal() {
		Calculator calc = new Calculator();
		assertEquals(0,calc.getTotal());
	}
	
	/** This method tests the add method. */
	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		calc.add(5);
		assertEquals(5,calc.getTotal());
	}
	
	/** This method tests the subtract method. */
	@Test
	public void testSubtract() {
		Calculator calc = new Calculator();
		calc.subtract(5);
		assertEquals(-5,calc.getTotal());
	}
	
	/** This method tests the multiply method. */
	@Test
	public void testMultiply() {
		Calculator calc = new Calculator();
		calc.add(1);
		calc.multiply(5);
		assertEquals(5,calc.getTotal());
	}
	
	/** This method tests the divide method. */
	@Test
	public void testDivide() {
		Calculator calc = new Calculator();
		calc.add(5);
		calc.divide(5);
		assertEquals(1,calc.getTotal());
		calc.divide(0);
		assertEquals(0,calc.getTotal());
	}
	
	/** This method tests the get*/
	@Test
	public void testGetHistory() {
		fail("Not yet implemented");
	}
	
	

}
