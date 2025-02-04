class NullPointerExceptionExample
{
	public static void main(String args[])
	{
		System.out.println("program started");
		int a[]=null;
		try{
		System.out.println(a.length);
		}catch(NullPointerException e){
			System.out.println(e);
		}
		System.out.println("program ended");
	}
}