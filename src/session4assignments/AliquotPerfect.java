package session4assignments; //Declaration of Package
/**
 * This class finds the aliquot sum of a given number, checks if it is a perfect number and prints all perfect numbers between 1 and 100
 *
 */
public class AliquotPerfect 
{/**
	 * This is the main method which accepts command line arguments and returns no value
	 *
	 */
	public static void main(String[] args) 
	{
		System.out.println("Perfect numbers between 1 and 100 are:"); //Prints the heading for perfect numbers between 1 and 100
		
		for (int number = 1; number <= 100; number++) //Outer for loop for the given number from 1 to 100 
		{
			int aliquotSum = 0; //Initialization of Aliquot sum variable
			
			for (int divisor = 1; divisor != number; divisor++) //Inner for loop for dividing the given number to find aliquot divisors
			{
				if ((number % divisor) == 0) //If condition using modulo operation to check if the remainder is 0
				{
					aliquotSum = aliquotSum + divisor; //Sum of aliquot divisors stored in aliquotSum variable
				} //if block closed
			} //Inner for loop closed
		
			if (aliquotSum == number) //if condition to compare the equality of aliquot sum and the given number
			{
				System.out.println(number); //Prints the Perfect number if the above condition is true
			} //if block closed
		} //Outer for loop closed
	} //main method closed
} //Class closed
