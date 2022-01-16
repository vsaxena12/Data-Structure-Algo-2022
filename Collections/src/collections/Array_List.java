package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Array_List {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		System.out.println("Checking");
		
		if(arraylist.isEmpty()) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		arraylist.add(10);
		arraylist.add(-2);
		arraylist.add(300);
		arraylist.add(4);
		
		
		Iterator<Integer> itr = arraylist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-------------------------------------------------------------");
		for(int i: arraylist) {
			System.out.println(i);
		}
		
		if(arraylist.isEmpty()) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		Collections.sort(arraylist);
		System.out.println("Sorted: "+ arraylist);
		System.out.println("Size: "+arraylist.size());
		
		//accessing the element    
		System.out.println("Returning element: "+arraylist.get(1));//it will return the 2nd element, because index starts from 0  
		//changing the element  
		arraylist.set(1,200);
		
		for(int nums:arraylist)    
		    System.out.println(nums);    

		
		arraylist.remove(1);
		System.out.println("Remove+ "+ arraylist);
	}

}
