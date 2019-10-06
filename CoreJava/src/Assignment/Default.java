package Assignment;


public class Default {
	
	int StaffID;
	String name;
	double Salary;
	


	public int getStaffID() {
		return StaffID;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return Salary;
	}

	public void setStaffID(int staffID) {
		StaffID = staffID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Default d = new Default();
		
		d.setName("Asma");
		d.setSalary(15000);
		d.setStaffID(434056);
		
		System.out.println(d.getName()+ "  " + d.getStaffID()+"   "+ d.getSalary());
		
	}


}
