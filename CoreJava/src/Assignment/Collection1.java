package Assignment;

import java.util.ArrayList;

public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> Animals = new ArrayList<>();
		 
		Animals.add("Cat");
		Animals.add("Dog");
		Animals.add("Rabbit");
		Animals.add("Monkey");
	
		
		for (int i = 0; i < Animals.size(); i++) {
		    String AinmalName = Animals.get(i);
		    System.out.println(AinmalName);
		}

	}

}
