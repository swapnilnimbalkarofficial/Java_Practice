class Site
{	
	public void home()
	{
		System.out.println("program started");
	}
	public void login(int age)
	{
		System.out.println("welcome to second home");
		if(age>=70)
			home();
		else
		{
			throw new ArithmeticException();
		}
		System.out.println("thank you for visit");
	}
}
	