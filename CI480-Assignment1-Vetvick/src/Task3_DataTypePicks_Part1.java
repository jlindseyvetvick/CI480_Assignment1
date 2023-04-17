//Solution to Assignment #1: Task 3 - Part 1: Write a program which
//calculates the price of fruits/veggies given the number of fruits and the unit price.
//Lindsey Vetvick

import java.util.Scanner;

public class Task3_DataTypePicks_Part1 {
	
	public static void main(String args[]) {

	Scanner input = new Scanner(System.in);

	//ask for user to input their number of items to purchase
	System.out.println("Hello! How many Goodberries would you like to purchase today?");
	
	//store the user's response as an int
	//the int data type is used in this case because it is expected a whole number   
	//of goodberries will be purchased
	int numberOfBerries = input.nextInt();
	System.out.println("");
	
	//assign a value to the unitPrice variable
	//in this case, int is used because the unit price is a whole number of dollars
	int unitPrice = 104;
	
	System.out.println("The unit price for a Goodberry is 3 gold pieces.");
	System.out.println("According to my DM, 3 gold pieces is approximately $104 USD.");
	System.out.println("The total cost for " + numberOfBerries + " Goodberries will be $" + (numberOfBerries*unitPrice)+ " USD.");

	}
}