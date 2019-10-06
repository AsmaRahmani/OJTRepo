package week4;

public interface InterfaceDemo {
	public void Firstname();
	public void Lastname();
	
	 class c implements InterfaceDemo {
		 public void Firstname(){
			 System.out.println("My name is Asma");
		 }
		 
		 public void Lastname(){
			 System.out.println("Nice yo mee you");
		 }
		 }
	 
	 class MyMain {
		 public static void main (String [] args){
			 c obj1 = new c();
			 obj1.Firstname();
			 obj1.Lastname();
		 }
	 }

}
