package Assignment;

import java.util.TreeMap;

import Assignment.EmployeeRecord;

public class TreeMapQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    TreeMap < Integer, EmployeeRecord> f = new TreeMap<Integer, EmployeeRecord>();

    EmployeeRecord a = new EmployeeRecord(22, "Asma", 'F');
    EmployeeRecord a1 = new EmployeeRecord(22, "Asma", 'F');
    EmployeeRecord a2 = new EmployeeRecord(55, "Ayesha", 'F');
    EmployeeRecord a3 = new EmployeeRecord(20, "Ahmed", 'M');
    EmployeeRecord a4 = new EmployeeRecord(30, "Majid", 'M');
    
    f.put(4, a);
    f.put(2, a1);
    f.put(3, a2);
    f.put(1, a3);
    f.put(5, a4);
  




		
		System.out.println(f.size());
		System.out.println(f);

	}

}

