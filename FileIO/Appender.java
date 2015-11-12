//Ethan Yoder
//November 11, 2015
//Appends text and then displays it

import java.io.*;
import java.util.*;

public class Appender {

	public static void main(String[] args) throws IOException {
		
		//creates Scanner, FileWriter, and PrintWriter objects
		Scanner console = new Scanner(System.in);
		FileWriter append = new FileWriter("text.txt", true);
		PrintWriter write = new PrintWriter(append);
		
		//prompts user for input
		System.out.println("Write text to add to file");
		write.println(console.nextLine());
		
		//creates Scanner and File object
		File text = new File("text.txt");
		Scanner show = new Scanner(text);
		
		//shows appended text file
		System.out.println("Original line of text");
		System.out.println(show.nextLine());
		System.out.println("Added line of text:");
		System.out.println(show.nextLine());
		
		write.close();
	}

}
