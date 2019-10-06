package Day2;

public class Student {
	String staffID;
	String staffName;
	final String stream;

	public Student(String staffID, String staffName, String stream) {
		super();
		this.staffID = staffID;
		this.staffName = staffName;
		this.stream = stream;
	}
	
	
	@Override
	public String toString() {
		return "Student [staffID=" + staffID + ", staffName=" + staffName
				+ ", stream=" + stream + "]";
	}
	



	public void setStaffID(String staffID) {
		this.staffID = staffID;
	}



	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}



	public String getStaffID() {
		return staffID;
	}



	public String getStaffName() {
		return staffName;
	}



	public String getStream() {
		return stream;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student ("s440535","Asma","Web & mobile");
		System.out.println(s1);
		Student s2 = new Student ("s44215","Marwan","Java");
		System.out.println(s2);

	}


}
