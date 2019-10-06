package Day2;

public class DefaultValueDemo {
	int id;   //Default value = 0
	long emiratesID;  //Default value = 0
	String name;    //Default value = null
	double salary;   //Default value = 0.0
	char gender;     //Default value = empty 
	boolean isActive;   //Default value = false
	

	
	
	
	public void setId(int id) {
		this.id = id;
	}


	public void setEmiratesID(long emiratesID) {
		this.emiratesID = emiratesID;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}


	public int getId() {
		return id;
	}


	public long getEmiratesID() {
		return emiratesID;
	}


	public String getName() {
		return name;
	}


	public double getSalary() {
		return salary;
	}


	public char getGender() {
		return gender;
	}


	public boolean isActive() {
		return isActive;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultValueDemo obj = new DefaultValueDemo();
		System.out.println(obj.getName()+"  "+obj.getEmiratesID()+"  "+
		obj.getId()+"   "+obj.getGender()+"   "+obj.getSalary()+"   "+
				obj.isActive);
		System.out.println("---------------------------");
		
		obj.setId(440535);
		obj.setName("Asma");
		obj.setSalary(22000);
		obj.setActive(true);
		obj.setEmiratesID(1112525415);
		obj.setGender('F');
		
		
		System.out.println(obj.getName()+"   "+obj.getId()+"   "+
		obj.getEmiratesID()+"   "+obj.getGender()+"   "+obj.getSalary()
		+"  "+obj.isActive);
		
		
	}


}
