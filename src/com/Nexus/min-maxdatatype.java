package com.Nexus;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
//varaibles. types of variables in java are int, string, float,boolean, char
	int myValue = 10000;
// int Mininum and vaximun value
	int myMinIntValue = Integer.MIN_VALUE;
	int myMaxIntValue = Integer.MAX_VALUE;
	System.out.println("Interger Minimum Value = " + myMinIntValue);
	System.out.println("Interger Maximum Value = " + myMaxIntValue);
		System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
		System.out.println("Busted Min value " + (myMinIntValue - 1));
//max int
		int myMaxIntTest = 2_147_483_647;
//max and min byte value
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("Byte Minimum value =" + myMinByteValue);
		System.out.println("Byte maximum value =" + myMaxByteValue);
		//max and min short value
		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		System.out.println("Short Minimum value =" + myMinShortValue);
		System.out.println("Short maximum value =" + myMaxShortValue);
		//max and min long value. long is double of int so while initializing value, put 'L'
		long myLongValue = 100L;
		long myMinlongValue = Long.MIN_VALUE;
		long myMaxlongValue = Long.MAX_VALUE;
		System.out.println("long Minimum value =" + myMinlongValue);
		System.out.println("long maximum value =" + myMaxlongValue);
		//long literal value--just as we did of int.
		long bigLongLiteralValue =  2_147_483_647_234L;
		System.out.println(bigLongLiteralValue);
		//short literal value
		short bigShortLiteralValue = 32767;
		//total of datatype int
		int myTotal = (myMinIntValue /2);
		/* since it is not a literal value, we need to cast it. (byte) is casting, by this java
		identifies it */
		byte myByte = (byte) (myMinByteValue / 2);

		short myShort = (short) (myMinShortValue /2);
		//chalenge
		byte MyChallenge = 10;
		short MyShort = 20;
		int MyInte = 50;
		long Mylong = 50000L + 10l * (MyChallenge + MyShort + MyInte);
		System.out.println(Mylong);



	}
}
