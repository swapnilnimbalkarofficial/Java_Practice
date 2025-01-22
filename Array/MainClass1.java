/*
import java.util.Arrays;
class MainClass1
{
	public static void main(String args[])
	{
		int a[]={456,3678,46878,37456,876,23456,776845,9};
		for(int i=0; i<a.length; i++)
		{
			int temp=a[i],last=temp%10,power=1;
			temp/=10;

			while(temp!=0)
			{
				power*=10;
				temp/=10;
			}
			last*=power;
			last+=a[i]/10;
			a[i]=last;
		}
		System.out.println(Arrays.toString(a));
	}
}


//first digit 

import java.util.Arrays;
class MainClass1
{
	public static void main(String args[])
	{
		int a[]={456,3678,46878,37456,876,23456,776845,9};
		for(int i=0; i<a.length; i++)
		{
			int first=a[i],power=1;
			while(first>9)
			{
				first/=10;
				power*=10;
			}
			a[i]%=power;
			a[i]*=10;
			a[i]+=first;
		}
		System.out.println(Arrays.toString(a));
	}
}
//output:[564, 6783, 68784, 74563, 768, 34562, 768457, 9]

//first and last digit 

import java.util.Arrays;
class MainClass1
{
	public static void main(String args[])
	{
		int a[]={456,3678,46878,37456,876,23456,776845,9};
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>99)
			{
				int last=a[i]%10;
				while(a[i]>9)
					a[i]/=10;
				a[i]*=10;
				a[i]+=last;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}


import java.util.Arrays;
class MainClass1
{
	public static void main(String args[])
	{
		int a[]={32341};
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%4==0)
			{
				a[i]=-3;
			}
			else
			{
				a[i]=-1;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}		


import java.util.Arrays;
class MainClass
{
	public static void main(String args[])
	{	
		int a[]={456,3678,46878,37456,876,23456,776845,9};
		for(int i=0; i<a.length; i++)
		{
			int num=a[i];
			int max =0;
			while(a[i]!=0)
			{
				if(max < a[i] % 10)
					max =a[i]%10;
				a[i]/=10;
			}
			a[i]=max;	
			System.out.println(Arrays.toString(a));
		}
	}
}
	
import java.util.Arrays;
class MainClass1
{
	public static void main(String args[])
	{
		int a[]={456,3678,46878,37456,876,23456,776845,9};	
		for(int i=0; i<a.length; i++)
		{	
			int max=0;
			int min=9;
			while(a[i]!=0)
			{
				if(max<a[i]%10)
					max=a[i]%10;
				a[i]=max;
			}
			System.out.println(Arrays.toString(a));
		}
	}
}


class MainClass1
{
	public static void main(String args[])
	{
		int a=8;
		for(int i=0; i<=a-1; i++)
		{
			if(a[i]%==0)

//Palindrome
import java.util.Arrays;
class MainClass1
{
	public static void main(String args[])
	{
		int n=121,sum=0, temp=n;
		while(temp!=0)
		{
			sum*=10;
			sum+=temp%10;
			temp/=10;
		}
		if(sum==n)
			System.out.println(n+"is palindrome number");
	}
}


class MainClass1
{
	public static void main(String args[])
	{
		int n=7;
		boolean b=false;
		if(n==0||n==1)
			b=true;
		else
			for(int i=2; i<n/2; i++)
			if(n%i==0)
			{
				b=true; 
				break;	
			}
		if(!b)
			System.out.println(n+"is prime number");
	}
}


//Strong numbers
class MainClass1
{
	public static void main(String args[])
	{	
		int n=145, temp=n, sum=0;
		while(temp!=0)
		{
			int fact=1;
			for(int i=1; i<=temp%10; i++)
			{
				fact*=i;
				sum+=fact;
				temp/=10;
			}
			if(sum==n)
				System.out.println(n+"is Strong number");
			else
				System.out.println(n+"is not Strong number");
		}
	}
}

//check the armstrong number or not

class MainClass1
{
	public static void main(String args[])
	{
		int n=153,temp=n,power=0,sum=0;
		while(temp!=0)
		{
			power++;
			temp/=10;
		}
		temp=n;
		while(temp!=0)
		{
			sum+=Math.pow(temp%10,power);
			temp/=10;
		}
		if(sum==n)	
		{	
			System.out.println(n+ "is armstrong number");
		}
		else
		{
			System.out.println(n+ "is not armstrong number");
		}
	}
}

//check is prime  or not
class MainClass1
{
	public static void main(String args[])
	{
		int count=0;
		for(int n=2; n<=10000; n++)
		{
			boolean isprime=true;
			for(int i=2; i<=n/2; i++)
			{
				if(n%i==0)
				{
					isprime=false;	
					break;
				}
			}
			if(isprime)
			{
				System.out.println(n);	
				count++;
			}
		}
		System.out.println("total prime number count is " +count);	
	}
}

			
class MainClass1
{
	public static void main(String args[])
	{
		int count =0;
		int n=2;
		while(n<85)
		{
			boolean isprime=true;
			for(int i=2; i<=n; i++)
			{
				if(n%i==0)
				{
					isprime=false;
					break;
				}
			}
		
			if(isprime)
			{
				count++;
			}
			if(count==85)
			{
				System.out.println(n);
			}
			n++;
		}
	}
}
//perfect square

class MainClass1
{
	public static void main(String args[])
	{	
		count=0;
		for(int i=0; i<=100; i++)
		{
			if(Math.sqrt(i)%1==0)
				System.out.println("this number is perfect number in 1 to 100 " +count);
		}
		count++;
	}
}
 

class MainClass1 {
    public static void main(String args[]) {
       
        int[] input = {16, 13, 19, 21, 18, 15, 24, 30, 11};
        int[] output = new int[input.length - 1];
        for (int i = 0; i < input.length - 1; i++) {
            output[i] = Math.abs(input[i] - input[i + 1]);
        }
        System.out.print("Differences: ");
        for (int diff : output) {
            System.out.print(diff + " ");
        }
    }
}

import java.util.Arrays;
class MainClass1 {
    public static void main(String args[]) {
        int a[] = {16, 13, 19, 49, 21, 18, 15, 24, 30, 11};
	Arrays.sort(a);
	int min =a[a.length-1];
	for(int i=0;i<a.length-1; i++)
	{
		int diff=Math.abs(a[i]-a[i+1]);
		if(min>diff&&diff!=0)
			min=diff;
	}	
	for(int i=0; i<a.length-1; i++)
		if(min==Math.abs (a[i]-a[i+1])
			System.out.println(Arrays.toString(a));
    }
}

class MainClass1
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println(a+b);
	}
}
*/
import java.util.Arrays;
class MainClass1 
{
    public static void main(String args[]) 
    {
	int a[] = { 10, 20, 30, 40, 50 };
        for (int i = 0; i < a.length; i++) 
	{
            System.out.println(a[i]);
	}
	System.out.println("--------------------");
	for(int i=a.length-1; i>=0; i--)
	{
		System.out.println(a[i]);
        }
	System.out.println("---------------------");
	System.out.println(Arrays.toString(a));
    }
}

















