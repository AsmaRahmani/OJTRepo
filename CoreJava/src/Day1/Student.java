package Day1;

public class Student {
	 int sid;
	 String sname;
	 double mark;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student();
		s.sid = 50;
		s.sname = " Aisha ";
		s.mark=99.58;
			
		
System.out.println(s.sname + "    " + s.sid +"    "+ s.mark);

Student s1 = new Student();
s1.sid = 440535;
s1.sname = "ASMA";
s1.mark=91.31;

System.out.println(s1.sname + "    " + s1.sid +"    "+ s1.mark);
	}


}
