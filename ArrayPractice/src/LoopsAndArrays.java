//Ethan Yoder
//November 18, 2015
//Stores and modifies a list of video serial numbers

import javax.swing.*;
import java.io.*;
import java.util.*;

public class LoopsAndArrays {
	
	public static void save(int[] sn) throws IOException{
		PrintWriter pw = new PrintWriter("dad.csv");
		for (int j = 0; j < sn.length; j++)
		{
			pw.print(sn[j] + ",");
		}
		pw.close();
	}

	public static void main(String[] args) throws IOException { 
	
		//declares variables
		int[] serialNum = new int[10];
		int option;
		int searchItem;
		int loc;
		int foundLoc;
		int i = 0;
		int itemAdd;
		int addLoc;
		
		//gives values to the serialNum array
		File f = new File("data.csv");
		Scanner inputFile = new Scanner(f);
		
		while(inputFile.hasNextLine())
		{
			String line = inputFile.nextLine();
			//populate the array
			String[] values = line.split(",");
			for (int j = 0; j < values.length; j++)
			{
				serialNum[j] = Integer.parseInt(values[j]);
			}
		}
		inputFile.close();
		
		//gives user menu to choose from
		do
		{
			option = Integer.parseInt(JOptionPane.showInputDialog("Options:\n0 - Quit\n1 - Print Serial Numbers\n2 - Delete Serial Number\n3 - Add Serial Number"));
			 
			//prints serial numbers
			if (option == 1)
			{
				for (int j = 0; j < serialNum.length; j++)
				{
					if (serialNum[j] != 0)
					System.out.println(serialNum[j]);
				}
			}
			//deletes a serial number
			else if (option == 2)
			{
				foundLoc = -1;
				searchItem = Integer.parseInt(JOptionPane.showInputDialog("Enter number to be deleted"));
				for (loc = 0; loc < serialNum.length; loc++)
				{
					if (serialNum[loc] == searchItem)
						foundLoc = loc;
				}
				if (foundLoc != -1)
				{
					for (i = foundLoc; i < serialNum.length-1; i++){
						serialNum[i] = serialNum[i+1];
					}
					serialNum[serialNum.length-1] = 0;
				}
				else
					System.out.println("Serial number was not found");
			}
			//handles adding a serial number
			else if (option == 3)
			{
				itemAdd = Integer.parseInt(JOptionPane.showInputDialog("Enter number to be added"));
				addLoc = -1;
				for (int k = 0; addLoc !=0 && k < serialNum.length; k++)
				{
					if (serialNum[k] == 0)
						addLoc = k;
				}
				if (addLoc != -1)
					serialNum[addLoc] = itemAdd;
				else
					System.out.println("All spots are full of serial numbers");
			}
			save(serialNum);
		} while(option != 0);
		
		System.exit(0);
		
		
		
		
	
}
}