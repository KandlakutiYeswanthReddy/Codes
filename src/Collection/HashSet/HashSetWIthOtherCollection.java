package Collection.HashSet;

import java.util.*;  
class HashSetWIthOtherCollection{  
 public static void main(String args[]){  
   ArrayList<String> list=new ArrayList<String>();  
           list.add("Ravi");  
           list.add("Vijay");  
           list.add("Ajay");  
             
           HashSet<String> set=new HashSet(list);  
           set.add("Gaurav");  
                 
           for(String str : set) {
        	   System.out.println(str);
           }
 }  
}  