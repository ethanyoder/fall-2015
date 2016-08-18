import java.util.Scanner;  // Needed for the Scanner class

/**
 * Ethan Yoder and Andrew Ostrowsky
 * Date: October 2015
 * Purpose: This program correctly identifies the type of triangle given the side lengths. 
 */

public class Triangle
{
	public static void main(String[] args)
	{
		int side1, side2, side3; // Three sides

		// Create a Scanner object to read input.
		Scanner keyboard = new Scanner(System.in);

		// Get a side1.
		System.out.print("Enter first side: ");
		side1 = keyboard.nextInt();

		// Get a side2
		System.out.print("Enter second side: ");
		side2 = keyboard.nextInt();

		// Get a side3
		System.out.print("Enter third side: ");
		side3 = keyboard.nextInt();

		//test to see if it is a valid triangle
		if ((side1 + side2 > side3))
		{
			if ((side2 + side3 > side1))
			{
				if ((side3 + side1 > side2))
				{
					System.out.println("This is a valid triangle");
					//figures out the type of triangle
					if ((side1 != side2) && (side2 != side3))
					{
						System.out.println("This is a scalene triangle");
					}
					else if ((side1 == side2) && (side2 == side3))
					{
						System.out.println("This is an equilateral triangle");
					}
					else
					{
						System.out.println("This is an isosceles triangle");
					}
				}
				else
				{
					System.out.println("Not a valid triangle");
				}
			}
			else
			{
				System.out.println("Not a valid triangle");
			}
		}
		else
		{
			System.out.println("Not a valid triangle");
		}
		
	}
}
