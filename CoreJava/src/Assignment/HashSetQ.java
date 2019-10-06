package Assignment;

import java.util.HashSet;

public class HashSetQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<EmployeeRecord> e = new HashSet<EmployeeRecord>();
		
		EmployeeRecord e1 = new EmployeeRecord(21, "Asma", 'F');
		EmployeeRecord e2 = new EmployeeRecord(21, "Asma", 'F');
		EmployeeRecord e3 = new EmployeeRecord(20, "Marwan", 'M');
		EmployeeRecord e4 = new EmployeeRecord(30, "Ahmed", 'M');
		
		e.add(e1);
		e.add(e2);
		e.add(e3);
		e.add(e4);
		
		
		 
		 System.out.println(e.size());
		 System.out.println(e);
		 

	}

}
