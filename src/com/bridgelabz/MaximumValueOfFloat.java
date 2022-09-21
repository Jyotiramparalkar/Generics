package com.bridgelabz;
// To find a maximum value of float using genrics
public class MaximumValueOfFloat 
{
	// this method is using comparing between three Integers...
		public static Float findMaxFloat(Float number1, Float number2, Float number3)
		{
			Float max = number1;
			if(number2.compareTo(max) >= 0)
				max=number2;
			if(number3.compareTo(max) >= 0)
				max=number3;
			return max;
				
		}

		public static void main(String[] args) 
		{
			System.out.println("Find Maximum number using genric method ::");
			// method calling findMaxFloat()
			System.out.println("The maximum value between three Float ::"+findMaxFloat(1.1f,2.2f,3.3f));
		}

	}