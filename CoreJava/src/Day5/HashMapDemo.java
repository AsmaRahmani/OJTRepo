package Day5;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <Integer,String>map = new HashMap<Integer,String>();
		
		map.put(100, "Java");
		map.put(10, "Oracle");
		map.put(1, "C++");
		map.put(100, "Java");
		map.put(200, "Dot Net");
		map.put(400, "Unix");
		map.put(100, "Java");
		
		System.out.println(map.size());
		System.out.println(map);

	}

}
