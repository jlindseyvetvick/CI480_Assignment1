//an attempt at Task #1: Part 7 - Write a program that can calculate 
//the carpet cost for an arbitrary number of rooms -- I think it worked!
//Lindsey Vetvick

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Task1_Part7_ArbitraryNumberOfRooms {
	
public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("For how many rooms would you like to calculate total carpet cost? ");
		//create variable to store user preference for number of rooms
		int roomNumberInput = input.nextInt();
		
		//create variable to initialize a comparison value
		int roomNumber = 1;
		
		while (roomNumberInput >= roomNumber) {
	
		//prompt the user for the length of the room in feet
			System.out.println("");
			System.out.println("Enter room length (measured in ft.): ");
				
		//create roomLength variable 
		float roomLength = input.nextFloat();
		System.out.println("");
		
		//prompt the user for the width of the room in feet
		System.out.println("Enter room width (measured in ft.): ");
		
		//create roomWidth variable
		float roomWidth = input.nextFloat();
		System.out.println("");
		
		//prompt the user for the cost of carpet in dollars per squared-foot
		System.out.println("Enter the cost of carpet (priced in dollars per square foot): ");
		
		//create carpetCost variable
		float carpetCost = input.nextFloat();
		System.out.println("");

		//print the userInput and report the total square footage to be purchased
		System.out.println("Room Length: " + roomLength +" ft.");
		System.out.println("Room Width: " + roomWidth +" ft.");
		System.out.println("Total Square Footage of Carpet Required: " + roomLength*roomWidth +" squared-feet");
		
		//create totalCost variable
		float totalCost = ((roomLength*roomWidth)*carpetCost);
		System.out.println("");
		
		//report the total cost of carpet to be purchased
		System.out.println("Total Cost of Carpet to be purchased: $" + totalCost);
		System.out.println("");
		
		roomNumber++;
		
		}
	}
}
		
		
		