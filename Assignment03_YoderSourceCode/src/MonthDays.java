//Ethan Yoder
//October 16, 2015
//Determines the days in a certain month of a certain year, taking leap years into account

public class MonthDays {

	//declares variables
	private int month;
	private int year;
	
	//creates constructor that accepts two arguments
	public MonthDays(int month2, int year2)
	{
		month = month2;
		year = year2;
	}
	
	//creates a getter
	public int getNumberOfDays()
	{
		if (year % 100 == 0)
		{
			if (year % 400 == 0)
			{
				switch (month)
				{
					case 1 :
					case 3 :
					case 5 :
					case 7 :
					case 8 :
					case 10:
					case 12:
						return 31;
					case 2 :
						return 29;
					default:
						return 30;
				}
			}
			else
			{
				switch (month)
				{
					case 1 :
					case 3 :
					case 5 :
					case 7 :
					case 8 :
					case 10:
					case 12:
						return 31;
					case 2 :
						return 28;
					default:
						return 30;
				}
			}
		}
		else if (year % 4 == 0)
		{
			switch (month)
			{
				case 1 :
				case 3 :
				case 5 :
				case 7 :
				case 8 :
				case 10:
				case 12:
					return 31;
				case 2 :
					return 29;
				default:
					return 30;
			}
		}
		else 
		{
			switch (month)
			{
				case 1 :
				case 3 :
				case 5 :
				case 7 :
				case 8 :
				case 10:
				case 12:
					return 31;
				case 2 :
					return 28;
				default:
					return 30;
			}
		}
	}
}
