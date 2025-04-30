import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo {

	public static void main(String[] args) {
		Operation op = new Addition();
		System.out.println("First way : " + op.operate(5, 1));
		
		op = new Multiplication();
		System.out.println("First way : " + op.operate(5, 3));

		System.out.println("-----------------");
		
		Operation op1 = new Operation() {
			@Override
			public int operate(int a, int b) {
				return a + b;
			}
		};
		
		System.out.println("Second way : " + op1.operate(3, 11));
		
		op1 = new Operation() {
			@Override
			public int operate(int a, int b) {
				return a * b;
			}
		};
		System.out.println("Second way : " + op1.operate(3, 11));
		System.out.println("-----------------");
		
		Operation op2 =(a, b) -> a + b;
		System.out.println("Third way : " + op2.operate(33, 11));
		System.out.println("Third way : " + op2.operate(2, 8));
		
		op2 = (num1, num2) -> num1 * num2;
		System.out.println("Third way : " + op2.operate(30, 11));
		
		System.out.println("-----------------");
		BiFunction<Integer, Integer, Integer> op3 = (a, b) -> a + b;
		System.out.println("Inbuilt Functional Interface : " + op3.apply(6, 3));
		op3 = (num1, num2) -> num1 * num2;
		System.out.println("Inbuilt Functional Interface : " + op3.apply(6, 3));
		System.out.println("-----------------");
		
		// using lambda expressions
		// 1. find the square of a number
		Function<Integer, Double> square = (num1) -> Math.pow(num1, 2);
		System.out.println("Square of 5 is : " + square.apply(5));
		 
		// 2. find whether a number is odd or even
		Predicate<Integer> oddeven = (num1) -> num1 % 2 == 0;
		System.out.println("IS 6 even ? " + oddeven.test(6));
		
		// 3. Generate a random number
		Supplier<Integer> random = () -> (int)(Math.random() * 100);
		System.out.println("Random number between 1 and 100 : " + random.get());
		
		// 4. print 5 multiples of a given number
		Consumer<Integer> multiples = (num1) -> {
			for(int i=1;i<=5;i++) {
				System.out.println(num1 + " x " + i + " = " + (num1 * i));
			}
		};
		System.out.println("Multiples of 5");
		multiples.accept(5);
		
		// 5. convert a string to uppercase
		Function<String, String> convert = (str) -> str.toUpperCase();
		System.out.println("upper case of Hello : " + convert.apply("Hello"));
		
		// 6. find the factorial of a number
		Function<Integer, Integer> factorial = (num1) -> {
			int fact = 1;
			for(int i=1;i<=num1;i++) {
				fact = fact * i;
			}
			return fact;
		};
		System.out.println("Factorial of 3 : " + factorial.apply(3));
		
		// 7. find the sum of 2 arrays
		BiFunction<Object, Object, Integer> sum = (obj1, obj2) -> {
			int answer = 0;
			int[] arr1 = (int[]) obj1;
			int[] arr2 = (int[]) obj2;
			for(int num: arr1) {
				answer += num;
			}
			for(int num: arr2) {
				answer += num;
			}
			return answer;
			
		};
		
		System.out.println("Sum of 2 arrays : " + sum.apply(new int[]{1}, new int[]{2, 3, 4}));
		
		// 8. find sum of digits of a number
		Function<Integer, Integer> sumDigits = (num1) -> {
			int sum1 = 0;
			while(num1>0) {
				int rem = num1 % 10;
				sum1 += rem;
				num1 /= 10;
			}
			return sum1;
		};
		System.out.println("Sum of the digits in 482 : " + sumDigits.apply(482));
		
	}

}
