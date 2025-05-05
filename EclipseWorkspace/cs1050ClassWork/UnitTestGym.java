
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class UnitTestGym {

	public static void main(String[] args)
	{
		int MAX_GYM_MEMBERS = 3;
		
		Gym gym1 = new Gym("Elite Fitness", MAX_GYM_MEMBERS);

		try
		{
			readGymAthletesInfoFromFile("gym1.txt", gym1);
			gym1.displayAthleteSummaries();
		//	gym1.saveReportToFile();
			
		} catch (FileNotFoundException e)
		{
			System.out.println("Error: File not found.");
		}
	}//END of Main

	 
	public static void readGymAthletesInfoFromFile(String filename, Gym currentGym) throws FileNotFoundException
	{
		
		
		Scanner fileScanner = null;
		try
		{

			fileScanner = new Scanner(new File(filename));
			//Add code to read from file
			while(fileScanner.hasNextLine())
				{
					String firstName = fileScanner.next().trim();
					String lastName = fileScanner.next().trim();
					double weight = fileScanner.nextDouble();
					double height = fileScanner.nextDouble();
					int age = fileScanner.nextInt();
					
					int[] dailyCaloriesBurned = new int[7];
					for(int i = 0; i < 7; i++)
					{
						dailyCaloriesBurned[i] = fileScanner.nextInt();
					}
					
					Athlete athlete = new Athlete(firstName, lastName, weight, height, age, dailyCaloriesBurned);
					currentGym.addAthlete(athlete);
				}


		} finally
		{
			if (fileScanner != null)
			{
				fileScanner.close();
			}
		}
	}// end add athletes
	
	
	
	
}//END of code


class Athlete {
	
	private String firstName;
	private String lastName;
	private double weight;
	private double height;
	private int age;
	private int[] dailyCaloriesBurned;


	public Athlete(String firstName, String lastName, double weight, double height, int age, int[] dailyCaloriesBurned)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.weight = weight;
		this.height = height;
		this.age = age;
		this.dailyCaloriesBurned = dailyCaloriesBurned;
		
	}
	
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	
	public double calculateBMI()
	{
		final int BMI_US_FACTOR = 703; //factor formula in pounds
		
		// Calculate the user's body mass index.
		double bmi = BMI_US_FACTOR * weight / (height * height);
		bmi = Math.round(bmi * 10.0) / 10.0;

		return bmi;
	}
	
	
	public int calculateMaxHeartRate()
	{
		int maxHeartRate = 220 - age;
		return maxHeartRate;
	}
	
	public String getBMICategory()
	{
		double bmi = calculateBMI();
		
		if(bmi <= 18.5) 
		{
			return "  Your category: Underweight";
		}	
		else if(bmi >= 18.5 && bmi <= 25)
		{
			return "  Your category: Normal";
			
		}
		else if(bmi >= 25 && bmi <= 30)
		{
			return "  Your category: Overweight";
			
		}
		else
		{
			return "  Your category: Obese";
			
		}
		
	}
	
	
	public double getAverageCaloriesBurned()
	{
		double sum = 0;
			for(int i = 0; i < dailyCaloriesBurned.length; i++)
			{
				sum = sum + dailyCaloriesBurned[i];
			}
			sum = sum / dailyCaloriesBurned.length;
			
			sum = Math.round(sum * 10.0) / 10.0;

			
			return sum;
	}
	
	
	
	
	
}









class Gym {
	
	private String name;
	private Athlete[] athletes;
	private int numAthletes;
	
	public Gym(String name, int maxAthletes)
	{
		this.name = name;
		this.athletes = new Athlete[maxAthletes];
		this.numAthletes = 0;
		
	}
	
	
	public void addAthlete(Athlete athlete)
	{
		if(numAthletes < athletes.length)
		{
			athletes[numAthletes] = athlete;
			numAthletes++;
		}else 
		{
			System.out.println("Gym is full. Can't add " + athlete.getFirstName() + " " + athlete.getLastName());
		}
	}
	
	
	public void displayAthleteSummaries()
	{
		System.out.println("\n****** Gym Fitness Report ******");
		System.out.println("Gym: " + name);
		for(int i = 0; i < numAthletes; i++)
		{
			System.out.println("Athlete: " + athletes[i].getFirstName() + " " + athletes[i].getLastName());
			
			System.out.println("\tMax Heart Rate: " + athletes[i].calculateMaxHeartRate() + " bpm");
			
			System.out.println("\tAverage Daily Calories Burned: " + athletes[i].getAverageCaloriesBurned());
			
			System.out.println("\tBMI: " + athletes[i].calculateBMI() + "\t" + athletes[i].getBMICategory());
			
			int topAth = findTopAthlete();
			System.out.println("\nTop Athlete (Most Calories Burned):" + athletes[topAth].getFirstName() + " " + athletes[topAth].getLastName());
			
			displayUnderweightAthletes();
	
			
		}
	}
	
	
	public void saveReportToFile() {
	    File fileName = new File(name + ".txt");
	    try {
	    PrintWriter outputFile = new PrintWriter(fileName);

	    outputFile.println("****** Gym Fitness Report ******");
	    outputFile.println("Gym: " + name);
			for(int i = 0; i < numAthletes; i++)
			{
				System.out.println("Athlete: " + athletes[i].getFirstName() + " " + athletes[i].getLastName());
			
				System.out.println("\tMax Heart Rate: " + athletes[i].calculateMaxHeartRate() + " bpm");
			
				System.out.println("\tAverage Daily Calories Burned: " + athletes[i].getAverageCaloriesBurned());
			
				System.out.println("\tBMI: " + athletes[i].calculateBMI() + "\t" + athletes[i].getBMICategory());
				
				int topAth = findTopAthlete();
				System.out.println("Top Athlete (Most Calories Burned):" + athletes[topAth].getFirstName() + " " + athletes[topAth].getLastName());
				
			}
			outputFile.close();

		//	String absoluteFilePath = fileName.getAbsolutePath();
		//	System.out.println("Report Saved to: \n" + absoluteFilePath);
	    } catch (FileNotFoundException e)
		{
			System.out.println("Error: Could not write to file");
		}
			

	}
	
	
	private int findTopAthlete()
	{
		double largest = athletes[0].getAverageCaloriesBurned();
		int topAthleteIndex = 0;
		for(int i = 1; i < numAthletes; i++)
		{
			if(athletes[i].getAverageCaloriesBurned() > largest)
			{
				largest = athletes[i].getAverageCaloriesBurned();
				topAthleteIndex = i;
			}
		}
		
				
		return topAthleteIndex;
	}
	
	
	private void displayUnderweightAthletes()
	{
		System.out.println("Underweight Athletes:");
		boolean underweightAthFound = false;
		for(int i = 0; i < numAthletes; i++)
		{
			if(athletes[i].getBMICategory().equals("  Your category: Underweight"))
			{
				System.out.print(athletes[i].getFirstName() + " " + athletes[i].getLastName());
				underweightAthFound = true;
			}
			
		}
		if(!underweightAthFound)
		{
			System.out.println("No underweight athletes");
		}
		
	}
	
	
}
