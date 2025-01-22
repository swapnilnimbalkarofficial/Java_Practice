/*
//WAP to create an array backward and forward manner
import java.util.Arrays;
class MainClass
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50};
		for(int i=0; i<a.length; i++)
			System.out.println(a[i]);
		System.out.println("-------------------");
		for(int i=a.length-1; i>=0; i--)
			System.out.println(a[i]);
		System.out.println("-------------------");
	}
}

//WAP to sum of array 
import java.util.Arrays;
class MainClass
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50};
	
		int sum=0;
		for(int i=0; i<a.length; i++)
			sum+=a[i];
		System.out.println("sum of array:"+sum);
	}
}


//WAP to avg of array

class MainClass
{
	public static void main(String args[])
	{
		int a[]={19,23,34,40,20};
		double avg=0;
		for(int i=0; i<a.length; i++)
			avg+=a[i];
		avg/=a.length;
		
		System.out.println("Avg of array:"+avg);
	}
}

//WAP to find avg odd elements of array 

class MainClass
{
	public static void main(String args[])
	{
		int a[]={23,12,43,25,40};
		int oddcount=0;
		double oddAvg=0;
		for(int i=0; i<a.length; i++)66+25=91
			if(a[i]%2!=0)
			{
				oddAvg=a[i];
				oddcount++;
			}
		oddAvg/=oddcount;
		System.out.println("Avg of odd:"+oddAvg);
	}
}


//WAP to find avg of odd and even elements of array

class MainClass
{
	public static void main(String args[])
	{
		int a[]= {2,4,3,6,9,6,8,1};
		double oddAvg=0;
		double evenAvg=0;
		int oddcount=0;
		int evencount=0;
		for(int i=0; i<a.length; i++)
			if(a[i]%2!=0)
			{
				oddAvg+=a[i];
				oddcount++;
			}
			else
			{
				evenAvg+=a[i];
				evencount++;
			}
			oddAvg/=oddcount;
			evenAvg/=evencount;
			System.out.println("odd Avg:"+oddAvg);
			System.out.println("even Avg:"+evenAvg);
	}
}

//05/10/2024
//how to create object of array
//1. by using new keyword

import java.util.Arrays;
class MainClass
{
	public static void main(String args[])
	{
		int a[]=new int [5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println(Arrays.toString(a));
	}
}


//2. by using refrence

import java.util.Arrays;
class MainClass
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		int b[]= a;
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
}

//3.by static way 

import java.util.Arrays;
class MainClass
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50};
		System.out.println(Arrays.toString(a));
	}
}

//4.by copying array

import java.util.Arrays;
class MainClass
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50};
		int b[]=new int[a.length];
		for(int i=0; i<a.length; i++)
		b[i]=a[i];
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(a==b);
	}
}		

//5. 2D array 

import java.util.Arrays;
class MainClass
{
	public static void main(String args[])
	{
		int a[][]=new int [3][4];
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=40;
		a[0][3]=50;
		a[1][0]=30;
		a[1][1]=10;
		a[1][2]=0;
		a[1][3]=2;
		a[2][0]=5;
		a[2][1]=1;
		a[2][2]=3;
		a[2][3]=10;
		for(int i=0; i<a.length; i++)
			System.out.println(Arrays.toString(a[i]));
	}
}

//6.jagged array

import java.util.Arrays;
class MainClass
{
	public static void main(String args[])
	{
		int a[][]={{10,20},{30,40,20},{10,40,30,50,30},{0}};
		for(int i=0; i<a.length; i++)
			System.out.println(Arrays.toString(a[i]));
	}
}


//7/10/2024

import java.util.Arrays;
class MainClass
{
	public static void main(String args[])
	{
		Object o[]= {10,"ABC", 'A',true, 15.4,new MainClass()};
			System.out.println(Arrays.toString(o));
	}
}


//WAP to shift first element to last of array using 3rd variable

import java.util.Arrays;
class MainClass
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50};
		//       0  1  2  3  4
		
		//20 30 40 50 10

		int temp=a[0];
		
		for(int i=1; i<a.length; i++)
			a[i-1]=a[i];
		a[a.length-1]=temp;
		System.out.println(Arrays.toString(a));
	}
}

// WAP to shift last element to first to last array


import java.util.Arrays;
class MainClass
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50};
		//        0  1  2  3  4
		
		//50 10 20 30 40
		// 0  1  2  3  4
		
		int temp=a[a.length-1];//50
		for(int i=a.length-2; i>=0; i--)
			a[i+1]=a[i];
		a[0]=temp;
		System.out.println(Arrays.toString(a));
	}
}

//WAP swap first and last element 

import java.util.Arrays;
class MainClass
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50};
		int temp=a[0];
		a[0]=a[a.length-1];
		a[a.length-1]=temp;
		System.out.println(Arrays.toString(a));	
	}
}

//WAP swapping without using 3rd variable

import java.util.Arrays;
class MainClass
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50};
		a[0]=a[0]+a[a.length-1];
		a[a.length-1]=a[0]-a[a.length-1];  //a[a.length-1] = 60-50=10
		a[0]=a[0]-a[a.length-1];  //a[0]=60-10=50

		System.out.println(Arrays.toString(a));
	}
}
*/

//WAP first to last element without using 3rd variables

import java.util.Arrays;
class MainClass
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50};
		      // 0  1  2  3  4
		//50 20 30 40 10
		//0   1  2  3  4


		for(int i=0; i<a.length-1; i++)
		{
			a[i]+=a[i+1];
			a[i+1]=a[i]-a[i+1];
			a[i]-=a[i+1];			
		}
		System.out.println(Arrays.toString(a));
	}
}














