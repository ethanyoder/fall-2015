//Ethan Yoder
//November 6, 2015
//Displays entered text from a file and then adds more to it

import java.util.*;
import java.io.*;

public class DisplayerAppender {

	public static void main(String[] args) throws IOException {
		
		//creates Scanner and PrintWriter objects
		Scanner console = new Scanner(System.in);
		PrintWriter line = new PrintWriter("txt.txt");
		
		//prompts user for input
		System.out.println("Enter your text:");
		line.println(console.nextLine());
		line.close();
		
		//displays that line of text
		File scan = new File("txt.txt");
		Scanner txtScan = new Scanner(scan);
		System.out.println("This is the line of text you typed");
		System.out.println(txtScan.nextLine());
		
		//allows text to be edited
		FileWriter edit = new FileWriter("txt.txt", true);
		PrintWriter change = new PrintWriter(edit);
		System.out.println("Enter text:");
		change.println(console.nextLine());
		change.close();
		
		//shows new text file
		File scan2 = new File("txt.txt");
		Scanner newTxt = new Scanner(scan2);
		System.out.println("This is the new text file");
		System.out.println(newTxt.nextLine()); 
		System.out.println(newTxt.nextLine());
		

	}

}
