//Ethan Yoder
//April 5, 2016
//This program changes values in a non-text file

import java.io.*;

public class RandomAccessReview {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile f = new RandomAccessFile("movies.dat", "rw");
		System.out.println(f.getFilePointer());
	}

}
