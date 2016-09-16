/****************************************************************************
 *
 * Created by: Jess and Craig
 * Created on: Sept 2016
 * This program accepts two dimensions from a user and gives them the 
 * third to make a board foot.
 ****************************************************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class footifier {

	public static int BoardFoot (int firstDimension, int secondDimension) {
		
		int thirdDimension = 144/ (firstDimension * secondDimension); 
		
		return thirdDimension;
		
	}
	
	public static void main(String[] args) throws IOException {
		
		int firstDimension;
		int secondDimension;
		int thirdDimension;
		
		System.out.println("What is the first dimension?");
		
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		firstDimension = Integer.parseInt(br.readLine());
		
		System.out.println("What is the second dimension?");
		
		secondDimension = Integer.parseInt(br.readLine());
		
		thirdDimension = BoardFoot(firstDimension, secondDimension);
		
		System.out.println("Your third dimension is " + thirdDimension);
	}
	
}
