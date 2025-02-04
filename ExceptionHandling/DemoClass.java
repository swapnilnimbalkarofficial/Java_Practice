class DemoClass extends Demo implements Cloneable
{
	@Override
	public void display()
	{
		System.out.println("a="+a+"b="+b);
	}

	public DemoClass clone()
	{
		DemoClass d=null;
		try{
			d=(DemoClass)super.clone();
		}catch(CloneNotSupportedException e){
			System.out.println(e);
		}
		return d;
	}
}

