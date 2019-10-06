package week2;


public class SyntaxVariables {

	int ID;
	double mark;
	String name;
	float GPA;
	char gender;	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		SyntaxVariables a = new SyntaxVariables();
		
		a.name = "Asma";
		a.GPA = 3.89f;
		a.ID = 22093;
		a.gender = 'F';
		a.mark = 100;

System.out.println("Name:"+ " " + a.name + "    GPA: "+ " " +a.GPA 
		 + "    Mark: "+ " " +a.mark  + "    ID: "+ " " +a.ID
		 + "    Gender: "+ " " +a.gender);
	}

}
