import java.util.Arrays;
class Demo1
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40};
		System.out.println("forward manner");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("backward manner");
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.println(a[i]);
		}
	}
}