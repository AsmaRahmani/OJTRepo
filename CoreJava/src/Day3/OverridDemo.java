package Day3;

class Parent{

public void f1(){
   System.out.println("f1 from parent");
}

public void f2(){
   System.out.println("f2 from parent");
}
}

class Child extends Parent{

public void f2(){
	//super.f2();   we use this to call the parent implementation as well.
   System.out.println("f2 from child");
}


}


public class OverridDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Child obj= new Child();
	       obj.f1();
	       obj.f2();
	    
	}

}

