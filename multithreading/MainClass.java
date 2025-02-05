class MainClass
{
	public static void main(String args[])
	{
		Writing w = new Writing();
		Listening l = new Listening();
		Reading r = new Reading();
		w.start();
		l.start();
		r.start();	
	}
}