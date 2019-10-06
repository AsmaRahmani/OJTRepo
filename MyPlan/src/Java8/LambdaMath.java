package Java8;

interface Interf{
	//void 
	int numbers(int a,int b);
}
public class LambdaMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Interf add = (a,b) -> (a+b);
		System.out.println("Addition = " + add.numbers(10, 10));
		
		
		Interf Sub = (a,b) ->(a-b);
		System.out.println("Subtraction = " + Sub.numbers(10, 10));
		

		Interf Div = (a,b) ->(a/b);
		System.out.println("Division  = " + Div.numbers(100, 50));
		
		
		Interf Multi = (a,b) -> (a*b);
		System.out.println("Multiplication = " + Multi.numbers(200, 200));
		
		
		
		}

}
	
	

