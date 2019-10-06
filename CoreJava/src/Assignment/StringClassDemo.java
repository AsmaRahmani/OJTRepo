package Assignment;

public class StringClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String MyString = "Hii my name is Asma";
        String s1= "ASMA";
        String s2= "Asma";
        String s3 = "  Pretty Asma  ";
        
        System.out.println("The Char at index 4(third position) is : " + MyString.charAt(4));
        System.out.println("After adding Concat: "+ MyString.concat("-Love-"));
        System.out.println("Checking equals ignoring case: " +s2.equalsIgnoreCase(s1));
        System.out.println("Checking equals with case: " +s2.equals(s1));
        System.out.println("The length is : "+ MyString.length());
        System.out.println("Replace function: "+ MyString.replace("Asma", "Marwan"));
        System.out.println("SubString of targetString: "+ MyString.substring(3));
        System.out.println("SubString of targetString: "+ MyString.substring(5, 10));
        System.out.println("Converting to lower case: "+ MyString.toLowerCase());
        System.out.println("Converting to upper case: "+ MyString.toUpperCase());
        System.out.println("Triming string: " + s3.trim());
        System.out.println("searching s1 in targetString: " + MyString.contains(s1));
        System.out.println("searching s2 in targetString: " + MyString.contains(s2));

        char [] charArray = s2.toCharArray();
        System.out.println("Size of char array: " + charArray.length);
        System.out.println("Printing last element of array: " + charArray[3]);

 

	}

}
