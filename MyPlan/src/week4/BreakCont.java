package week4;

import java.util.Scanner;

public class BreakCont {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BreakCont obj = new BreakCont();
		obj.For();
		obj.Break();
		obj.Continue();
		obj.If();
		obj.Swtich();
		obj.DoWhile();
		
	}	
	
	
	
	static void For (){
		System.out.println("Call For loop method");
		int [] numbers = {1,2,3,4,5};
		for(int j =0; j<numbers.length; j++){
			System.out.println("Elements in the loop: " + numbers[j]);
		}
		System.out.println("...................");
	}
	
	
	
	
	
	
	
	
	static void Break(){
		System.out.println("Call Break method");
		for (int a =0; a<20; a++){
			if(a == 5){
				break;
			}
			System.out.println(a);
			
		}
		System.out.println("...................");
	}	
	
	
	
	
	
	
	
	
	static void Continue(){
		System.out.println("Call Continue method");
		for (int i = 0; i < 10; i++) {
			  if (i == 5) {
			    continue;
			  }
			  System.out.println(i);
			} 
		System.out.println("...................");

	}
	
	
	
	
	
	
	
	
	static void If(){
		System.out.println("Call if else method");
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
		
		System.out.println("...................");

	}
	
	
	
	
	
	
	
	
	
	
	static void Swtich(){
		System.out.println("Call Swtich method");

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
		System.out.println("...................");

	}
	
	
	
	
	
	
	
	
	
	
	static void DoWhile(){
		System.out.println("Call do while method");

		int i = 0;
		int asma [] = {10,20,30,40};
		do{
			System.out.println(asma[i]);
			i++;
		}
		
		while(i<2);
	}
	
}
