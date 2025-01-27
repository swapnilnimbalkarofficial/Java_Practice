class MainClass
{
	public static void main(String args[])
	{
		A a1 = (B) new B();
		System.out.println(a1.a);
		System.out.println(a1.b);
		a1.display();	

		B a2 =(C)new C();
		System.out.println(a2.a);
		System.out.println(a2.b);
		a2.display();

		C a3 =(C)new C();
		System.out.println(a3.a);
		System.out.println(a3.b);
		a3.display();
	}
}
