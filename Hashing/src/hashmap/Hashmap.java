package hashmap;
import java.util.HashMap;
import java.util.Map;

/*
 * k,v pair where k is the index and v is the object
 * If you try to insert the duplicate key, it will replace the element of the corresponding key
 * HashMap is similar to HashTable, but it is unsynchronized. 
 * It allows to store the null keys as well, but there should be only one null key object and 
 * there can be any number of null values. 
 */

/*
 * Important Hash Methods
 * clear() - Removes all of the mappings from this map
 * containsKey(Object key) - Returns true if this map contains a mapping for the specified key.
 * containsValue(Object value) - Returns true if this map maps one or more keys to the specified value.
 * entrySet() - Returns a Set view of the mappings contained in this map.
 * get(Object key) - Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
 * isEmpty() - Returns true if this map contains no key-value mappings.
 * keySet() - Returns a Set view of the keys contained in this map.
 * put(K key, V value) - Associates the specified value with the specified key in this map.
 * remove(Object key) - Removes the mapping for the specified key from this map if present.
 * size() - Returns the number of key-value mappings in this map.
 * values() - Returns a Collection view of the values contained in this map.
 * equals() - Compares the specified object with this map for equality.
 * hashCode() - Returns the hash code value for this map.
 * toString() - Returns a string representation of this map.
 * remove(Object key, Object value) - Removes the entry for the specified key only if it is currently mapped to the specified value.
 * replace(K key, V value) - Replaces the entry for the specified key only if it is currently mapped to some value.
 * replace(K key, V oldValue, V newValue) - Replaces the entry for the specified key only if currently mapped to the specified value.
 */


public class Hashmap {
	
	static void addNewElementPairs() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Varun", 1);
		map.put("Kriti", 2);
		map.put("Kiara", 3);
		
		System.out.println("Size of map is: "+map.size());
		System.out.println("Print Map: \n"+map);
		
		if(map.containsKey("Varun")) {
			Integer a = map.get("Varun"); //method to get value from the key
			System.out.println("value for key"
                    + " \"vishal\" is: " + a);
		}
		
		if(map.containsValue("3")) {
			System.out.println("Set: "+map.get("Kiara"));
		}
		
		for (Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println("Key: " + e.getKey()
            + " Value: " + e.getValue());
		}
            
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		addNewElementPairs();
	}

}
