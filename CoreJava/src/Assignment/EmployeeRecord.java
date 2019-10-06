package Assignment;
public class EmployeeRecord implements Comparable<EmployeeRecord> {
    
    int StaffID;
    String EmpName;
    char gender;
    
    
    public EmployeeRecord(int staffID, String empName, char gender) {
           super();
           StaffID = staffID;
           EmpName = empName;
           this.gender = gender;
    }


    public int getStaffID() {
           return StaffID;
    }


    public String getEmpName() {
           return EmpName;
    }


    public char getGender() {
           return gender;
    }


    public void setStaffID(int staffID) {
           StaffID = staffID;
    }


    public void setEmpName(String empName) {
           EmpName = empName;
    }
    public void setGender(char gender) {
           this.gender = gender;
    }
    @Override
    public String toString() {
           return "EmployeeRecord [StaffID=" + StaffID + ", EmpName=" + EmpName + ", gender=" + gender + "]";
    }
    @Override
    public int hashCode() {
           final int prime = 31;
           int result = 1;
           result = prime * result + ((EmpName == null) ? 0 : EmpName.hashCode());
           result = prime * result + StaffID;
           result = prime * result + gender;
           return result;
    }
    @Override
    public boolean equals(Object obj) {
           if (this == obj)
                  return true;
           if (obj == null)
                  return false;
           if (getClass() != obj.getClass())
                  return false;
           EmployeeRecord other = (EmployeeRecord) obj;
           if (EmpName == null) {
                  if (other.EmpName != null)
                        return false;
           } else if (!EmpName.equals(other.EmpName))
                  return false;
           if (StaffID != other.StaffID)
                  return false;
           if (gender != other.gender)
                  return false;
           return true;
    }
                               
    
    @Override
           public int compareTo(EmployeeRecord e) {
                          
                          Integer obj1 = new Integer(StaffID);
                          Integer obj2 = new Integer(e.StaffID);
                          return obj1.compareTo(obj2);
           }
    
    
    

}
