package com.Nexus;

 public class primitive {

    public static void main(String[] args) {
	// write your code here
       byte byteValue = 10;
       short shortValue = 20;
       int intValue = 50;

       long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);
	    short shortTotal = (short) (100 + 10 *
					(byteValue+shortValue+intValue));
	    System.out.println(shortTotal);
            }
}
