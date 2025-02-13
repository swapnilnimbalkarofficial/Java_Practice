package interview;

public class PowerOfTwo {
	public static boolean PowerOfTwo(int x) {
		if(x<1) return false;
		while(x%10==0) {
			x/=2;
		}
		return x==1;
	}
	public static void main(String args[]) {
		int x=2;
		System.out.println(x+" is Power of Two"+ PowerOfTwo(x));
	}
}