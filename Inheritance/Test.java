class P
{
	public void m1()
	{
		System.out.println("Parent");
	}
}
class C extends P
{
	public void m2()
	{
		System.out.println("Child");
	}
}
class Test
{
	public static void main(String args[])
	{
		C c = new C();
	}
}
		