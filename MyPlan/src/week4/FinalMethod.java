package week4;

class Base {
	
	public void dis(){
		System.out.println("I'm in finalMethod class");
	}
	}

public class FinalMethod extends Base {
	public void dis()
	{
		System.out.println("I'm in FinalMethod class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalMethod obj = new FinalMethod();
		obj.dis();

	}

}