package week2;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = 10;
		int b = (int) a;
		char c = 'F';
		int d = c;
		
		System.out.println("Narrowing casting must be done manually by placing the type in parentheses in front of the value");
		System.out.println("double value: " +a);
		System.out.println("int value: "+b);
		
		System.out.println("--------------------------");

		
		System.out.println("Widening casting is done automatically when passing a smaller size type to a larger size type:");
		System.out.println("char value: "+c);
		System.out.println("int value: "+d);
		
		

	}

}
