class HondaCar implements Car
{
	int minspeed=40;
	public void color()
	{
		System.out.println("HondaCar available in all color");
	}
	public void type()
	{
		System.out.println("HondaCar available in all segments");
	}
	public void cc()
	{
		System.out.println("HondaCar available in 1000 cc to 2000 cc");
		System.out.println("minspeed="+minspeed+"maxspeed="+maxspeed);
	}
}