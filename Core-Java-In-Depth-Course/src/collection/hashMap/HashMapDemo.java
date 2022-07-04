package collection.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public void hashMapDemo() {
		Map<String, Integer> map = new HashMap<>();
		map.put("John", 25);
		map.put("Raj", 45);
		map.put("Anita", null);
		
		System.out.println(map);
		
		map.put("Anita", 35);
		System.out.println(map);
		
		System.out.println("Contains John?: "+map.containsKey("John"));
		System.out.println("Contains John's age?: "+map.get("John"));
		
		System.out.println("Iterating using keySet ...");
		Set<String> names = map.keySet();
		
		for(String name: names) {
			System.out.println("Name: "+name+", Age:"+map.get(name));
		}
		
		System.out.println("\n");
		System.out.println("Iterating using entrySet ...");
		Set<Map.Entry<String, Integer>> mappings = map.entrySet();
		
		for(Map.Entry<String, Integer> mapping: mappings) {
			System.out.println("Name: "+mapping.getKey()+", Age:"+mapping.getValue());
		}
		
		
		map.remove("Anita");
		System.out.println(map);
		
	
		Map<String, Map<String, Object>> userProfile = new HashMap<>();
		Map<String, Object> profiles = new HashMap<>();
		
		profiles.put("age",25);
		profiles.put("department","CS");
		profiles.put("city","New York");
		userProfile.put("Var", profiles);
		
		profiles = new HashMap<>();
		profiles.put("age",45);
		profiles.put("department","DS");
		profiles.put("city","SFo");	
		userProfile.put("Vasu", profiles);
		
		System.out.println(userProfile);
		
		Map<String, Object> profile1 = userProfile.get("Var");
		int age = (Integer) profile1.get("age");
		System.out.println("Var's age: "+age);
		
	}
}
