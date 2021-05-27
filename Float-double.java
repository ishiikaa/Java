package com.Nexus;

class Main {

    public static void main(String[] args) {
	// write your code here
        //min-max value of float
    float myMinFloatValue = Float.MIN_VALUE;
    float myMaxFloatValue = Float.MAX_VALUE;
    System.out.println("Float minimum value =" + myMinFloatValue);
    System.out.println("Float Maximum Value =" + myMaxFloatValue);

    //min max value of double
       double myMinDoubleValue = Double.MIN_VALUE;
       double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value =" + myMinDoubleValue);
        System.out.println("Double Maximum Value =" + myMaxDoubleValue);
        // initializing
        int myIntValue = 5 /3;
        float myFloatValue = (float) 5f /3f;  //casting
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("MyIntValue =" + myIntValue);
        System.out.println("MyFloatValue= "+ myFloatValue);
        System.out.println("MyDoubleValue =" +myDoubleValue);

        /* challenge
        1-create a variable with the appropriate type to store the number of pounds
         to be converted in kilograms.
         2- calculate the result i.e the number of kilograms based on the contents
         of the variable above to store the result in a 2nd appropriate variable
         3-Print out the result  (hint- 1pound=0.45359237)
         */
        double numberOfPounds =200d;
        double convertedkilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted kilograms =" + convertedkilograms);
         //challenge ended
        //pi of double
        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890;
        System.out.println("pi");
        System.out.println(anotherNumber);


    }
}
