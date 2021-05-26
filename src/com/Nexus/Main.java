package com.Nexus;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

	int myValue = 10000;

	int myMinIntValue = Integer.MIN_VALUE;
	int myMaxIntValue = Integer.MAX_VALUE;
	System.out.println("Interger Minimum Value = " + myMinIntValue);
	System.out.println("Interger Maximum Value = " + myMaxIntValue);
		System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
		System.out.println("Busted Min value " + (myMinIntValue - 1));

		int myMaxIntTest = 2_147_483_647;

		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("Byte Minimum value =" + myMinByteValue);
		System.out.println("Byte maximum value =" + myMaxByteValue);
    }
}
