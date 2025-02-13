/*
package interview;

import java.util.Scanner;

public class Palindrome{
	public static boolean isPalindrome(int x) {
		if(x<0) return false;
		
		int original=x, reversed=0;
		
		while(x>0) {
			int digit=x%10;
			reversed=reversed*10+digit;
			x/=10;
		}
		return original == reversed;
	}
	public static void main(String args[]) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int x=scan.nextInt();
		
		if(isPalindrome(x)) {
			System.out.println(x+" is Palindrome");
		}else {
			System.out.println(x+ " is NOT Palindrome");
		}
		scan.close();
	}
}
*/
package interview;
import java.util.Scanner;

public class Palindrome{
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int x=scan.nextInt();
		scan.close();
		int original=x, reverse=0;
		
		while(x>0) {
			reverse=reverse*10+x%10;
			x/=10;
		}
		if(original == reverse) {
			System.out.println(original+" is Palindrome");
		}
		else {
			System.out.println(original+" is NOT Palindrome");
		}
		
	}	
}