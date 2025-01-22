import java.util.Arrays;
class AvgOfArray
{
	public static void main(String args[])
	{
		int a[]={23,45,65,12,76,45,87};
		double avg=0;
		for(int i=0; i<a.length; i++)
			avg+=a[i];
		avg/=a.length;
		System.out.println("Avg of array is ="+avg);
	}
}