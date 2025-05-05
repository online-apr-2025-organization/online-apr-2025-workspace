
public class Demo3 {

	public static void main(String[] args) {
		// throw keyword is used to explicitly throw an exception object
		// throwing an object explicitly is suitable for custom / user defined exceptions
		try {
			ArithmeticException ae = new ArithmeticException("this is not the way to do it!!");
			throw ae;
		}catch (ArithmeticException a) {
			System.out.println(a.getMessage());
		}
		
		
		int opt = 3;
		
		try {
			if(opt < 1 || opt > 5) {
				InvalidOptionException ioe = new InvalidOptionException(opt);
				throw ioe;
			}
		}catch(InvalidOptionException i) {
			System.out.println(i.getMessage());
		}
	}
}
