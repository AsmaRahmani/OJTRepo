package week5;

class Addition{
	int sum = 0;
	
	public int add(int a, int b){
		sum = a+b;
		return sum;
	}
}

public class MethodDec {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition obj =new Addition();
		int i = obj.add(10, 10);
		 System.out.println("Sum of two integer values :"+ i); 

	}

}
