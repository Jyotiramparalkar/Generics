package com.bridgelabz;
// To find a maximum value using genrics
public class MaximumValue 
{
	// this method is using comparing between three Integers...
	public static Integer findMaxInteger(Integer number1, Integer number2, Integer number3)
	{
		Integer max = number1;
		if(number2.compareTo(max) >= 0)
			max=number2;
		if(number3.compareTo(max) >= 0)
			max=number3;
		return max;

	}
	// this method is using comparing between Float...
	public static Float findMaxFloat(Float number1, Float number2, Float number3)
	{
		Float max = number1;
		if(number2.compareTo(max) >= 0)
			max=number2;
		if(number3.compareTo(max) >= 0)
			max=number3;
		return max;

	}
	// this method is using comparing between string
	
	public static String findMaxString(String val1, String val2, String val3){
        String max = val1;
        if (val2.compareTo(max) >= 0)
            max = val2;
        if (val3.compareTo(max) >= 0)
            max = val3;

        return  max;
    }
	



	public static void main(String[] args) 
	{
		System.out.println("Find Maximum number using genric method ::");
		// method calling findMaxInteger()
		
		System.out.println("The maximum value between three Integer :: "+findMaxInteger(11,22,33));
		// method calling findMaxFloat()
		
		System.out.println("The maximum value between three Float :: "+findMaxFloat(1.1f,2.2f,3.3f));
		// method calling findMaxString()
		
		System.out.println("The maximum value between the three string is :: " + findMaxString("Apple", "Peach", "Banana"));
	}
	

}