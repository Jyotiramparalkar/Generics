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

		public static void main(String[] args) 
		{
			System.out.println("Find Maximum number using genric method ::");
			// method calling findMaxInteger()
			System.out.println("The maximum value between three Integer ::"+findMaxInteger(11,22,33));
		}

	}