package string;

public class String9 {
	public static void main(String args[])
	{
		String s1="India";
		String s2="ASDFIqwerio";
		int count=0;
		for(int i=0; i<s1.length(); i++)
			if(s2.contains(String.valueOf(s1.charAt(i))))
					count++;
		System.out.println(count);
	}

}
