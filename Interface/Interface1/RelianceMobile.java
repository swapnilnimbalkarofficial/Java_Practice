class RelianceMobile
{
	private Sim r= new AirtelSim();
	private void startMobile()
	{
		System.out.println("welcome to reliance mobile");
	}
	RelianceMobile()
	{
		startMobile();
		r.startsim();
	}
}