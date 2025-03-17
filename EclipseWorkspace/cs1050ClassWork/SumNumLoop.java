/**
 * This code finds the sum of numbers 1 to max
 */
import java.util.Scanner; 

public class SumNumLoop {

	public static void main(String[] args) 
	{
		// Get users Max number
		
		Scanner input = new Scanner(System.in);
		System.out.println("Type a Max Number");
		int maxNum = input.nextInt();
		
		int totalSum = sumToMax(maxNum);
		
		// Display result
		    System.out.println("The sum is " + totalSum);
		
		


	    
		input.close();
	}// END of main

	public static int sumToMax (int num)
	{
		int sum = 0;
		 for(int counter = 0; counter <= num; counter++)
		    {
		    	sum = sum + counter;
		    }//END of for loop
		 
		return sum;
	}//END of sumToMax
	
	
	
	

}// END of class
