class B implements Runnable
{
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("hello");
			try{
			Thread.sleep(1000);
			}catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
}