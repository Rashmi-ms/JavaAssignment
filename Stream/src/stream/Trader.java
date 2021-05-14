package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Trader {
	String name; 
	String city; 
	

	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
	@Override
	 public String toString() {
	        return "Trader[ name= " + name + " city= " + city + "]";
	    }

	public static void main(String[] args) {
		List < Trader > traders = new ArrayList < Trader > ();
        traders.add(new Trader("John", "Pune"));
        traders.add(new Trader("Varun", "Banglore"));
        traders.add(new Trader("Roy", "Hyderabad"));
        traders.add(new Trader("Balu", "Chennai"));
        
        
        List < Transaction > transaction = new ArrayList < Transaction > ();
        transaction.add(new Transaction(null, 2010, 10000 ));
        transaction.add(new Transaction(null, 2011, 50000 ));
        transaction.add(new Transaction(null, 2012, 20000));
        transaction.add(new Transaction(null, 2006, 36000));
        
        List<Transaction>outList = transaction.stream().filter(y->y.year ==2011).sorted(Comparator.comparing(Transaction::getValue).reversed()).collect(Collectors.toList());
        System.out.println(outList);
        System.out.println("------------------------");
        List<String>cities = traders.stream().map(c->c.city).collect(Collectors.toList());
        System.out.println(cities);
        System.out.println("------------------------");
        traders.stream().filter(c->c.city == "Pune").forEach(System.out::println);
        System.out.println("------------------------");
        traders.stream().sorted((t1,t2) -> t1.name.compareTo(t2.name)).forEach(System.out::println);
        System.out.println("------------------------");
        Trader pune = traders.stream().filter(trader -> "Pune".equals(trader.getCity())).findAny().orElse(null);
        System.out.println("------------------------");
        Comparator<Transaction> comparator = Comparator.comparing(Transaction::getValue);
        Transaction minObject = transaction.stream().min(comparator).get();
        Transaction maxObject = transaction.stream().max(comparator).get();
        System.out.println("minobject=" + minObject);
        System.out.println("maxobject=" + maxObject);
	}

}
