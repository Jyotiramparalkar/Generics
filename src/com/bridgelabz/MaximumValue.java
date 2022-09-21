package com.bridgelabz;
// Programm that using genrics method comparing between 3 parameters
public class MaximumValue<T extends Comparable> 
{

    private T val1;
    private T val2;
    private T val3;
    public MaximumValue(T val1, T val2, T val3)
    {
        this.val1 =val1;
        this.val2 = val2;
        this.val3 =val3;
    }

    public T maximux()
    {
        return MaximumValue.findMaximum(val1, val2, val3);
    }

    
     //Generic method to compare any type of data and find maximum
   
    public static <T extends Comparable> T findMaximum(T val1, T val2, T val3)
    {
        T max = val1;
        if (val2.compareTo(max) >= 0)
            max = val2;
        if (val3.compareTo(max) >= 0)
            max = val3;

        return  max;
    }
    public static void main(String[] args) {
        System.out.println("Find Maximum Problem using Generics");

        MaximumValue<Integer> maxInteger = new MaximumValue<>(10,20,30);
        System.out.println("The maximum value between the three integer is : " + maxInteger.maximux());

        MaximumValue<Float> maxFloat = new MaximumValue<>(10.0f, 20.0f, 30.0f);
        System.out.println("The maximum value between the three float is : " + maxFloat.maximux());

        MaximumValue<String> maxString = new MaximumValue<>("Apple", "Peach", "Banana");
        System.out.println("The maximum value between the three string is : " + maxString.maximux());
    }
}