package Day5;

import java.util.HashSet;

public class StudentHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Student> set = new HashSet<Student>();
		
		Student s1 = new Student(100,"Asma",98);
		Student s2 = new Student(200,"Ayesha",58);
		Student s3 = new Student(100,"Asma",98);
		Student s4 = new Student(300,"Hind",99);
		Student s5 = new Student(400,"Khawla",80);
		Student s6 = new Student(500,"Ahmed",88);
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		set.add(s6);
		
		System.out.println(set.size());
		System.out.println(set);

	}

}