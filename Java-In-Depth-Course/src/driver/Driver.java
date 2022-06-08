package driver;
import collection.arraylist.ArrayListCollection;
import collection.hashMap.HashMapDemo;
import collection.hashSet.HashSetDemo;

public class Driver {

	public static void main(String[] args) {

		ArrayListCollection arrayListCollection = new ArrayListCollection();
		
		ArrayListCollection iterator = new ArrayListCollection();
		//iterator.iteratorDemo();
		System.out.println(arrayListCollection.arrayListDemo());
		
		System.out.println("---------------------------------HashSet---------------------------------");
		HashSetDemo set = new HashSetDemo();
		set.hashSetDemo();
		
		System.out.println("---------------------------------HashMap---------------------------------");
		HashMapDemo map = new HashMapDemo();
		map.hashMapDemo();
		
		
	}

}
