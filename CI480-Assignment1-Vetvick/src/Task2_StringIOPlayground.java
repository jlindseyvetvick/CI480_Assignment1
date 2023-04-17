//Solution to Assignment #1: Task 2 - Write a program which
//outputs information about a name provided by a user
//Lindsey Vetvick

import java.util.Scanner;

public class Task2_StringIOPlayground {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//prompt the user for a username
		System.out.println("What is your name? ");
		
		//create userName object
		String userName = input.nextLine();
		System.out.println("");
				
		//greet user by name
		System.out.println("Hello, " + userName + "!");
		
		//create userName variable
		int nameLength = userName.length();
		System.out.println("");
		
		//create variables to represent first and last character of name
		char first = userName.charAt(0);
		char last = userName.charAt(nameLength-1);
			
		//print the length of the username
		System.out.println("Your name has " + nameLength + " characters.");
		System.out.println("");
		
		//print the first and last character of the username
		System.out.println("The first character in your name is " + first + ", and the last character is " + last + ".");		
		System.out.println("");
		
		//print the username in all uppercase letters
		System.out.println("Written in all uppercase letters, your name looks like: " + userName.toUpperCase() + ".");

	}

}
