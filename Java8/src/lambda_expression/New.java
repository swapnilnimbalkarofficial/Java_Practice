package lambda_expression;

import java.util.ArrayList;

public class New {

	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println("Elements from the ArrayList: ");
		al.forEach(n -> System.out.println(n));
		
		System.out.println("Elements of even from ArrayList");
		
		al.forEach(n -> {
			if(n%2==0) {
				System.out.println(n);
			}
		});
		
		System.out.println("Eelements of odd from ArrayList: ");
		
		al.forEach(n ->{
			if(n%2!=0) {
				System.out.println(n);
			}
		});
	}

}