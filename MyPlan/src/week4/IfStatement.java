package week4;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);
		System.out.print("Please enter a number");
		int number = in.nextInt();
		
		if (number > 0){
			System.out.println("Number is positive");
		}
		
		else if ( number <0){
			System.out.println("Number is negative");
			 
		}
		else {
			 System.out.println("Number is zero");
		}

	}

}
