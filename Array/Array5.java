//WAP to shift last element to first element 
package array;

import java.util.Arrays;

public class Array5 {

	public static void main(String[] args) {
		int a[] = { 19, 20, 12, 10, 18, 15, 30 };
		System.out.println(Arrays.toString(a));

		int temp = a[a.length - 1];

		for (int i = a.length - 2; i >= 0; i--) {
			a[i + 1] = a[i];
		}
		a[0] = temp;
		System.out.println(Arrays.toString(a));
	}
}
