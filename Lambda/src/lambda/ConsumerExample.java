package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> consumer = t -> System.out.println(t);
        consumer.accept("Rashmi");
        
        
        Consumer<String> consumer2 = (input) -> System.out.println(input + "World");
        Consumer<String> consumer3 = (input) -> System.out.println(input + "Java"); 
        consumer2.andThen(consumer3).accept("hello");
        
        
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        integers.forEach((t) -> System.out.println(t));
        

	}

}
