package com.Velgush;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner reader = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int i = 1;
	        int number = reader.nextInt();
	        System.out.print("The next number for the number " + number); 
	        System.out.println(" is " + (number + i));
	        System.out.print("The previous number for the number " + number);
	        System.out.println(" is " + (number - i));
	}
}
