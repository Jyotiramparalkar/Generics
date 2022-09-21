package com.bridgelabz;
// Programm that using genrics method comparing between 3 parameters
public class MaximumValue
{
	 public static <T extends Comparable<T>> T findMaximum(T val1, T val2, T val3)
	 {
	        T max = val1;
	        if (val2.compareTo(max) >= 0)
	            max = val2;
	        if (val3.compareTo(max) >= 0)
	            max = val3;

	        return  max;
	    }
	
	public static void main (String [] args)
	{
		System.out.println("Find the maximum problem using Generics");
		// Find Integer maximum value 
		System.out.println("The maximum value between the three integer is :: " + findMaximum(10,20,30));
		//Find Float maximum value
		System.out.println("The maximum value between the three float is :: " + findMaximum(10.0f,20.0f,30.0f));
		//Find String maximum value
		System.out.println("The maximum value between the three String is : " + findMaximum("Apple", "Peach", "Banana"));
	}
}
