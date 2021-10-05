package Collection.TreeSet;

import java.util.*;  
class TreeSetManipulation{  
 public static void main(String args[]){  
  TreeSet<String> set=new TreeSet<String>();  
         set.add("A");  
         set.add("b"); 
         set.add("k");
         set.add("C");  
         set.add("D");  
         set.add("E");  
         System.out.println("Initial Set: "+set);  
           
         System.out.println("Reverse Set: "+set.descendingSet());  
           
         System.out.println("Head Set: "+set.headSet("C", true));  
          
         System.out.println("SubSet: "+set.subSet("A", false, "E", true));  
           
         System.out.println("TailSet: "+set.tailSet("C", false));  
 }  
}  
