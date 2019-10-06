package week4;

abstract class a {
	public abstract void Firstname();
	public void Lastname(){
		System.out.println("Nice to meet you");
	}
}
 class b extends a {
	 public void Firstname(){
		 System.out.println("My name is Asma");
	 }
	 }

	
public class AbstractDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		b obj = new b();
		obj.Firstname();
		obj.Lastname();

	}

}
