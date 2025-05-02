import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> allFruits = new HashSet<>();
		
		// c - Crud
		allFruits.add("Apple");
		allFruits.add("Banana");
		allFruits.add("Orange");
		allFruits.add("Banana");
		allFruits.add("Grapes");
		allFruits.add("Watermelon");
		
		// R - Read
		for(String fruit: allFruits) {
			System.out.println(fruit);
		}
		System.out.println("------------");
		Iterator itr = allFruits.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("------------");
//		Consumer<String> logic = (data) -> System.out.println(data);
//		allFruits.forEach(logic);
		allFruits.forEach((data) -> System.out.println(data));

		System.out.println("------------");
		// U - Update
		allFruits.remove("Watermelon");
		allFruits.add("Water Melon");
		allFruits.forEach((data) -> System.out.println(data));
		System.out.println("------------");
		// remove objects from the collection all fruits whose length is not equal to 6
		allFruits.removeIf((data) -> data.length() !=6);
		allFruits.forEach((data) -> System.out.println(data));
		System.out.println("------------");
		
		
		MobilePhone phone1 = new MobilePhone("IPhone16", 2024);
		MobilePhone phone2 = new MobilePhone("Samsung Galaxy S24", 2024);
		MobilePhone phone3 = new MobilePhone("IPhone16", 2024);
		MobilePhone phone4 = new MobilePhone("Motorola", 2023);
		//MobilePhone phone5 = phone1;
		
		Set<MobilePhone> allPhones = new HashSet<MobilePhone>();
		allPhones.add(phone1);
		allPhones.add(phone2);
		allPhones.add(phone3);
		allPhones.add(phone4);
		//allPhones.add(phone5);
		
		allPhones.forEach((data) -> System.out.println(data));
		// whenever we print the object reference variable, it internally/ automatically calls toString() method
	}
}
