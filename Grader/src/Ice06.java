//Ethan Yoder
//October 7, 2015
//Checks to see if two rounded numbers are equal

import java.util.*;

public class Ice06 {

	public static void main(String[] args) {
		
		//creates a scanner object
		Scanner console = new Scanner(System.in);
		
		//declares variables
		double number1, number2;
		int rounded1, rounded2;
		
		//accepts user input for variables values
		System.out.println("Enter first number: ");
		number1 = console.nextDouble();
		System.out.println("Enter second number: ");
		number2 = console.nextDouble();
		
		//rounds both numbers
		rounded1 = (int)(number1 + .5);
		rounded2 = (int)(number2 + .5);
		
		//prints out values of the original numbers
		System.out.println("First number: " + number1);
		System.out.println("Second number: " + number2);
		
		//tests if values are equal or tests which is higher
		if (rounded1 == rounded2)
		{
			System.out.println("They are the same when rounded.");
		}
		else
		{
			System.out.println("The larger number is: " + Math.max(rounded1, rounded2));
		}

	}

}
