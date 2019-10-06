package Day5;



import java.util.LinkedHashSet;


public class LinkedSetDemo {
   public static void main(String[] args) {
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		 set.add(100);
		 set.add(10);
		 set.add(120);
		 set.add(100);
		 set.add(130);
		 
		 System.out.println(set.size());
		 System.out.println(set);
		 
		 

	}
}
