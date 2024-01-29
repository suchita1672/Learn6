package FrequentlyAsked;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NameFinder {
	
	private static Map<Integer, String> map = new HashMap<>();
	
	static {
		map.put(11, "suchita");
		map.put(12, "suraj");
		map.put(13, "nita");
		map.put(14, "raj");
	}
	
	public static String m1(int id) {
		String name = map.get(id);
		return  name !=null ?name.toUpperCase():null;
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter Id");
		while (sc.hasNext()){
//			String result = sc.next();
			
		
		String result = m1(11);
		result =sc.next();
		if (result != null) {
		System.out.println(result);
		} else {
			System.out.println("name not found for given Id");
		}
		
		}
	}
}
	


