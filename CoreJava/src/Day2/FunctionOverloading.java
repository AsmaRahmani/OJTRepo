package Day2;

public class FunctionOverloading {

	public void add(int a, int b, int c){
		System.out.println(a+b+c);
	}
	
	public void add(String a, String b){
		System.out.println(a+"  "+b);
	}
	
	public void add(float a, float b){
		System.out.println(a+b);
	}
	

	public static void main(String[] args) {
		
		
		FunctionOverloading obj = new FunctionOverloading();
		obj.add(20,22,30);
		obj.add("Asma", "Rahmani");
		obj.add(10.5f, 50.99f);
	

	}
	

}
