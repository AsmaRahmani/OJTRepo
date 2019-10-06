package week3;

public class EncapsDemo {
	
	String name;
	String Dept;
	int StaffID;
	int salary;
	
	

	public String getName() {
		return name;
	}



	public String getDept() {
		return Dept;
	}



	public int getStaffID() {
		return StaffID;
	}



	public int getSalary() {
		return salary;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setDept(String dept) {
		Dept = dept;
	}



	public void setStaffID(int staffID) {
		StaffID = staffID;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapsDemo e = new EncapsDemo();
		e.setName("ASMA");
		e.setDept("Mobility");
		e.setStaffID(440535);
		e.setSalary(25000);
		
		
		
		System.out.println("Employee name: " + e.getName() + 
				"    Employee staff ID: " + e.getStaffID() + 
				"    Employee Department name: "+ e.getDept()+
				"    Employee salary: "+ e.getSalary());
	}

}
