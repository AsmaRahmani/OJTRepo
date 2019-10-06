package Assignment;

import java.util.HashMap;
public class HashMapQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap <EmployeeRecord, Boolean> E = new HashMap<EmployeeRecord, Boolean>();
		
		EmployeeRecord s1 = new EmployeeRecord(100,"Asma",'F');
		EmployeeRecord s2 = new EmployeeRecord(100,"Asma",'F');
		EmployeeRecord s3 = new EmployeeRecord(200,"Ayesha",'F');
		EmployeeRecord s4 = new EmployeeRecord(300,"Ahmed",'M');
		EmployeeRecord s5 = new EmployeeRecord(110,"Marwan",'M');
		
		
		
		E.put(s1, true);
		E.put(s2, true);
		E.put(s3, false);
		E.put(s4, true);
		E.put(s5, false);
	
		
		System.out.println(E.size());
		System.out.println(E);

	}

}
