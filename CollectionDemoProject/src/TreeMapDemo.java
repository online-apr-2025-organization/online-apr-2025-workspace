import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		SortedMap<String, Long> phoneBook = new TreeMap<>();
		
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

	}

}
