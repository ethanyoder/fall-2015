//Ethan Yoder
//October 31, 2015 (Happy Halloween!)
//Simulates a coin being tossed

import java.util.*;

public class Coin {
	
	Random rand = new Random();
	
	//declares variables
	private String sideUp = "Heads";
	private int result;
	public int heads;
	public int tails;
	
	//creates a no-arg constructor
	public Coin()
	{
		toss();
	}
	
	//simulates the coin toss
	public void toss()
	{
		for (int i = 1; i <= 20; i++)
		{
			result = rand.nextInt(2);
			//sets the side up for coin and adds to its total
			if (result == 0)
			{
				sideUp = "Heads";
				heads ++;
			}
			if (result == 1)
			{
				sideUp = "Tails";
				tails ++;
			}
			//displays the side that is currently up
			System.out.println(getSideUp());
		}
	}
	
	//returns the side that is up
	public String getSideUp()
	{
		return sideUp;
	}
	
}
