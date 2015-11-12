//Ethan Yoder
//November 4, 2015
//stores file infor and cipher info for encryption/decryption

import java.io.*;
import java.util.*;

public class Cipher {

	//declares variables
	private int shift;
	private String inputFile;
	private String outputFile;
	/**
	 * @return the shift
	 */
	public int getShift() {
		return shift;
	}
	/**
	 * @param shift the shift to set
	 */
	public void setShift(int shift) {
		this.shift = shift;
	}
	/**
	 * @return the inputFile
	 */
	public String getInputFile() {
		return inputFile;
	}
	/**
	 * @param inputFile the inputFile to set
	 */
	public void setInputFile(String inputFile) {
		this.inputFile = inputFile;
	}
	/**
	 * @return the outputFile
	 */
	public String getOutputFile() {
		return outputFile;
	}
	/**
	 * @param outputFile the outputFile to set
	 */
	public void setOutputFile(String outputFile) {
		this.outputFile = outputFile;
	}
	
	public void encrypt() throws IOException
	{
		File file = new File(inputFile);
		Scanner input = new Scanner(file);
		
		PrintWriter output = new PrintWriter(outputFile);
		
		String message = "";
		
		while (input.hasNextLine())
		{
			message = input.nextLine();
			int counter = 0;
			while(counter < message.length()){
				// encrypt the character by applying the shift
				char letter = message.charAt(counter);
				if( letter != ' '){
					if (letter + shift > 122)
						output.print((char)(letter + shift - 26)); //loop back to the beginning
					else if(letter + shift < 97)
						output.print((char)(letter + shift + 26)); //loop back to the end
					else
						output.print((char)(letter + shift)); //no looping needed
				}
				counter++;
				output.println();
			}//while
			input.close();
			output.close();
		}
	}
	
}
