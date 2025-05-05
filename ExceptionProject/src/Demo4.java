import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo4 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void method1() throws FileNotFoundException {
		method2();
	}
	
	static void method2() throws FileNotFoundException {
		method3();
	}
	
	static void method3()throws FileNotFoundException {
		// some code here which throws exception like FIleNotFoundException
		FileInputStream fis = new FileInputStream("sample.txt");
		
		ArithmeticException ae = new ArithmeticException("this is not the way to do it!!");
		throw ae;
	}
}
