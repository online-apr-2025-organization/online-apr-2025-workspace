import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, Long> phoneBook = new HashMap<>();
				
		// C - Create
		phoneBook.put("ABC", 1234567890L);
		phoneBook.put("LMN", 1111111111L);
		phoneBook.put("ASD", 2222222222L);
		phoneBook.put("QWE", 3333333333L);
		
		// R - Read
		Set<String> allKeys = phoneBook.keySet();	
		for(String eachKey : allKeys) {
			System.out.println("Key : " + eachKey + " , Value = " + phoneBook.get(eachKey));
		}
		System.out.println("-------------");
		
		// U - Update
		phoneBook.put("ASD", 2424242424L);
		
		for(Entry<String, Long> entrySet : phoneBook.entrySet()) {
			System.out.println("K : " + entrySet.getKey() + " , V : " + entrySet.getValue());
		}
		System.out.println("-------------");
		// D - Delete
		phoneBook.remove("QWE");
		phoneBook.forEach((key, value) -> System.out.println("Key is : " + key + " , Value is : " + value));
		
	}

}
