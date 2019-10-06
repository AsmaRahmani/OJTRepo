package Assignment;

 class Super {
	 int add (int a, int b){
		 return a+b;
	 }
	 
 }
 
 class Sub extends Super{
	 int div (int a, int b){
		 return a/b;
	 }
	 
 }
public class Inhertitance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sub s = new Sub();
		System.out.println(s.add(5, 10));
		System.out.println(s.div(200,10));

	}

}
