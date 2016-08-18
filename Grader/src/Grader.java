import static java.lang.Math.*;

public class Grader {

	public static void main(String[] args) {
		
		int grade1 = 79;
	    int grade2 = 80;
	    int grade3 = 80;
	    double average = ((grade1 + grade2 + grade3) / 3.0);
	    int roundedAverage = (int)Math.round(average);
	    System.out.println("The average is " + roundedAverage);
	    
	    if (roundedAverage < 60)
	    {
	    	System.out.println("You have a F");
	    }
	    else if (roundedAverage < 70)
	    {
	    	System.out.println("You have a D");
	    }
	    else if (roundedAverage < 80)
	    {
	    	System.out.println("You have a C");
	    }
	    else if (roundedAverage < 90)
	    {
	    	System.out.println("You have a B");
	    }
	    else
	    {
	    	System.out.println("You have an A");
	    }
	}

}
