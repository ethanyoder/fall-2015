import java.util.Arrays;

//Ethan Yoder
//December 2, 2015
//Corresponds rainfall amounts with their respective months

public class ArrayExercise{
	
  //static double[] rain;

  public static void main (String[] args){

    String[] months = {"January" , "February" , "March" , "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    double[] rain = {2.3, 1.2, 1.0, 4.2, 2.3, 1.9, 2.3, 0.9, 0.3, 1.6, 2.7, 1.0};

    // print the contents of the array with one month and its corresponding rainfall on each line
    for (int i = 0; i < months.length; i++)
    	System.out.printf("%-10s %4.1f %n", months[i],rain[i]);

    average(rain);
    Arrays.sort(months);
    System.out.println(Arrays.toString(months));
    
    double[] newArray = Arrays.copyOf(rain, 17);
    System.out.println(Arrays.toString(newArray));
    
    // e.g.  "January 2.3"

    average(rain);
  }
  
  static public void average(double[] nums)
  {
	  System.out.println("in average method");
	  double total = 0;
	  for (int i = 0; i < nums.length; i++)
		  total += nums[i];
	  System.out.printf("Average: %.1f \n", total/nums.length);
  }

}