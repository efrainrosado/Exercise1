package com.coderscampus.object;

import java.util.Scanner;

public class Week2Example {
			
	public static int isBetween(int testNumber) {
		int x = testNumber;
		if(50 < x && x < 300) { 
			return x ; 
		} else {
			return 1 ;
			}
		}
				
				
				
			
	public static void main (String[] args) {
				
		Scanner someObj = new Scanner(System.in);		
		System.out.println("Type in a number in a number between 50 and 300:");
		String userInput = someObj.nextLine();
		Integer testNumber = Integer.parseInt(userInput);
		System.out.println("The number you typed in was: " + isBetween(60) );
				
		}
	

}
