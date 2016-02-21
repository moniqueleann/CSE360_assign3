/** This class replicates the functions of a calculator.
 * 
 *  @author Monique Oliver
 *  		Pin 620
 *  		Assignment 3
 * 
 * */
package cse360assign3;

public class Calculator {

	private int total;
	private String history;
	
	/** This method is the constructor for the Calculator class. */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/** This method gets the total.
	 * 
	 * @return total The current value of the total
	 * */
	public int getTotal () {
		return total;
	}
	
	/** This method adds a value to the total.
	 * 
	 * @param value The value to be added
	 * 
	 * */
	public void add (int value) {
		total += value;
		history += " + " + value;
	}
	
	/** This method subtracts a value to the total.
	 * 
	 * @param value The value to be subtracted
	 * 
	 * */
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}
	
	/** This method multiplies a value to the total.
	 * 
	 * @param value The value to be multiplied
	 * 
	 * */
	public void multiply (int value) {
		total = total * value;
		history += " * " + value;
	}
	
	/** This method divides the total by a value. 
	 * 
	 * @param value The value to divide the total by
	 * 
	 * */
	public void divide (int value) {
		if (value != 0)
			total = total / value;
		else
			total = 0;
		
		history += " / " + value;
	}
	
	/** This method returns the previous calculations. 
	 * 
	 * @return history Returns the previous calculations as a string.
	 * 
	 * */
	public String getHistory () {
		return history;
	}
}