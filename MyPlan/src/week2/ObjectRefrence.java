package week2;

public class ObjectRefrence {
	
	String customerName;
	int customerNumber;
	String customerAddress;
	int billAmount;
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ObjectRefrence o = new ObjectRefrence();
		o.customerName = ("ASMA");
		o.customerAddress = ("Dubai");
		o.customerNumber = 506522257;
		o.billAmount = 1500;
		
		
		System.out.println("The customer name is:" + o.customerName
				+"  Customer Address:" + o.customerAddress
				+"  Customer phone number:" + o.customerNumber
				+"  Customer total bill is:" + o.billAmount);
	
	}

}
