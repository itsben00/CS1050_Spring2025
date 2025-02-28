
/**
 *  This Code does
 */

import java.util.Scanner;

public class ChairezGE02StringsChars 
{

	
	public static void main(String[] args) 
	{

	Scanner input = new Scanner(System.in);	
	
	

	System.out.println("Student 1 your first!");
		// Gets first student FIRST name	
		System.out.print("Enter your first name: ");
		String s1Firstname = input.nextLine();
		
		// Gets first student LAST name	
		System.out.print("Enter your last name: ");
		String s1Lastname = input.nextLine();
		
	
	
	System.out.println("\nStudent 2, Its your turn");
		// Gets second student FIRST name	
		System.out.print("Enter your first name: ");
		String s2Firstname = input.nextLine();
			
		// Gets second student LAST name	
		System.out.print("Enter your last name: ");
		String s2Lastname = input.nextLine();
		
	// Names in order by last name
		int result = s1Lastname.compareToIgnoreCase(s2Lastname);
		
		System.out.println("\nStudents in alphabetical order by last name:");
		
		if(result == 0)
		{
			System.out.println(s1Lastname + " " + s1Firstname);
			System.out.println(s2Lastname + " " + s2Firstname);


		}
		else if (result < 0)
		{
			System.out.println(s1Lastname + " " + s1Firstname);
			System.out.println(s2Lastname + " " + s2Firstname);

		}
		else 
		{
			
			System.out.println(s2Lastname + " " + s2Firstname);
			System.out.println(s1Lastname + " " + s1Firstname);
		}
	
	// Initials 
		//initials for student 1
		char initialFirstOne = s1Firstname.charAt(0);
		char initialLastOne = s1Lastname.charAt(0);
		//initials for student 2
		char initialFirstSecond = s2Firstname.charAt(0);
		char initialLastSecond = s2Lastname.charAt(0);
		
		System.out.println("\nInitials:");

		System.out.println("Student 1: " + initialFirstOne + ". " + initialLastOne + ". ");
		System.out.println("Student 2: " + initialFirstSecond + ". " + initialLastSecond + ". ");
		
		
		
		

		
		
		
		
		
		
		
		
		//scanner close
		input.close();
	}

}
