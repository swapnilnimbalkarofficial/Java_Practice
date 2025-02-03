class FarrariCar implements Car
{
	int minspeed= 40;
	public void color()
	{
		System.out.println("FarrariCar available in orange, red, yellow");
	}
	public void type()
	{
		System.out.println("Farrari available in sports segments");
	}
	public void cc()
	{
		System.out.println("Farrari available in 4000 cc to 6000 cc");
		System.out.println("minspeed="+minspeed+"maxspeed="+maxspeed);
	}
}