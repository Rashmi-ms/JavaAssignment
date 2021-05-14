package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddLength {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList(
		        "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

		   
		    list.removeIf(s -> s.length() % 2 != 0);
		    System.out.println(list);

	}

}
