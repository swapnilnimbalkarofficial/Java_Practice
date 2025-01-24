//write a program to shift first string to last string
package string;

public class string2 {
	public static void main(String args[]) {
		String s1 = "India";
		StringBuilder sb = new StringBuilder(s1);
		sb.append(sb.charAt(0));
		sb.deleteCharAt(0);
		System.out.println(sb);
	}

}


