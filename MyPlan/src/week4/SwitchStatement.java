package week4;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);
		System.out.print("Enter your grade ");
		char grade = in.next().charAt(0);
		
		switch (grade){
		
		case 'A':
			System.out.println("Excellent your mark is between 90 - 100"); 
			break;
			
		case 'B':
			System.out.println("Your mark is between 80 - 89");
			break;
		
		case 'C':
			System.out.println("Your mark is between 64 - 79");
			break;
		
		case 'D':
			System.out.println("Your mark is between 51 - 63");
			break;
			
		case 'F':
			System.out.println("Sorry you failed");
			
			default:
				System.out.println("Enter character A,B,C,D,F");



			
			
		}
		

	}

}
