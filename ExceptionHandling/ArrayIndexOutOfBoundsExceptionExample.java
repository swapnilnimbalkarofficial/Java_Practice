class ArrayIndexOutOfBoundsExceptionExample
{
	public static void main(String args[])
   	{
        	System.out.println("Program started");
        
       		int a[] = {10, 20, 30, 40};
        	try {
            	System.out.println(a[5]);
        	} catch (ArrayIndexOutOfBoundsException e) {
            		System.out.println("Exception caught: " + e);
        	}
        	System.out.println("Program ended");
    	}
}
