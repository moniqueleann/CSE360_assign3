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
		fail("Not yet implemented");
	}
	
	/** Tests the getTotal method. */
	@Test
	public void testGetTotal() {

	}
	
	/** Tests the testAdd method. */
	@Test
	public void testAdd() {

	}
	
	/** Tests the subtract method. */
	@Test
	public void testSubtract() {

	}
	
	/** Tests the multiply method. */
	@Test
	public void testMultiply() { 

	}
	
	/** Tests the divide method. */
	@Test
	public void testDivide() {

	}
	
	/** Tests the getHistory method. */
	@Test
	public void testGetHistory() { 

	}
	
}