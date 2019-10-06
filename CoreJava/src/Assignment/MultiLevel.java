package Assignment;

class GrandMother {
	void g1(){
		System.out.println("Hi Grandfather");
		
	}
}

class Mother extends GrandMother {
	void g2(){
		System.out.println("Hi Father");
		
	}
}

class MeAsma extends Mother {
	void g3(){
		System.out.println("Hi me");
		
	}
}

public class MultiLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GrandMother g = new GrandMother();
		g.g1();
		
		Mother m = new Mother();
		m.g2();
		
		MeAsma i = new MeAsma();
		i.g3();

	}
}
