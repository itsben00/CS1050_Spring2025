import java.util.Scanner;   // Scanner class to read input

//import input/output package classes to write to a file 
import java.io.*;

/**
   This program writes data to a file using arrays. 
   It makes sure the
   specified file does not exist before opening it.
 */

public class FileWriteDemo2
{
	public static void main(String[] args) throws IOException
	{
		
		//Add comments to explain the code.
		
		//Create an array for the categories that they will be graded on	
		String[] gradeCategories = {"Class Participation","Guided Exploration",
				"Quizzes","Project Percent","Final Exam"};
		//Create an array for the percentage that they will be graded on	
		double[] gradePercentWeights = {.12,.22,.22,.22,.22};
		
		// Scanner object is created to read in input from the keyboard
		Scanner readKeyboard = new Scanner(System.in);
		
		//Asking the user to enter the file name & the input will be in a String object called "file"
		System.out.print("Enter the filename with no spaces and include .txt \n");
		String file = readKeyboard.next();
		//calling on "writeToFile" method
		writeToFile(file, gradeCategories, gradePercentWeights);
		
		
		//closing Scanner object
		readKeyboard.close();		
	}//END main
	
	public static void writeToFile(String filename, String[] categories, double[] percentWeights)
			throws IOException
	{
		//Creates a File object with the name of what the user typed in
		File gradeFile = new File(filename);
		
		// 
		if (gradeFile.exists())
		{			
			System.out.println("\nThe file " + filename +
					" already exists.");
			
		}else
		{

			//
			PrintWriter outputFile = new PrintWriter(gradeFile);
	
			// 		
			outputFile.println("\nCategories and percentage weights");
			
			for(int categoryColumn = 0; categoryColumn < categories.length; categoryColumn++ )
			{	
				outputFile.printf("%s Grade: %.2f\n", categories[categoryColumn], percentWeights[categoryColumn]);
			}

			String absoluteFilePath = gradeFile.getAbsolutePath();
			System.out.println("\nOpen the file located at " + absoluteFilePath);
			
			System.out.println("\nNext set a breakpoint to explore the code and what is happening in memory");
			System.out.println("\nExplore the two arrays");
			System.out.println("\nAdd comments to the code.");
			// 
			outputFile.close();
		}//END else
	}

	
	
}//END FileWriteDemo2
