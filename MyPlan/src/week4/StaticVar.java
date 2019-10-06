package week4;

public class StaticVar {
	static {
		System.out.println("Connetcted");
		
	}
	static int n1 = 20;
	static int n2 = 20;
	static int total = n1+n2;
	static void add(){
		System.out.println("Total is: " + total);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
add();

	}

}
