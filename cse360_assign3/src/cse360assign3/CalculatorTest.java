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
	public void testCalculator() {
		fail("Not yet implemented");
	}
	
	/** Tests the getTotal method. */
	public void testGetTotal() {
		Calculator calc = new Calculator();
		assertEquals(calc.getTotal(),0);
	}
	
	/** Tests the testAdd method. */
	public void testAdd() {
		Calculator calc = new Calculator();
		calc.add(5);
		assertEquals(calc.getTotal(),5);
	}
	
	/** Tests the subtract method. */
	public void testSubtract() {
		Calculator calc = new Calculator();
		calc.subtract(5);
		assertEquals(calc.getTotal(),-5);
	}
	
	/** Tests the multiply method. */
	public void testMultiply() { 
		Calculator calc = new Calculator();
		calc.add(5);
		calc.multiply(5);
		assertEquals(calc.getTotal(),25);
	}
	
	/** Tests the divide method. */
	public void testDivide() {
		Calculator calc = new Calculator();
		calc.add(5);
		calc.divide(5);
		assertEquals(calc.getTotal(),1);
		calc.divide(0);
		assertEquals(calc.getTotal(),0);
	}
	
	/** Tests the getHistory method. */
	public void testGetHistory() { 
		Calculator calc = new Calculator();
		assertEquals(calc.getHistory(),"");
	}
	
}