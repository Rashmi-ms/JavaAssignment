package lambda;

import java.util.Arrays;
import java.util.List;

public class PrintNumbers {

	public void solution() {
	   
	    System.out.println("Numbers in the list are...");
	    arraylist();
	  }
		private void arraylist() {
		    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		    new Thread(() -> list.forEach(n -> System.out.println(n))).start();
		  }
  
		  public static void main(String[] args) {
		    PrintNumbers numbers = new PrintNumbers();
		    numbers.solution();
		  
	}

}
