//WAP to find even and odd number
package array;

public class Array3 {
	public static void main(String args[]) {
		int a[]= {19,20,12,10,18,15,30};
		System.out.println("odd number");
		
		for(int i=0; i<a.length; i++) {
			if(a[i]%2!=0)
				System.out.println(a[i]);
		}
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0)
				System.out.println(a[i]);
		}
	}
}
