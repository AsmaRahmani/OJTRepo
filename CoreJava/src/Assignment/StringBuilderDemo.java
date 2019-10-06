package Assignment;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        StringBuilder a = new StringBuilder("Hiii ");
        a.append("I Love Java it's really fun");
        System.out.println(a);
        
        
        a.insert(4, "!! ");
        System.out.println(a);
        
        
        a.replace(4,9," You should");
        System.out.println(a);
        
        
        a.delete(9,16);
        System.out.println(a);
        
        
        a.reverse();
        System.out.println(a);
        
        
        System.out.println(a.capacity());
        a.append("Marwan");  
        System.out.println(a.capacity()); 
        a.append("Hello sir marwan!");
        System.out.println(a.capacity()); 
        
        a.append(" Hi you are in Java StringBuilder Class!");  
        System.out.println(a.capacity());    
        a.ensureCapacity(10); 
        System.out.println(a.capacity()); 
        a.ensureCapacity(40); 
        System.out.println(a.capacity());
        a.insert(6, "lllllll ");
        System.out.println(a);
        
        StringBuilder sb1 = new StringBuilder();
  sb1.append(" Asma Rahmani");
  System.out.println(sb1.indexOf("A"));
  System.out.println(sb1.lastIndexOf("A"));
  
  
  StringBuilder sb3 = new StringBuilder();
  sb3.append("Asma");
  System.out.println(sb3.substring(3));


	}

}
