package Day2;

public class EmployeeDetail {
	int id;
	String name;
	static String company = "Emirates";
	
	
	
	public EmployeeDetail(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "EmployeeDetail [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetail obj = new EmployeeDetail(100,"ASMA");
		System.out.println(obj.toString()+"  "+ EmployeeDetail.company);
		
		EmployeeDetail obj1 = new EmployeeDetail(150,"MARWAN");
		System.out.println(obj1.toString()+"  "+ EmployeeDetail.company);

	}


}
