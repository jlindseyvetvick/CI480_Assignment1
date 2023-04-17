//Solution to Assignment #1: Task 3 - Part 3: Write a program which
//asks a user if they like cake.
//Lindsey Vetvick

import java.util.Scanner;

public class Task3_DataTypePicks_Part3 {
	
	public static void main(String args[]) {

	Scanner input = new Scanner(System.in);
	
	//ask for user to input a response for the cake question
	System.out.println("Hello! Do you like cake?");
	System.out.println("Enter 1 for YES and 2 for NO.");

	int userResponse = input.nextInt();
	
	if (userResponse == 1) {
		System.out.println("");
		System.out.println("Me too! My favorite kind is Portillo's Chocolate Cake!!");
	}
	
	else {
		System.out.println("That's a bummer...cake is so delicious! Have you tried the Chocolate Cake from Portillo's?");
	}
		
	}

}
