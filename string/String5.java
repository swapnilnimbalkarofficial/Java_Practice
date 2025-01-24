//write a program to shift first character to last character at first of string
package string;

public class String5 {
	public static void main(String args[])
	{
		String s1= "India";
		StringBuilder sb= new StringBuilder(s1);
		sb.append(sb.substring(1));
		sb.append(s1.charAt(0));
//		sb.append(s1.charAt(0));
//		sb.append(s1.charAt(s1.length()-1));
//		sb.append(s1.subString(s1.length()-1));
		System.out.println(sb);
		
		
	}
}
