/** The CalculatorTest class tests the methods found
 *  in the calculator class.
 *  
 *  @author: Monique Oliver
 *  		 Pin 620
 *  		 Assignment 3
 * 
 */
package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;


/** The CalculatorTest class tests the methods found
 *  in the calculator class.
 */
public class CalculatorTest {

	private final ByteArrayOutputStream out = new ByteArrayOutputStream();
	private final ByteArrayOutputStream err = new ByteArrayOutputStream();
	
	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(out));
		System.setErr(new PrintStream(err));
	}
	
	@After
	public void cleanUpStreams() {
		System.setOut(null);
		System.setErr(null);
	}
	
	
	/** Tests the calculator constructor. */
	@Test
	public void testCalculator() {
		Calculator calc = new Calculator();
		assertEquals(calc, calc);
	}
	
	/** Tests the getTotal method. */
	@Test
	public void testGetTotal() {
		Calculator calc = new Calculator();
		assertEquals(calc.getTotal(),0);
	}
	
	/** Tests the testAdd method. */
	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		calc.add(5);
		assertEquals(calc.getTotal(),5);
	}
	
	/** Tests the subtract method. */
	@Test
	public void testSubtract() {
		Calculator calc = new Calculator();
		calc.subtract(5);
		assertEquals(calc.getTotal(),-5);
	}
	
	/** Tests the multiply method. */
	@Test
	public void testMultiply() { 
		Calculator calc = new Calculator();
		calc.add(5);
		calc.multiply(5);
		assertEquals(calc.getTotal(),25);
	}
	
	/** Tests the divide method. */
	@Test
	public void testDivide() {
		Calculator calc = new Calculator();
		calc.add(5);
		calc.divide(5);
		assertEquals(calc.getTotal(),1);
		calc.divide(0);
		assertEquals(calc.getTotal(),0);
	}
	
	/** Tests the getHistory method. */
	@Test
	public void testGetHistory() { 
		Calculator calc = new Calculator();
		calc.add(4);
		calc.multiply(2);
		calc.subtract(3);
		calc.divide(5);
		calc.add(1);
		calc.divide(0);
		assertEquals(calc.getHistory(),"0 + 4 * 2 - 3 / 5 + 1 / 0");
	}
	
}