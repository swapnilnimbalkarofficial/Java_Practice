import java.util.Arrays;
class AvgOdd
{
	public static void main(String args[])
	{
		int a[]={23,45,65,12,76,45,87};
		System.out.println("odd number");
		for(int i=0; i<a.length; i++)
			if(a[i]%2!=0)
				System.out.println(a[i]);

		System.out.println("even number");
		for(int i=0; i<a.length; i++)
			if(a[i]%2==0)
				System.out.println(a[i]);
	}
}