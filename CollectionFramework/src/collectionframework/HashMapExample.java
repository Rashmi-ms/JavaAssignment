package collectionframework;
import java.util.*;  
public class HashMapExample {
	    
	 public static void main(String args[]){  
	   HashMap<String,String> emp=new HashMap<String,String>();//Creating HashMap    
	   emp.put("23/05/1998","Manu");  //Put elements in Map  
	   emp.put("23/05/1999","Anu");    
	   emp.put("04/12/2000","Banu");   
	   emp.put("11/8/2004","Guna");   
	      
	   for(Map.Entry<String,String> m : emp.entrySet()){    
	    System.out.println(m.getKey()+" "+m.getValue());    
	   }  
	}  
	}  


