//write a program to shift vowels at last of string 
package string;

public class String12 {
	public static void main(String args[])
	{
		String s1 = "Education";
		String s2 = "AEIOUaeiou";
		StringBuilder sb= new StringBuilder(s1);
		StringBuilder sb1= new StringBuilder(s2);
		for(int i=0; i<s1.length(); i++)
			if(s2.contains(String.valueOf(s1.charAt(i))))
					sb.append(s1.charAt(i));
			else
				sb.append(s1.charAt(i));
		sb.append(sb1);
		System.out.println(sb);
	}
}
