package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListNumbers {

	public static void main(String[] args) {
		List<Integer> number=Arrays.asList(1,2,4,12,45,56);
		
		List<Integer> list=number.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(sorted);
	}

}
