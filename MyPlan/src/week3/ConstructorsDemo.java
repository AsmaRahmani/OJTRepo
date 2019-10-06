package week3;


public class ConstructorsDemo {
	
String ProductName;
int NumberOfItem;
int ProductID;


	public ConstructorsDemo(String ProductName, int NumberOfItem, int ProductID) {
	super();
	this.NumberOfItem = NumberOfItem;
	this.ProductID = ProductID;
	this.ProductName = ProductName;
	
	// TODO Auto-generated constructor stub
}



	@Override
	public String toString() {
		return "ConstructorsDemo [ProductName=" + ProductName + ", NumberOfItem=" + NumberOfItem + ", ProductID="
				+ ProductID + "]";
	}




	public void setProductName(String productName) {
		ProductName = productName;
	}



	public void setNumberOfItem(int numberOfItem) {
		NumberOfItem = numberOfItem;
	}



	public void setProductID(int productID) {
		ProductID = productID;
	}



	public String getProductName() {
		return ProductName;
	}



	public int getNumberOfItem() {
		return NumberOfItem;
	}



	public int getProductID() {
		return ProductID;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorsDemo C1 = new ConstructorsDemo ("TV",500, 11);
		System.out.println(C1);
		ConstructorsDemo C2 = new ConstructorsDemo ("Phone",1000, 10);
		System.out.println(C2);
		ConstructorsDemo C3 = new ConstructorsDemo ("Radio",200, 5);
		System.out.println(C3);

	}

}
