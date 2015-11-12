//Ethan Yoder
//November 5, 2015
//Accepts input, puts it into a file, and then reads it again

import java.util.*;
import java.io.*;

public class Displayer {
	
	public static void main(String[] args) throws IOException {
		
		//creates Scanner and PrintWriter object
		Scanner console = new Scanner(System.in);
		PrintWriter text = new PrintWriter("text.txt");
		
		//declares variables
		String holder;
		
		//prompts user for input and writes it to the text file
		System.out.println("Enter text to be put into a file");
		holder = console.nextLine();
		text.println(holder);
		
		//closes file
		text.close();
		
		//creates File and Scanner object
		File read = new File("text.txt");
		Scanner reader = new Scanner(read);
		
		//displays the text of the file
		System.out.println(reader.nextLine());
	}

}
