//Solution to Assignment #1: Task 3 - Part 2: Write a program which
//wishes a user "Happy Future Birthday!"
//Lindsey Vetvick

import java.util.Scanner;

public class Task3_DataTypePicks_Part2 {
	
	public static void main(String args[]) {

	Scanner input = new Scanner(System.in);

	//ask for user to input their name
	System.out.println("Hello! What is your name?");
	
	//store the user's response as a string
	//the string data type is used in this instance considering
	//the user's name will be a specific sequence of characters or text
	//(ie: Oprah or Bob the Builder)
	String userName = input.nextLine();
	System.out.println("");
	
	//ask for the user's current age
	System.out.println("What is your current age?");
	
	//store the user's response as an int data type considering an adult (most likely)
	//will round down to the nearest whole number (or decade); in addition, the 
	//int data type will allow for the programmer to perform the mathematical operation of
	//adding 1 to the value stored in the variable: userAge
	int userAge = input.nextInt();
	System.out.println("");
	
	//say Happy Birthday! to the user
	System.out.println("Wow! It looks as if you're getting older...");
	System.out.println("On your next birthday you will be " + (userAge+1) + "! Happy Birthday!");
	
	}
}
