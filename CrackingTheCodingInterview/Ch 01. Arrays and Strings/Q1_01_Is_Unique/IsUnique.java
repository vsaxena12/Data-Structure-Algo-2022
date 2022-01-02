package Q1_01_Is_Unique;

public class IsUnique {
	public static boolean isUniqueChars(String str) {
		if(str.length() > 128)
			return false;
		
		boolean[] charStatus = new boolean[128];
		for(int i=0; i<str.length(); i++)
		{
			int val = str.charAt(i);
			System.out.println("Value of the String: "+val);
			if(charStatus[val])
				return false;
			charStatus[val] = true;
		}
		
		return true;
		
	}
}
