//Ethan Yoder
//October 31, 2015
//Tests the Coin class

public class CoinTest {

	public static void main(String[] args) {
		
		//displays side that is initially facing up
		System.out.println("The current side up is Heads");
		
		//creates Coin class object
		Coin obj1 = new Coin();
		
		//displays total heads and tails flips
		System.out.println("Heads: " + obj1.heads + "   Tails: " + obj1.tails);

	}

}