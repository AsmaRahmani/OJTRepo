package Day3;

class Product{

    String name;
    double price;

 Product(String name, double price){
     this.name=name;
    this.price=price;
 }

public String toString(){
    return name+"   "+price;
}

}

class Book extends Product{
int noOfPages;

Book(String name,double price, int noOfPages){

super(name,price);
this.noOfPages=noOfPages;
}

public String toString(){
    return super.toString()+"    "+ noOfPages;
}
}


class TV extends Product{
	int inch;
	
	TV (String name, double price, int inch){
		super (name,price);
		this.inch=inch;
	}
	
	public String toString(){
	    return super.toString()+"    "+ inch;
	}
	
}


public class InherDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Book b1=new Book("java",700.90,7000);

	      System.out.println(b1.toString());

	   Book b2=new Book("Oracle",500.90,3000);

	      System.out.println(b2.toString());
	      
	      TV t = new TV("LG", 1499.99, 52);
	      System.out.println(t.toString());
	}


	

}

