// Simple grader program with a loop!
// October 21st, 2015
// Author: Alicia McNett

import java.io.*;
import java.util.*;
import static java.lang.Math.*;

import java.util.Scanner;


public class Grader {
  public static void main(String[] args) throws IOException{

    Scanner keyboard = new Scanner(System.in);
   // FileWriter fw = new FileWriter("cool.txt", true);
   // PrintWriter outFile = new PrintWriter(fw);
    File myFile = new File("cool.txt");
    Scanner input = new Scanner(myFile);
   // System.out.println("Please enter a grade or -1 to quit");
    int grade = keyboard.nextInt();
    //outFile.println(grade);
    int count = 0;
    int sum = 0;
    double average = 0;

    while(input.hasNextLine()){
      sum += grade;
      count++;
      System.out.println("Please enter a grade or -1 to quit");
      //outFile.println(grade);
      grade = input.nextInt();
    }
    input.close();
    average = ((double)sum)/count;
    int roundedAverage = (int)round(average);
    System.out.println("The average is " + roundedAverage);
   // outFile.println(average);
    keyboard.close();
  //  outFile.close();
  }
}
