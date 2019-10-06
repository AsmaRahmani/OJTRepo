package Day4;

public class ConvertToInt {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int result = 0;
			for (int i = 0; i<5; i++)
				result = result+Integer.parseInt(args[0]);
		
			System.out.println("Sum value is " + result);
			

	}

}
