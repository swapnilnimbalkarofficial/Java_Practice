package string;

public class String7 {
	public static void main(String args[])
	{
		String s1= "HAppiEst";
		String s2=s1.toUpperCase();
		int count=0;
		for(int i=0; i<s1.length();i++)
		{
			char c=s1.charAt(i);
			if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
				count++;
		}
		System.out.println(count);
	}

}
