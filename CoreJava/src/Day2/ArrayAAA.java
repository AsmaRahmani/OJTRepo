package Day2;

public class ArrayAAA {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] name = {"Asma", "Ahmed", "Ayesha"};
		System.out.println("Our Array contains " + name.length +" Elements");
		
		
		System.out.println("------------------");
		for (int i=0; i<name.length; i++){
			System.out.println(name[i]);
		}
		
		System.out.println("------------------");
		name[0] = "Hema";
		
		for (int i=0; i<name.length; i++){
			System.out.println(name[i]);
		}
		

	}


}
