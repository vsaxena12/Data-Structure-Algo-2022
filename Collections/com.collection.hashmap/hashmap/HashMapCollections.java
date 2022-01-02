package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapCollections {
	public static void main(String args[])
	{
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<5; i++)
		{
			int res = i*12; 
			
			map.put(res, i);
		}
		
		System.out.println(map);
		
		System.out.println(map.remove(36)); //returns v and removes it.
		System.out.println(map.get(48)); //returns v mapped to k
		System.out.println(map.size());
		
		System.out.println(map.containsKey(24)); //
		System.out.println(map.containsValue(24)); 
		
		for (Entry<Integer, Integer> e : map.entrySet())
            System.out.println("Key: " + e.getKey()
                               + " Value: " + e.getValue());
	
		Iterator it = map.entrySet().iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		for(Integer key: map.keySet()){
			System.out.println(key);
		
		}
		for(Integer val: map.values())
		{
			System.out.println(val);
		}

	}
}
