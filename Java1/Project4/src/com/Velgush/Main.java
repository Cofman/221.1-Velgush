package com.Velgush;

import java.math.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner reader = new Scanner(System.in);
	        System.out.println("Pupils: ");
	        int n = reader.nextInt();
	        System.out.println("Apples: ");	
	        int k = reader.nextInt();
	        int c = (int)Math.floor(k % n);
	        System.out.print("Remaining apples: ");
	        System.out.print(c);
		}
	}