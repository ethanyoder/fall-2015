// Simple grader program
// September 2nd, 2015
// Author: Alicia McNett

import static java.lang.Math.*;
import java.util.*;

import java.util.Scanner;

public class Grader {
  public static void main(String[] args){
	int sum = 0;
	int count = 0;
    Scanner console = new Scanner(System.in);
    int grade = 0;  //lcv
    while(grade != -1){
    	System.out.println("Please enter a grade or -1 to quit");
    	grade = console.nextInt();
    	if (grade != -1)
    	{
    	sum = sum + grade;
    	count++;
    	System.out.println("Sum " + sum + ", Count " + count);
    	}
    }
    
    double average = ((sum) / count);
    int roundedAverage = (int)round(average);
    System.out.println("The average is " + roundedAverage);

  }
}
