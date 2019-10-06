package Assignment;

public class StringIndexException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String a = "AsmaRahmani";
			System.out.println(a.length());
			char c = a.charAt(0);
			c= a.charAt(20);
			System.out.println(c);
				
		}
		
		catch(StringIndexOutOfBoundsException e){
			System.out.println(e);
		}

	}

}
