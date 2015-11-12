//Ethan Yoder
//November 4, 2015
//Tests the Cipher class

import java.util.*;
import java.io.*;

public class TestCipher {

	public static void main(String[] args) {
		
		//declares objects and variables
		Scanner keyboard = new Scanner(System.in);
		int choice = 0;
		
		//displays menu to user and prompts for input
		do
		{
			System.out.println("Choose from a menu item below:");
			System.out.println("1. Specify input file");
			System.out.println("2. Specify output file");
			System.out.println("3. Specify shift");
			System.out.println("4. Encrypt");
			System.out.println("5. Decrypt");
			System.out.println("6. Exit");
			choice = keyboard.nextInt();
			
			switch (choice)
			{
			case 1:
				boolean problem = false;
				do
				{
					System.out.print("Please enter file name");
					String fileName = keyboard.next();
					File inputFile = new File(fileName);
					if (!inputFile.exists())
					{
						System.out.println("File does not exist!");
						problem = true;
					}
					else { problem = false; }
				} while (problem);
			}
		} while (choice != 6);
		
		
		

	}

}
