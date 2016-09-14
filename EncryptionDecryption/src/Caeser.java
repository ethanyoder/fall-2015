import java.util.Scanner;
/* The Caeser cipher is one of the earliest known and simplest ciphers. 
 * It is a type of substitution cipher in which each letter in the plain text is 'shifted' a 
 * certain number of places down the alphabet.
 */
public class Caeser {

	public static void main(String[] args) {
		
		// Declaring data needed at top... this is good housekeeping!
		String message, encryptedMessage = "";
		int shift = 0; //how many numbers to shift by 
		int count = 0; //lcv
		
		// Get info needed from the user
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter lowercase character to encrypt: ");
		message = keyboard.nextLine().toLowerCase(); // there is no getChar() method... so we improvise!
		System.out.println("You entered " + message);
		
		while (!(shift <= 25 && shift >= -25 && shift != 0))
		{
			System.out.print("Enter shift number (-25 to 25, not 0): ");
			shift = keyboard.nextInt();
		}
		
		// what goes here???
		while (count < message.length())
		{
			char letter = message.charAt(count);
			if (letter != ' ')
			{
				if (letter + shift > 122)
					encryptedMessage += (char)(letter + shift - 26);
				else if (letter + shift < 97)
					encryptedMessage += (char)(letter + shift + 26);
				else 
					encryptedMessage += (char)(letter + shift);
			}
			count ++;
			
		}
		
		System.out.println("Your encrypted message is: " + encryptedMessage);
		keyboard.close();
	}

}
