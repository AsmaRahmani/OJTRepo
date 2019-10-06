package Day4;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println("main starts");
		try{
			System.out.println("Insdie try");
		int result = 100/Integer.parseInt(args[0]);
		System.out.println("Result: " + result);
		
		}
		catch(Exception ex){
			System.out.println("Insdie catch");
			System.out.println(ex);
		}
		System.out.println("main ends");
		

	}

	}

