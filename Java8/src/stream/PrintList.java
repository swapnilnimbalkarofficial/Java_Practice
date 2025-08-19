package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintList {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Swapnil", "Amit", "Ravi");
		names.stream().forEach(System.out::println);
		
		
		List<Integer> numbers= new ArrayList<Integer>();
		numbers.add(20);
		numbers.add(10);
		numbers.add(30);
		numbers.add(24);
		numbers.add(80);
		
		System.out.println("Without using stream: "+numbers);
		
		List<String> name = Arrays.asList("Swapnil", "Ravi", "Sanket");

		List<String> filtered = name.stream()
		                             .filter(n -> n.startsWith("N"))
		                             .collect(Collectors.toList());

		System.out.println(filtered);
		
	}

}
