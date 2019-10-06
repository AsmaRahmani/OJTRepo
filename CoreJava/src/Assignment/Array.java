package Assignment;

import java.util.ArrayList;



public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<EmployeeRecord> a = new ArrayList<EmployeeRecord>();
		
		EmployeeRecord s1 = new EmployeeRecord(44,"Asma",'F');
		EmployeeRecord s2 = new EmployeeRecord(55,"Ahmed",'M');
		EmployeeRecord s3 = new EmployeeRecord(50,"Ayesha",'F');
		EmployeeRecord s4 = new EmployeeRecord(50,"Majid",'M');
		
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		
		 a.size();
	     System.out.println(a);
	     
	     System.out.println(a.isEmpty());
	     a.remove(0);
	     System.out.println(a);
	   
	}

}
