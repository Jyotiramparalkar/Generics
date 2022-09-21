package com.bridgelabz;
// Programm that using genrics method comparing between 4 parameters
public class MaximumValue<T extends Comparable >
{
	public T val1;
	public T val2;
	public T val3;
	public T val4;
	public MaximumValue (T val1, T val2, T val3, T val4)
	{
		this.val1=val1;
		this.val2=val2;
		this.val3=val3;
		this.val4=val4;
	}
	public T Maximum() {
		return MaximumValue.findMaximum (val1, val2, val3, val4);	
	}
	//compare any type of data and find maximum
	public static <T extends Comparable> T findMaximum(T val1, T val2, T val3, T val4)
	{
		T max = val1;
		if(val2.compareTo(max)>=0)
			max = val2;
		if(val3.compareTo(max)>=0)
			max = val3;
		if(val4.compareTo(max)>=0)
			max=val4;
		printMax(max);
		return max;
	}
	//Genric Method to print the maximum value
		public static<T> void printMax(T val)
		{
			System.out.println("Maximum value is ::"+ val);
		}
	
	public static void main (String [] args)
	{
		System.out.println("Find the maximum problem using Generics");
		// Find Integer maximum value 
		MaximumValue<Integer> maxIntger = new MaximumValue<>(10,20,30,40);
		System.out.println("The maximum value between three Integer is  ::"+maxIntger.Maximum());
		//Find Float maximum value
		MaximumValue<Float> maxFloat = new MaximumValue<>(10.0f,20.0f,30.0f,40.0f);
		System.out.println("The maximum value between float is  ::"+maxFloat.Maximum());
		//Find String maximum value
		MaximumValue<String> maxString = new MaximumValue<>("Grapes","Banana","peach","Lemon");
		System.out.println("The maximum value of String is  ::"+maxString.Maximum());
	}
}
