package Assignment;

public class MyData {

	private String name;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyData m = new MyData();
		m.setName("Asma");
		System.out.println(m.getName());

	}

}
