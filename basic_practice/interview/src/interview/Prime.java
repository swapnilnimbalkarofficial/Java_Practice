package interview;

import java.util.Scanner;

public class Prime {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=scan.nextInt();
		boolean isPrime = true;

		if (num < 2) {
			isPrime = false;
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		System.out.println(num + (isPrime ? " is a Prime Number" : " is NOT a Prime Number"));
		scan.close();
	}

}
