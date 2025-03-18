/*
This Program calculates a students final grade
	- Grading categories and weights
	- grading Scale
 */
import java.util.Scanner; 

public class gradeCalculator 
{

	public static void main(String[] args) 
	{
		
		
		
		final int MIN_GRADE = 0;
		final int MAX_GRADE = 105;
	//Percentage of each category
		final double CLASS_PARTICIPATION = 0.1;
		final double GUIDDED_EXPLORATION = 0.2;
		final double MODULE_QUIZZES = 0.25;
		final double PROJECT_ITERATIONS = 0.25;
		final double FINAL_EXAM = 0.2;
		
		
		
		
	//Get users input
		Scanner input = new Scanner(System.in);
		
		boolean pass = true;
		
	//do-while Loop bc the loop will run one time at least
		do 
		{
		System.out.println("Calculate Student's Grade");
		
		System.out.print("Enter Class Participation grade: ");
		double classP  =  getValidGrade(MIN_GRADE, MAX_GRADE, input);
		
		System.out.print("Enter Guided Exploration grade: ");
		double guiddedE = getValidGrade(MIN_GRADE, MAX_GRADE, input);
		
 		System.out.print("Enter Module Quizzes grade: ");
		double moduleQ = getValidGrade(MIN_GRADE, MAX_GRADE, input);
		
		System.out.print("Enter Project Iteration grade: ");
		double projectI = getValidGrade(MIN_GRADE, MAX_GRADE, input);
		
		System.out.print("Enter Final Exam grade: ");
		double finalE = getValidGrade(MIN_GRADE, MAX_GRADE, input);
		
		//Calculation for Final Percentage of student
		double finalGrade = (classP*CLASS_PARTICIPATION) + (guiddedE*GUIDDED_EXPLORATION) + (moduleQ*MODULE_QUIZZES) + (projectI*PROJECT_ITERATIONS) + (finalE*FINAL_EXAM);
		
	//Percentage & Grade is shown
		System.out.println("------------------------------------------------");
		System.out.println("Final Percentage: " + finalGrade);
		letterGrade(finalGrade);
		System.out.println("------------------------------------------------");

	//Prompt the user if they will like to use the calculator once again
		System.out.println("Do you want to calculate another student's grade?\nEnter y for YES or n for NO:");
		String response = input.next().toLowerCase();
		pass = response.equals("y");
		
		}while(pass);
		System.out.println("Exiting grade calculator . . .");
	
		
			input.close();
	}//END of MAIN
	
	
	
	
	
	
	//Repeats prompting for double number until number with in range of Min and Max
	public static double getValidGrade(int min, int max, Scanner input)
	{
		
		double num = -1; 
        boolean validGrade = true;

        while (validGrade) 
        {

        	num = input.nextDouble();

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
	
	

	
	//Calculate the Letter Grade of student
	public static void letterGrade(double percentage) 
	{
		if(percentage >= 90) 
		{
			System.out.println("Final Letter Grade: A");
		}	
		else if(percentage >= 80 && percentage <= 90)
		{
			System.out.println("Final Letter Grade: B");
			
		}
		else if(percentage >= 70 && percentage <= 80)
		{
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
	
	
	

	
	
	
	
	
	

}//END of Code
