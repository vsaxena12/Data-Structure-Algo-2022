package arrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class DriverArrayList {

	private static void collectionsMethods() {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		/*
		 * add(element)
		 * add(index, element)
		 * remove(index)
		 * contains(element)
		 * size()
		 * isEmpty()
		 * get(index)
		 * indexOf(object)
		 */
		for(int i=0; i<10; i++)
		{
			arraylist.add(i*2);
		}
		System.out.println(arraylist);
		
		arraylist.add(5, 50);
		System.out.println(arraylist);
		
		arraylist.remove(5);
		System.out.println(arraylist);
		
		if(arraylist.contains(5))
		{
			System.out.println(true);
		}
		else
			System.out.println(false);
		
		System.out.println(arraylist.size());
		
		if(arraylist.isEmpty())
			System.out.println(true);
		else
			System.out.println(false);
		
		System.out.println(arraylist.get(4));
		
		/*
		 * for(int element: arraylist) 
		 * { 
		 * 		System.out.println(Integer.valueOf(element));
		 * 		if(element == 8) 	
		 * 			arraylist.remove(8);//ConcurrentModificationException }
		 */
		
		//Use of Iterator
		
		Iterator<Integer> iterator = arraylist.iterator();
		while(iterator.hasNext())
		{
			int element = iterator.next();
			System.out.println((element));
			 if(element == 8) 
				 iterator.remove();
		}
		System.out.println(arraylist);
		
	}
	
	private static void iterator()
	{
		//If we need to remove or perform other operation during iteration, 
		//we use iterator method
		//iterator()
		//hasNext()
		//next()
	}
	
	
	
	public static void main(String[] args) {
		collectionsMethods();		
	}

}
