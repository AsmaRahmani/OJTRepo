package Day2;

public class Employee {

	String name;
	
	// if instance variable and function parameter are same we don't need to use this.
	//
	
	public void setName(String name ) {
		this.name = name;
	}


	public String getName() {
		return name;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1= new Employee();
		System.out.println(e1.getName());
		e1.setName("Meera");
		System.out.println(e1.getName());


	}


}
