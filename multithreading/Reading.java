class Reading extends Thread
{
	public void bookReading()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("book Reading processing");
		}
	}
	public void run()
	{
		bookReading();
	}
}