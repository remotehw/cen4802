/**
 * This program will recursively generate a Fibonacci sequence and print the nth term to the console
 *  
 * @author Joseph Kearns
 *
 */

public class Fibonacci {

	public static void main(String[] args)
	{
		int term = 10;
		System.out.println("The " + term + "th term of the Fibonacci sequence is " + recursiveFib(term));

	}
	
	/**
	 * The recursiveFib method generates the Fibonacci sequence recursively.
	 * The runtime of this method is roughly O(2^n) when length > 1
	 * 
	 * @param length The length of the sequence to generate
	 * @return The final integer of the generated sequence
	 */
	
	public static int recursiveFib(int length)
	{
		int sequence = 0;
		if (length <= 1)
		{
			return length;
		}
		
		sequence = recursiveFib(length - 1) + recursiveFib(length - 2);
		return sequence;
	}

}
