package Day4;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println("main starts");
		try{
			System.out.println("Insdie try");
		int result = 100/Integer.parseInt(args[0]);
		System.out.println("Result: " + result);
		
		}
		catch(ArithmeticException ex){
			System.out.println("In ArithmeticException catch");
			System.out.println("should not given zero as input");
		}
		
		
		catch(NumberFormatException ex){
			System.out.println("In NumberFormatException catch");
			System.out.println("should not given character as input");
		}
		
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("In ArrayIndexOutOfBoundsException catch");
			System.out.println("program need input");
		}
		
		catch(Exception ex){
			System.out.println("General Exception catch");
			System.out.println("unknown exception check your code please");
		}
		System.out.println("main ends");

	}

	}