class MainClass
{
	public static void main(String args[])
	{
		System.out.println("program started");
		int a[]={10,20,30,40,50};
		try{
		System.out.println(a[5]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		finally{
			System.out.println("finally block invoked");
		}
		System.out.println("program ended");
	}
}