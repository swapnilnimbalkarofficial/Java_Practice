package string;

//public class String4 {
//	public static void main(String args[])
//	{
//		String s1= "India";
//		StringBuilder sb= new StringBuilder(s1);
//		sb.append(s1.charAt(s1.length()-1));
//		if(s1.length()>1){
//			sb.append(s1.substring(1,s1.length()-1));
//			sb.charAt(0);
//		}
//		System.out.println(sb);
//	}
//
//}

public class String4{
	public static void main(String args[]) {
		String s1="India";
		StringBuilder sb= new StringBuilder(s1);
		sb.deleteCharAt(0);
		sb.insert(0, sb.charAt(sb.length()-1));
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
	}
}