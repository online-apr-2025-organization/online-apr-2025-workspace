
public class DataTypesDemo {

	public static void main(String[] args) {
		int num1 = 50;
		System.out.println(num1);
		
		char ch = 's';
		System.out.println(ch);
		
		boolean flag = true;
		System.out.println(flag);
		
		double cost = 23.5;
		System.out.println(cost);

		//float rate = (float)5.5; // explicit casting
		//float rate = 5.5F;
		float rate = 5.5f;
		System.out.println(rate);
		
		short num2 = (short)num1; // explicit casting
		System.out.println(num2);
		
		long num3 = num2; // implicit casting
		System.out.println(num3);
		
		char ch1 = 'b';
		int n1 = ch1; // implicit casting
		System.out.println(n1);
		
		int n2 = 100;
		char ch2 = (char)n2; // explicit casting
		System.out.println(ch2);
		
	}

}
