package string;

public class String8 {
	public static void main(String args[])
	{
		String s1= "India";
		String s2= s1.toLowerCase();
		int count=0;
		for(int i=0; i<s1.length(); i++)
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
				count++;
		System.out.println(count);
	}
}
	