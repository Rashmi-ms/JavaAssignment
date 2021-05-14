package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

  public class Fruits {
    private String name;
    private int calories;
    private int price;
    private String color;
    
    public Fruits(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
    public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getCalories() {
		return calories;
	}


	public void setCalories(int calories) {
		this.calories = calories;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

	
    @Override
    public String toString() {
        return "Fruits[ name=" + name + ", calories=" + calories + ", price=" + price + ",color=" + color +"]";
    }


	
	    public static void main(String[] args) {

	        List < Fruits > fruits = new ArrayList < Fruits > ();
	        fruits.add(new Fruits("Apple",53,200,"Red"));
	        fruits.add(new Fruits("Pomegranate",65,260,"Red"));
	        fruits.add(new Fruits("Orange",105,170,"Orange"));
	        fruits.add(new Fruits("Grapes",80,100,"Green"));
	        fruits.add(new Fruits("Banana",67,250,"Yellow"));

	        List < Fruits > SortedList1 = fruits.stream()
	            .sorted((o1, o2) -> (int)(o2.getCalories() - o1.getCalories())) 
                 .collect(Collectors.toList());
	        System.out.println(SortedList1);
	       // List<Integer> caloriesList2 =fruits.stream()  
             //       .filter(f -> f.calories < 100)// filtering data  
               //     .map(f->f.calories)        // fetching price  
                 //   .collect(Collectors.toList()); // collecting as list  
            //System.out.println(caloriesList2);  

	        //List < Fruits > SortedList2 = fruits.stream()
	          //  .sorted(Comparator.comparingLong(Fruits::getCalories)).collect(Collectors.toList()); //ascending order
	        //System.out.println(SortedList2);
	        fruits.stream().sorted((f1,f2) ->f1.color.compareTo(f2.color))
	              .forEach(System.out::println);
	        fruits.stream()
            .filter(c-> c.color == "Red")  
            .forEach(System.out::println);    
	        //List < Fruits > SortedList2 = fruits.stream()
		      //      .sorted((o1, o2) -> (int)(o2.getPrice() - o1.getPrice())) 
	            //     .collect(Collectors.toList());
		        //System.out.println(SortedList2);
	  
        

	}
  }



