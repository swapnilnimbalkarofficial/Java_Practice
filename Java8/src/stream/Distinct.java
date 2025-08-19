package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {

	public static void main(String[] args) {
		List<Integer> data=Arrays.asList(2,3,3,2,5,6,7);

		List<Integer> unique=data.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println(unique);
		

	}

}
