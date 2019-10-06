package Day5;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        
        
        ArrayList<Integer>  al= new ArrayList<Integer>();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(null);
        al.add(200);
        al.add(200);
        al.add(null);
        
        System.out.println(al);
        
        System.out.println(al.size());
        
        System.out.println(al.isEmpty());
        
        //al.clear();
        
        //System.out.println(al.isEmpty());
        
        System.out.println("printing values");
        System.out.println("===============");
        for(Integer i: al)
               System.out.println(i);
        
        System.out.println("===============");
        
        al.remove(0);
        
        for(int i=0;i<al.size();i++)
               System.out.println(al.get(i));
        
        System.out.println("===============");
        al.add(5, 1000);
        
        System.out.println(al.get(5));
        
 };

}



