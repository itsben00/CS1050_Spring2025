/*
 */
import java.util.Scanner; 

public class gradeCalculator 
{

	public static void main(String[] args) 
	{
		
		
		
		final int MIN_GRADE = 0;
		final int MAX_GRADE = 105;
		
		final double CLASS_PARTICIPATION = 0.1;
		final double GUIDDED_EXPLORATION = 0.2;
		final double MODULE_QUIZZES = 0.25;
		final double PROJECT_ITERATIONS = 0.25;
		final double FINAL_EXAM = 0.2;
		/**
		double classP = 80;
		double guiddedE = 40;
		double moduleQ = 74;
		double projectI = 100;
		double finalE = 100;
		**/
		
		
		
	//Get users input
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Class Participation grade: ");
	//Repeats prompting for double number until number with in range of min and max
		double classP  =  getValidGrade(MIN_GRADE, MAX_GRADE, input);
		//System.out.println(classParticipation);

		
		System.out.print("Enter Guided Exploration grade: ");
		double guiddedE = getValidGrade(MIN_GRADE, MAX_GRADE, input);
		//System.out.println(guidedExploration);
		System.out.print("Enter Module Quizzes grade: ");
		double moduleQ = getValidGrade(MIN_GRADE, MAX_GRADE, input);
		
		System.out.print("Enter Project Iteration grade: ");
		double projectI = getValidGrade(MIN_GRADE, MAX_GRADE, input);
		
		System.out.print("Enter Final Exam grade: ");
		double finalE = getValidGrade(MIN_GRADE, MAX_GRADE, input);
		
		double finalGrade = (classP*CLASS_PARTICIPATION) + (guiddedE*GUIDDED_EXPLORATION) + (moduleQ*MODULE_QUIZZES) + (projectI*PROJECT_ITERATIONS) + (finalE*FINAL_EXAM);
		System.out.println("Final Percentage: " + finalGrade);
		
		letterGrade(finalGrade);
		
		/**
		* Repeats prompting for double number until number with in range of min and max
		* @param int min for valid grade range
		* @param int max for valid grade range 
		* @param inputReader   Scanner object to read from keyboard
		* @return double valid grade value
		*/
		

	}//END of MAIN
	
	
	
	
	
	
	//Verifying the input
	public static double getValidGrade(int min, int max, Scanner inputKeyboard)
	{
		double num = -1; 
        boolean validGrade = true;

        while (validGrade) 
        {

        //	System.out.print("\nEnter your guess: ");

        	num = inputKeyboard.nextDouble();

        	if (num >= min && num <= max) 
        	{
        		validGrade = false;
        	}

        	else if (num < min || num > max)
        	{
        		System.out.println("Enter a value from " + min + " to " + max + ":");
        	}
        	
        }

		return num;
	}//END of getValidGrade
	
	

	// ---------------------- //
	
	public static void letterGrade(double percentage) 
	{
		if(percentage >= 90) 
		{
			System.out.println("Final Letter Grade: A");
		}	
		else if(percentage >= 80 && percentage <= 90)
		{
			// 18.5 - 24.9 is the range for Normal
			System.out.println("Final Letter Grade: B");
			
		}
		else if(percentage >= 70 && percentage <= 80)
		{
			// 25.0 - 39.9 is the range for Overweight
			System.out.println("Final Letter Grade: C");
			
		}
		else if(percentage >= 60 && percentage <= 70)
		{
			System.out.println("Final Letter Grade: D");
			
		}
		else 
		{
			System.out.println("Final Letter Grade: F");

		}
	}//END of letterGrade
	
	
	
	
	
	
	
	
	

}
