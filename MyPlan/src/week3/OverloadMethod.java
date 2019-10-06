package week3;

public class OverloadMethod {

	
	
	public void Multiply(int a, int b){
		System.out.println(a*b);
	}
	
	public void Multiply(int a, double b){
		System.out.println(a*b);
	}
	public void Multiply(int a, int b, double c){
		System.out.println(a*b*c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverloadMethod o = new OverloadMethod();
		System.out.println("First method int*int");
		o.Multiply(5, 5);
		System.out.println("Second method int*double");
		o.Multiply(5, 5.5);
		System.out.println("First method int*int*double");
		o.Multiply(10, 10, 20.5);

	}
}
