//WAP to find avg of array
package array;

public class Array1 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		double avg=0;
		for(int i=0; i<a.length; i++) {
			avg+=a[i];
			avg/=a.length;
		}	
		System.out.println("Avg of length= " +avg);

	}

}
