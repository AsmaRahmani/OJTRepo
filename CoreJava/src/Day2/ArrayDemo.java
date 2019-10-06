package Day2;

public class ArrayDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = new int[3];
		a[0] = 15;
		a[1]=20;
		a[2]=50;
		
		for(int i=0; i<3; i++){
			System.out.println(a[i]);
		}
		System.out.println("------------------");
		
		double [] rates = {21.3,15.6,18.5,20.3,44.21};
		System.out.println(rates.length);
		for(int j=0; j<3; j++){
			System.out.println(a[j]);
		}
		System.out.println("------------------");
	
	

		String names[] = {"Asma","Hind","Ayseha"};
		for(String s:names)
			System.out.println(s);
}


}
