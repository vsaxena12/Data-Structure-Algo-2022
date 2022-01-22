package arrayList;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCommands {
	
	public void arrayLists(int n) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for(int i = 0; i<n; i++) {
			//arr.add(e);
			arrayList.add(i*10);
			
		}
		
		System.out.println("Add Arrays in ArrayList: "+arrayList);
		
		//arr.add(i,e);
		arrayList.add(4, 34);
		System.out.println("Add Arrays in ArrayList At Index 'x': "+arrayList);
		
		System.out.println("Is 6 present in the arraylist: "+arrayList.contains(6));
		
		System.out.println("Get the specific element "+ arrayList.get(4));
		
		System.out.println("Size "+ arrayList.size());
		
		System.out.println("Remove the specific element "+ arrayList.remove(4));
		System.out.println("New ArrayList: "+arrayList+" -> Size: "+arrayList.size());
		
		System.out.println("To Array: "+arrayList.toArray());
		
		System.out.println("Array Index at 50: " +arrayList.indexOf(50));
		
		System.out.println("Array Set: " +arrayList.set(3,35));
		
		
		Collections.sort(arrayList);
		
	}
}
