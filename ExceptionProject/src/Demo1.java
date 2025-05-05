
public class Demo1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int c = 0;
		
		System.out.println("Going to divide...");
		c = a / b; // the jvm detects that an exception has occured
					// the jvm finds out the type of exception - ArihmeticException
					// the jvm automatically creates an object of ArithmeticException
					// and then it implcitly throws the object
					// since we dont have any handler here, the control goes to the default handler
					// the default handler will handle the exception
					// when the control goes to the default handler it will never come back to program
		
		System.out.println("Answer is : " + c);
		System.out.println("Division over...");
	}

}
