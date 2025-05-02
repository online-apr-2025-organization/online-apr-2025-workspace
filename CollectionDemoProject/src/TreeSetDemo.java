import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		SortedSet<Integer> allNumbers = new TreeSet<>();
		allNumbers.add(60);
		allNumbers.add(70);
		allNumbers.add(30);
		allNumbers.add(20);
		allNumbers.add(80);
		allNumbers.add(90);
		allNumbers.add(10);
		allNumbers.add(25);
		allNumbers.add(5);
		allNumbers.forEach((eachNumber) -> System.out.println(eachNumber));
		System.out.println("-------------");
		
		SortedSet<String> allCities = new TreeSet<>();
		allCities.add("Chennai");
		allCities.add("Pune");
		allCities.add("Bangalore");
		allCities.add("Mumbai");
		allCities.add("Delhi");
		allCities.add("Hyderabad");
		allCities.add("Trivandrum");
		allCities.add("Kolkatta");
		allCities.add("Delhi");
		allCities.forEach((data) -> System.out.println(data));
		System.out.println("-------------");
		
		SortedSet<String> allActors = new TreeSet<>((obj1,obj2) -> obj2.compareTo(obj1));
		allActors.add("Daniel Radcliff");
		allActors.add("Emma Watson");
		allActors.add("Rupert Grint");
		allActors.add("Tom Cruise");
		allActors.add("Vijay");
		allActors.add("Nayanthara");
		allActors.forEach((data) -> System.out.println(data));
		System.out.println("-------------");
		
		MobilePhone phone1 = new MobilePhone("IPhone16", 2024);
		MobilePhone phone2 = new MobilePhone("Samsung Galaxy S24", 2024);
		MobilePhone phone3 = new MobilePhone("IPhone16", 2024);
		MobilePhone phone4 = new MobilePhone("Motorola", 2023);
		
		SortedSet<MobilePhone> allPhones = new TreeSet<MobilePhone>((obj1,obj2) -> obj1.getModel().compareTo(obj2.getModel()));
		allPhones.add(phone1);
		allPhones.add(phone2);
		allPhones.add(phone3);
		allPhones.add(phone4);
	
		allPhones.forEach((data) -> System.out.println(data));
	}
}
