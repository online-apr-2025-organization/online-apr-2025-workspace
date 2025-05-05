import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Demo5 {

	public static void main(String[] args) {
		
			PrintWriter writer = null;
			try {
				writer = new PrintWriter("test1.txt");
				writer.write("write one");	
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}finally {
				writer.close();
			}
				
			try(PrintWriter writer2 = new PrintWriter("test2.txt")){
				writer2.write("write two");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			int a = 15;
			int b = 0;
			
			int c = 0;
			
			if(b !=0) {
				c = a / b;
			}
			
			
	}

}
