package Day5;

import java.util.HashMap;
import java.util.HashSet;

public class StudentHashSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Student, Boolean> map = new HashMap<Student, Boolean>();
		
		Student s1 = new Student(100,"Asma",98);
		Student s2 = new Student(200,"Ayesha",58);
		Student s3 = new Student(100,"Asma",98);
		Student s4 = new Student(300,"Hind",99);
		Student s5 = new Student(400,"Khawla",80);
		Student s6 = new Student(500,"Ahmed",88);
		
		
		map.put(s1, true);
		map.put(s2, true);
		map.put(s3, false);
		map.put(s4, true);
		map.put(s5, false);
		map.put(s6, true);
		
		
		System.out.println(map.size());
		System.out.println(map);
		

	}

}
