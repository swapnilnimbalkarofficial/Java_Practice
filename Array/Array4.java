//WAP to shift first element to last of array
package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		int a[] = { 19, 20, 12, 10, 18, 15, 30 };
		int temp = a[0];
		for (int i = 1; i < a.length; i++) {
			a[i - 1] = a[i];
		}
		a[a.length - 1] = temp;
		System.out.println(Arrays.toString(a));
	}
}
