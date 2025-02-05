class Listening extends Thread
{
	public void musicListening()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("music Listening processing");
		}
	}
	public void run()
	{                        
		musicListening();
	}
}