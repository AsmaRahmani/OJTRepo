package Day3;


//abstract class is a class with some abstract method
//abstract method is a written without implementation or body
//can not create object for abstract class

abstract class  SuperClass{
	void f1(){
	System.out.println("f1 is from parent");
}
abstract void f2();
}

class SubClass extends SuperClass{
	void f2(){
	System.out.println("this is from child, going to give code");
	}
	
	void f3(){
		System.out.println("f2 from child");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass s = new SubClass ();
		s.f1();
		s.f2();
		s.f3();
	}
}
