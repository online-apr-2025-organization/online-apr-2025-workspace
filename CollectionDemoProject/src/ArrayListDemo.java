import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class ArrayListDemo {

	public static void main(String[] args) {
		//ArrayList list1 = new ArrayList();
		//List list2 = new ArrayList();
		//ArrayList<String> list4 = new ArrayList<String>();
		List<String> list3 = new ArrayList<String>(); // recommended
		
		// C - Create
		list3.add("India");
		list3.add("Nepal");
		list3.add("Bhutan");
		list3.add("Bangladesh");
		list3.add("Nepal");
		
		// R - Read
		for(int i=0;i<list3.size();i++) {
			System.out.println(list3.get(i));
		}
		System.out.println("-----------");
		// U - Update
		list3.set(0,"Bharat");
		for(String eachCountry: list3) {
			System.out.println(eachCountry);
		}
		System.out.println("-----------");
		// D - Delete
		list3.remove("Bhutan");
		for(String eachCountry: list3) {
			System.out.println(eachCountry);
		}
		System.out.println("-----------");
		MobilePhone phone1 = new MobilePhone("IPhone16", 2024);
		MobilePhone phone2 = new MobilePhone("Samsung Galaxy S24", 2024);
		MobilePhone phone3 = new MobilePhone("IPhone16", 2024);
		MobilePhone phone4 = new MobilePhone("Motorola", 2023);
		
		List<MobilePhone> allPhones = new ArrayList<MobilePhone>();
		allPhones.add(phone1);
		allPhones.add(phone2);
		allPhones.add(phone3);
		allPhones.add(phone4);
	
		allPhones.forEach((data) -> System.out.println(data));
		
	}

}
