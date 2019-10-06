package Assignment;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("Asma");
		list.add("Marwan");
		list.add("Zayed");
		
		System.out.println("Elemens in the array: " + list);
		
		System.out.println("Array size is " + list.size());
		
		System.out.println("Checking if the array is empty: " + list.isEmpty());
		
		System.out.println("Remove 2 values from the array: " + list.remove(2));
		
		System.out.println("The index for Marwan is: " + list.indexOf("Marwan"));
		
		System.out.println("Check if the array conatins the word Ahmed: " + list.contains("Ahmed"));
		
		list.add(2, "Maitha");
		System.out.println("We add Maitha in index 2 "+ list);
		
		System.out.println("Print the name at index 2: "+ list.get(2));
		
		list.set(1, "Hema");
		System.out.println("Insert Hema at index 1: "+ list);
		
		list.clear();
		System.out.println("Clean the array" + list);
		
	}

}
