package Assignment;

public class Asma {
	
	public void add(int a, int b){
		System.out.println(a+b);
		
	}
	
	public void add(int a, int b, int c){
		System.out.println(a+b+c);
	}
	
	public void add(double a, double b){
		System.out.println(a+b);
	}
	
	
	
	public static void main (String [] args){
		
		Asma obj = new Asma ();
		
		obj.add(6, 3);
		obj.add(10.5, 3.9);
		obj.add(5, 10, 55);
		
	}
}