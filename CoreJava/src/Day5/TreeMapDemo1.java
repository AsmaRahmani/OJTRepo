package Day5;

import java.util.TreeMap;

public class TreeMapDemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap <String, String>map = new TreeMap<String, String>();
		
		map.put("Database", "Oracle");
		map.put("Frontend", "React");
		map.put("UI", "Angular");
		map.put("Middle tier", "java");
		map.put("OS", "windowa");
		
		System.out.println(map.size());
		System.out.println(map);

	}

}
