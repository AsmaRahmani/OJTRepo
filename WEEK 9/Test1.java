package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product{
	String Pname;
	int quantity;
	
	public Product(String pname, int quantity) {
		super();
		Pname = pname;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [Pname=" + Pname + ", quantity=" + quantity + "]";
	}
	
}


public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> l = new ArrayList<Product>();
		l.add(new Product("TV", 400));
		l.add(new Product("Phone", 200));
		l.add(new Product("Laptop", 300));
		l.add(new Product("Keyboard", 200));
		System.out.println("Before Sorting" + l);
		Collections.sort(l,(p1,p2) -> (p1.Pname < p2.Pname)?-1:(p1.Pname > p2.Pname)?1:0);
		System.out.println("After Sorting" + l);

	}

}