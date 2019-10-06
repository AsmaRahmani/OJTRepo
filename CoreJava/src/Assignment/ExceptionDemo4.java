package Assignment;

public class ExceptionDemo4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	System.out.println("Hi I'm from main");
	try{
		System.out.println("Insdie try");
	int result = 100/Integer.parseInt(args[0]);
	System.out.println("Result: " + result);
	
	}
	catch(Exception ex){
		System.out.println("Insdie catch");
		System.out.println(ex);
	}
	
	finally {
		System.out.println("I will be excuted at any situation");
		System.out.println("am here to do clean up work");
	}
	System.out.println("main ends");
	

}

}
