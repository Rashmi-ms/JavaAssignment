package lambda;

import java.util.Arrays;
import java.util.List;

public class FirstLetter {

	public static void main(String[] args) {
		List<String> list = Arrays.asList(
		        "alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

		    
		    StringBuilder firstLetters = new StringBuilder();
		    list.forEach(s -> firstLetters.append(s.substring(0, 1)) );
		    System.out.println(firstLetters);

	}

}
