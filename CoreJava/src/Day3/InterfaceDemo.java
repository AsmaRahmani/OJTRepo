package Day3;

public class InterfaceDemo {
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
		
	}

	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a-b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceDemo i = new InterfaceDemo();
		i.add(100, 200);
		i.sub(20, 10);
	}

	

}
