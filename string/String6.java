//write a program check vowels in string
package string;

public class String6 {
	public static void main(String args[])
	{
		String s1 = "Education";
		int count =0;
		for(int i=0; i<s1.length();i++)
		{
			if(s1.charAt(i)=='A'||s1.charAt(i)=='a'||s1.charAt(i)=='E'||s1.charAt(i)=='e'||s1.charAt(i)=='I'||s1.charAt(i)=='I'|| s1.charAt(i)=='O'||s1.charAt(i)=='o'||s1.charAt(i)=='U'||s1.charAt(i)=='u')
				count++;
		}
		System.out.println(count);
	}	
}
