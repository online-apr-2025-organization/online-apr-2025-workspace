package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {
	
		Set<String> allCities = new HashSet<String>();
		allCities.add("Chennai");
		allCities.add("Mumbai");
		allCities.add("Pune");
		allCities.add("Bangalore");
		allCities.add("Calcutta");
		allCities.add("Hyderabad");
		
//		Stream<String> st1 = allCities.stream();
//		Stream<String> st2 = st1.map((data) -> data.toUpperCase());
//		Set<String> allTransformedCities = st2.collect(Collectors.toSet());
		
		Set<String> allTransformedCities = allCities
												.stream()
												.map((data) -> data.toUpperCase())
												.collect(Collectors.toSet());
		
		allTransformedCities.forEach(city -> System.out.println(city));
		System.out.println("--------------------");
		// we can perform operations on stream
		// these operations can be of 2 types
		// 1. terminal operation
		//		- a stream should always end with one terminal operation
		//		- tip is terminal operations do not return Stream
		// 2. intermediate operation
		//		- a stream can have 0 or any number of intermediate operation
		// 		- tips is intermediate operations return Stream
		
		// questions
		// 1. print the elements of the collection using stream
		allCities
			.stream()
			.forEach((data) -> System.out.println(data));
		System.out.println("--------------------");
		
		// 2. filter the city which starts with 'C' and print them on the console
		allCities
			.stream()
			.filter(eachCity -> eachCity.startsWith("C"))
			.forEach(eCity -> System.out.println(eCity));
		System.out.println("--------------------");
		
		// 3. find the count of cities
		long totalCount = allCities
							.stream()
							.count();
		System.out.println(totalCount);
		System.out.println("--------------------");
		
		// 4. find the count of cities not starting with 'C'
		
		long count = allCities
						.stream()
						.filter(myData -> !myData.startsWith("C"))
						.count();
		System.out.println(count);
		System.out.println("--------------------");
		
		List<Integer> allNumbers = Arrays.asList(20, 40, 10, 70, 30, 15, 55, 95, 80, 40, 70, 20);	
		
		// 5. find the square of distinct numbers of the collection and print them on the console
		allNumbers
			.stream()
			.distinct()
			.map((num) -> num * num)
			.forEach(num1 -> System.out.println(num1));
		System.out.println("--------------------");
		
		// 6. find the max number of the collection and print on console
		System.out.println(allNumbers.stream().max(Comparator.naturalOrder()).get());
		System.out.println("--------------------");
		
		// 7. find the sum of the numbers of the collection and print on console
		System.out.println(allNumbers.stream().reduce(0, (a, b) -> a + b ));
  	}

}
