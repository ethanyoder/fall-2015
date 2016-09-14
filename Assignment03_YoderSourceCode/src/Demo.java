//Ethan Yoder
//October 16, 2015
//Provides the input and output for the MonthDays class

import java.util.*;

public class Demo {
	
	static Scanner console = new Scanner (System.in);

	public static void main(String[] args) {
		//accepts user input
		System.out.println("Enter month number (1 for January, etc.)");
		int monthNo = console.nextInt();
		System.out.println("Enter year");
		int yearNo = console.nextInt();
		
		//creates MonthDays object and passed arguments to its constructor
		MonthDays obj1 = new MonthDays(monthNo, yearNo);
		
		//returns the days in the month for the user
		System.out.println(obj1.getNumberOfDays() + " days");

	}

}
