import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class IOExceptionExample
{
	public static void main(String args[])
	{
		System.out.println("program started");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader (isr);
		System.out.println("enter value");
		int value=0;
		try{
		value=Integer.parseInt(br.readLine());
		}catch(IOException e){
			System.out.println(e);
		}
		System.out.println(value);
		System.out.println("program ended");
	}
}