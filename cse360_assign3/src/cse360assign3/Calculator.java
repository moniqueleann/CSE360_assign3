/** This program replicates the function of a calculator.
 * 
 * @author: Monique Oliver
 * 			Pin 620
 * 			Assignment 3
 * 
 */
package cse360assign3;

/** This class replicates the function of a calculator.
 *
 */
public class Calculator {

	private int total;
	
	/** The constructor for the Calculator class initializes
	 *  the variable total. */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/** The getTotal method gets the total. */
	public int getTotal () {
		return total;
	}
	
	/** The add method adds a value to the total. */
	public void add (int value) {
		total += value;
	}
	
	/** The subtract method subtracts a value to the total. */
	public void subtract (int value) {
		total -= value;
	}
	
	/** The multiply method multiplies a value to the total. */
	public void multiply (int value) {
		total = total * value;
	}
	
	/** The divide method divides the total by a value. */
	public void divide (int value) {
		if(value != 0)
			total = total / value;
		else
			total = 0;
	}
	
	/** The method getHistory returns the previous calculations
	 *  done. */
	public String getHistory () {
		return "";
	}
}