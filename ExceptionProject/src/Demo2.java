
public class Demo2 {
	// try, catch, finally, throw, throws
	
	public static void main(String[] args) {
		int a = 10;
		int b = 1;
		int c = 0;
		
		System.out.println("Going to divide...");
		try {
			c = a / b; // the jvm detects that an exception has occured
						// the jvm finds out the type of exception - ArihmeticException
						// the jvm automatically creates an object of ArithmeticException
						// and then it will implcitly throw the object
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
			ae.printStackTrace();
			
			b = 1;
			c = a / b;
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			// close the resources that were opened in the try block
		}
		
		System.out.println("Answer is : " + c);
		System.out.println("Division over...");

		// can a try block have multiple catch blocks? - yes
		// is the sequence of the catch blocks important? - yes
		// is it mandatory to write the finally block? - the new syntax "try with resources" does not need finally block
		// can I have a try block with finally and no catch block? - yes
	}

}
