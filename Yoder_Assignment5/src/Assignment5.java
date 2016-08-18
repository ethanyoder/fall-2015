//Ethan Yoder
//November 20, 2015
//Prints out someone's name and address based off of part of their address

import java.util.*;
import java.io.*;
import javax.swing.*;

public class Assignment5 {

	public static void main(String[] args) throws IOException {
		//creates File object and Scanner object
		File f = new File("zips.csv");
		Scanner sc = new Scanner(f);
		
		//creates a file to hold the name/address combinations
		FileWriter results = new FileWriter("fullAddresses.txt", true);
		PrintWriter write = new PrintWriter(results);
		
		//declares variables
		String name;
		String adr;
		String zip;
		String city;
		char caps;
		String correctedCity = "";
		String[][] info = new String[42328][3];
		String option = "";
		int loc = 0;
		boolean found = false;
		
		//turns the list into a 2D array
		for (int i = 0; sc.hasNext(); i++)
		{
			String line = sc.nextLine();
			String[] temp = line.split(",");
			for (int j = 0; j < 3; j++)
			{
				info[i][j] = temp[j];
			}
		}
		//shows menu for the user
		do
		{
			do
			{
				option = JOptionPane.showInputDialog(null, "Enter 1 to look up full address, 0 to exit program");
					if (option.equals("0"))
					{
						write.close();
						System.exit(0);
					}
					if (option.equals("1"))
						break;
			} while (!option.equals("1"));
			
			//prompts user for name and address input
				name = JOptionPane.showInputDialog(null, "What is your name? (required field)");
				adr = JOptionPane.showInputDialog(null, "What is your street address? (required field)");
				zip = JOptionPane.showInputDialog(null, "What is your ZIP code? (required field)");
			
			//searches for user's ZIP code
			found = false;
			for (int i = 0; i < info.length && found == false; i++)
			{
				if (zip.equals(info[i][0]))
				{
					found = true;
					loc = i;
				}
			}
			if (found == false)
				JOptionPane.showMessageDialog(null, "ZIP code not found!  Try another");
			else
			{
				//corrects punctuation of the city name
				city = info[loc][2].toLowerCase();
				for (int i = 0; i < city.length(); i++)
				{
					if (i == 0)
					{
						caps = (char)(city.charAt(0) - 32);
						correctedCity = caps + city.substring(1);
					}
					if (city.charAt(i) == ' ')
					{
						caps = (char)(city.charAt(i+1) - 32);
						correctedCity = correctedCity.substring(0,(i+1)) + caps + correctedCity.substring(i+2);
					}
				}
				
				//displays user's name, street address, ZIP, city, and state
				JOptionPane.showMessageDialog(null, name + ", " + adr + ", " + correctedCity + ", " + info[loc][1] + " " + info[loc][0]);
				write.println(name + ", " + adr + ", " + correctedCity + ", " + info[loc][1] + " " + info[loc][0]);
			}
			
		} while (option != "0");
			write.close();
			System.exit(0);
	}
}
