package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Uppercase {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList(
		        "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

		    
		    list.replaceAll(s -> s.toUpperCase());
		    System.out.println(list);
		  }

	}


