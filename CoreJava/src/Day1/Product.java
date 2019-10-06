package Day1;

public class Product {
	String pname;
	double price;
	double tax;
	
	

	public void setPname(String pname) {
		this.pname = pname;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public void setTax(double tax) {
		this.tax = tax;
	}



	public String getPname() {
		return pname;
	}



	public double getPrice() {
		return price;
	}



	public double getTax() {
		return tax;
	}

public double printBillValue(){
	
	 return price=(price+tax/100);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p = new Product ();
		p.setPname("Mobile");
		p.setPrice(1500);
		p.setTax(3.5);
		
		System.out.println(p.getPname()+"   "+ p.getPrice() +"   "+ p.getTax());
		
		Product p1 = new Product();
		p1.setPname("TV");
		p1.setPrice(3500);
		p1.setTax(3.5);
		System.out.println(p1.getPname()+"   "+ p1.getPrice() +"   "+ p1.getTax());
		System.out.println("bill value is =" + p.printBillValue());

	}

}
