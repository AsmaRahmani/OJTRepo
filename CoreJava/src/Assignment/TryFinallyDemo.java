package Assignment;

public class TryFinallyDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		int res = test();
		System.out.println("After call, res = "+ res);
		

	}
@SuppressWarnings("finally")
public static int test() throws Exception{
	try{
		return 10/0;
	}
	
	finally{
		System.out.println("Im here from finally block");
		return 20;
	}
}
}
