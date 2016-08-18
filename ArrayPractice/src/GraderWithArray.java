//Ethan Yoder
//November 18, 2015
//Accepts grades from user to create an array of grades

import java.util.*;

public class GraderWithArray {

	public static void main(String[] args) {
		
		//get array size from user
		Scanner console = new Scanner(System.in);
		System.out.println("Enter number of grades you will use:");
		int numOfGrades = console.nextInt();
		
		//create array
		double[] grades = new double[numOfGrades];
		
		for (int g = 0; g < grades.length; g++)
		{
			System.out.println("Enter grade: ");
			grades[g] = console.nextDouble();
		}

		for (int g = 0; g < grades.length; g++)
		{
			System.out.println(grades[g]);
		}

		
	}

}
