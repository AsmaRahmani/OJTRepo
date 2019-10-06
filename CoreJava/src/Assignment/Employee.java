package Assignment;


class EmployeeData{
	public int salary = 15000;
	public void Pre( String pre){
		System.out.println("Fisrt:   "+ pre );
		
	}
	
	public void New(String pre){
		System.out.println("Second:    "+ pre);
	}
}

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeData e = new EmployeeData();
		e.Pre("your previous amount was:  " + e.salary);
		 e.salary=20000;
		 e.New("your new salary is: "+ e.salary);
		

	}

}
  