//write a program to replace at vowels
//intput="Education"';
//output=1d2c3t45n
package string;

public class String10 {
	public static void main(String args[])
	{
		String s1= "Education";
		String s2= "AEIOUaeiou";
		int count=0;
		StringBuilder sb= new StringBuilder(s1);
		for(int i=0; i<s1.length();i++)
			if(s2.contains(String.valueOf(s1.charAt(i))))
				sb.append(++count);
			else
				sb.append(s1.charAt(i));
		System.out.println(sb);
	}
}
