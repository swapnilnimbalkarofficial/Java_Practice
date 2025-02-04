class MainClass
{
	public static void main(String args[])
	{
		System.out.println("program started");
		MainClass m = new MainClass();		
		m=new MainClass();
		System.gc();
		System.out.println("program ended");
	}
	public void finalize()
	{
		System.out.println("finalize method called");
	}
}