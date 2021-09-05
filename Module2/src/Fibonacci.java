
public class Fibonacci {

	public static void main(String[] args)
	{
		int term = 10;
		System.out.println("The " + term + "th term of the Fibonacci sequence is " + recursiveFib(term));

	}
	
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
