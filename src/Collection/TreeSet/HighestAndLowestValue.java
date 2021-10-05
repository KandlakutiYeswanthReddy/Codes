package Collection.TreeSet;



import java.util.*;  
class HighestAndLowestValue{  
 public static void main(String args[]){  
 TreeSet<Integer> set=new TreeSet<Integer>();  
         set.add(24);  
         set.add(66);  
         set.add(12);  
         set.add(15); 
         System.out.println(set);
         System.out.println("First Value: "+set.pollFirst());  
         System.out.println("Last Value: "+set.pollLast());  
 }  
}  