package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LowerCase {

	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("TCS", "Capgemini", "TechMahindra");
		
		List<String> lower=names.stream()
				.map(String ::toLowerCase)
				.collect(Collectors.toList());
				
		System.out.println(lower);
	}

}
