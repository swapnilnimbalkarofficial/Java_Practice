class StringIndexOutOfBoundsExceptionExample
{
	public static void main(String args[])
   	{
        	System.out.println("Program started");
        
       		String s = "India";
        	try {
            	System.out.println(s.charAt(20));
        	} catch (StringIndexOutOfBoundsException e) {
            		System.out.println("Exception caught: " + e);
        	}
        	System.out.println("Program ended");
    	}
}
