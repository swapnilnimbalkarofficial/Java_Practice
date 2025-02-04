class MainClass
{
	public static void main(String args[])
	{
		System.out.println("program started");
		String s1=null;
		try{
		System.out.println(s1.lenght());
		}catch(NullPointerException e){
			System.out.println("object is null");
		}
		System.out.println("program ended");
	}
}