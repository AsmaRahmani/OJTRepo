package Assignment;

interface Math1 {
	void add (int a, int b);
	void mul (int a, int b);
}

interface Math2 {
	void div (int a, int b);
	void sub (int a, int b);
}

class Implements implements Math1, Math2{

	@Override
	public void div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a/b);
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a-b);
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a*b);
	}
	
}



public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Implements e = new Implements();
		e.add(20, 5);
		e.div(200, 2);
		e.mul(2, 2);
		e.sub(20, 10);
		
		

	}

}
