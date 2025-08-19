package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Uppercase {

	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("Shbham", "Raj", "Ajinkya", "Vishwas");
		
		List<String> upper=names.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(upper);

	}

}
