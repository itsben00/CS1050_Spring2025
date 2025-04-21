
public class M04PassArrays {

	public static void main(String[] args) {
		int numbers = 0;
		
		int[] numbersArray = new int[5];
		

		updateRandomValue(numbersArray, numbers);
		
		System.out.println(numbers);
		
		for(int i = 0; i < numbersArray.length; i++)
	    {
	    	System.out.println(numbersArray[i]);
	    }
		
	}// END of main
	
	
	
	public static void updateRandomValue(int passedArray[], int passedNumber)
	{
	   //Update numbers
		passedNumber = (int)(Math.random() * 11);

		
	    for(int i = 0; i < passedArray.length; i++)
	    {
	    	passedArray[i] = (int)(Math.random() * 11);
	    }
	    
	    
	    
	    
	}
	
	
	

}
