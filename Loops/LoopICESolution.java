
public class LoopICESolution {

	public static void main(String[] args) {
		
		int max = 5;
		for (int row = 0; row < max; row ++){
			for (int col = 0; col <= row; col ++){
				if (row % 2 == 0) //odd
					System.out.print("$");
				else //even
					if (col % 2 != 0)
						System.out.print("#");
					else
						System.out.print("&");
		//		System.out.print("col is " + col + " row is " + row);
			}
			System.out.println();
			
		}

	}

}
