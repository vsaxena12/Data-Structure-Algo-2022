package collection.hashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	
	public void hashSetDemo() {
		Set<String> set = new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("c");
		
		System.out.println("Display Sets: "+set);
		
		Book book1 = new Book("Title1", "Auth1", 1857);
		Book book2 = new Book("Title1", "Auth1", 1857);
		
		Set<Book> set2 = new HashSet<>();
		set2.add(book1);
		set2.add(book2);
		System.out.println("Book Sets"+set2);
		
	}
}
