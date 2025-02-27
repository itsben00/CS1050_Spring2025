/**
 * This program takes user input to see if they can guess the 
 * random number generated
 */

import java.util.Scanner; 

public class GuessNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// Main method
		
		int MAX = 12;
	      int MIN = 1;
	      int randomNum;
	      
	      int randomInt = (int)Math.random();
	      randomInt = (int) (Math.random() *10);
	      randomInt = (int) (Math.random() *10 +1);
	      //generate random number between MAX and MIN
	      randomNum = (int) (Math.random()*(MAX-MIN + 1) + MIN);
		
		
	    int number = (int)(Math.random() * 101);

	    Scanner input = new Scanner(System.in);
	    // Setting up the scanner that will retrieve info from the keyboard
	    System.out.println("Guess a magic number between 0 and 100");

	    int guess = -1;
	    while (guess != number) 
	    {
	      /*
	       * "While "guess" NOT equal to "number" do this ...
	       * Boolean Expression
	       */
	    	
	      System.out.print("\nEnter your guess: ");
	      guess = input.nextInt();

	      if (guess == number)
	        System.out.println("Yes, the number is " + number);
	      else if (guess > number)
	        System.out.println("Your guess is too high");
	      else
	        System.out.println("Your guess is too low");
	      
	      
	      input.close();

	    } 
		
	}

}
