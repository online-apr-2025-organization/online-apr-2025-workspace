import java.util.ArrayList;
import java.util.List;

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
		
	}

}
