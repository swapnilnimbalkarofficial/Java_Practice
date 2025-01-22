import java.util.Arrays;
class SumOfArray
{
	public static void main(String args[])
	{
		int a[]={19,23,34,12,34,45,56};
		int sum=0;
		for(int i=0; i<a.length; i++)
			sum+=a[i];
		System.out.println(sum);
	}
}
