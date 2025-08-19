package lambda_expression;

interface Parameters{
	int operation(int a, int b);
}

public class WithParameters {

	public static void main(String[] args) {
		
		Parameters add=(a,b)->(a+b);
		Parameters multiply=(a,b)->(a*b);
		
		System.out.println("Addition of parameters: "+add.operation(2, 4));
		System.out.println("Multiplication of parameters: "+multiply.operation(2,4));
		

	}

}
