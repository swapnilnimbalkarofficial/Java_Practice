package lambda_expression;

public class TestMain implements Hello {

	public static void main(String[] args) {
		Hello h= new TestMain();
		h.sayHello();
		

	}

	@Override
	public void sayHello() {
		System.out.println("Welcome from Lambda Expression");
		
	}

}
