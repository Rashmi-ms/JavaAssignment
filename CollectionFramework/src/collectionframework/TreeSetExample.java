package collectionframework;

// Java program to Sort a TreeSet with 
// User Defined Objects
  
import java.util.*;
class Persons{
    
    private String name;
    private int weight;
    private int height;
    
    
    // constructor
    public Persons(int weight, int height, String name) 
    {
        this.name=name;
        this.weight=weight;
        this.height=height;
        
    }
    public String getName() 
    {
        return name;
    }
    public void setName(String name)
    {
        this.name= name;
    }
      
    public int getWeight() 
    {
        return weight;
    }
    public int getHeight() 
    {
        return height;
    }
   
      
}
  
// Comparator class will override the compare 
// method which will compare the two objects 
// passed in the parameter
class myWeightComparator implements Comparator<Persons>
{
    
    public int compare(Persons p1, Persons p2) 
    {
        return p1.getWeight()-p2.getWeight();
    }
}
class myHeightComparator implements Comparator<Persons>
{
    
    public int compare(Persons p1, Persons p2) 
    {
        return p1.getHeight()-p2.getHeight();
    }
}
  
class myNameComparator implements Comparator<Persons>
{
    public int compare(Persons p1, Persons p2)
    {
        return p1.getName().compareTo(p2.getName());
    }
}
  
class TreeSetExample {
  
    public static void main (String[] args){
          
        // Creating the TreeSet with Comparator object passed 
        // as the parameter which will sort the user defined 
        // objects of TreeSet
  TreeSet<Persons> set = new TreeSet<Persons>(new myWeightComparator());
          
        set.add(new Persons(45,4,"Sam"));
        set.add(new Persons(34,5,"Ronaldo"));
        set.add(new Persons(13,8,"Daniel"));
        set.add(new Persons(59,7,"George"));
          
        System.out.println("increasing Order with the Weight");
          
        // Printing the TreeSet elements 
        for(Persons ele: set)
        {
            System.out.print(ele.getName()+" "+ele.getWeight());
            System.out.println();
        }
  TreeSet<Persons> heit = new TreeSet<Persons>(new myHeightComparator());
        
        heit.add(new Persons(45,4,"Sam"));
        heit.add(new Persons(34,5,"Ronaldo"));
        heit.add(new Persons(13,8,"Daniel"));
        heit.add(new Persons(59,7,"George"));
          
        System.out.println("increasing Order with the Height");
          
        // Printing the TreeSet elements 
        for(Persons ele: heit)
        {
            System.out.print(ele.getName()+" "+ele.getHeight());
            System.out.println();
        }
          
   TreeSet<Persons> weigh= new TreeSet<Persons>(new myNameComparator());
          
        weigh.add(new Persons(45,4,"Sam"));
        weigh.add(new Persons(34,5,"Ronaldo"));
        weigh.add(new Persons(13,8,"Daniel"));
        weigh.add(new Persons(59,7,"George"));
          
        System.out.println();
          
        for(Persons ele : weigh) 
        {
            System.out.print(ele.getName() +" "+ ele.getWeight());
            System.out.println();
        }
  
    }
}
