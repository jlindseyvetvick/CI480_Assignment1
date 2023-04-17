//Solution to Assignment #1: Task 1 - Write a program which
//can calculate the total cost of carpet for a room based on 
//room length, width, and carpet cost input
//Lindsey Vetvick

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Task1_CarpetCalculator {
	
public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		//prompt the user for the length of the room in feet
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
		
		}
}