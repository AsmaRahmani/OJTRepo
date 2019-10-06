package Day2;

public class Customer {
	String custName;
	String custAddress;
	
	Customer(){
		System.out.println("This is default constructor, will put default value in the object");
		
	}
	
	Customer(String na, String Address){
		System.out.println("inside the parameterized constructor");
		custName=na;
		custAddress=Address;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c = new Customer();
		System.out.println(c);
		
		System.out.println("----------------------------");
		
		
		Customer c1= new Customer("Asma","Dubai");
		System.out.println(c1.toString());
		
		

	}
	
	//generate toString() method, it's used to print object
	@Override
	public String toString() {
		return "Customer [custName=" + custName + ", custAddress="
				+ custAddress + "]";
	}

}
