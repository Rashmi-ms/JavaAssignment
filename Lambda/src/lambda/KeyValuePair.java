package lambda;

import java.util.Map;
import java.util.TreeMap;

public class KeyValuePair {
	
public static void main(String[] args) {
	
	    Map<String, Integer> map = new TreeMap<>();
	    map.put("c", 3);
	    map.put("b", 2);
	    map.put("a", 1);

	    
	    StringBuilder stringResult = new StringBuilder();
	    map.forEach((k, v) -> stringResult.append(k).append("=").append(v).append(", "));
	    System.out.println(stringResult.substring(0, stringResult.length() - 2));
	  }
}


	


