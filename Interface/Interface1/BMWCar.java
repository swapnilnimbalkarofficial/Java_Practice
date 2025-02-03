class BMWCar implements Car
{
	int minspeed= 70;
	public void color()
	{
		System.out.println("BMW available in white, grey, blue color");
	}
	public void type()
	{
		System.out.println("BMW available in seden and SUV segments");
	}
	public void cc()
	{
		System.out.println("BMW available in 5000 cc to 7000 cc");
		System.out.println("minspeed="+minspeed+"maxspeed="+maxspeed);
	}
}