class A implements Runnable
{
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("hii");
			try{
			Thread.sleep(500);
			}catch(InterruptedException e){
				System.out.println(e);						}
		}
	}
}