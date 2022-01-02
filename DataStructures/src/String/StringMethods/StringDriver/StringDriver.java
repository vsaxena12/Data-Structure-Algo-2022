package StringDriver;

public class StringDriver {
	
	static String str1;
	static String str2 = null;
	
	public static void length()
	{
		str1 = "Hello World!";
		System.out.println("Length of the String: "+str1.length());
	}
	
	public static boolean isEmpty()
	{
		str2 = "u";
		if(str2.isEmpty()) //It is a boolean method{
		{
			System.out.print("Length of the String: "+str2.length()+": ");
			return true;
		}
		else {
			System.out.print("Length of the String: "+str2.length()+": ");
			return false;
		}
			
	}
	
	public static void charAt()
	{
		str1 = "Hello World!!!!!!";
		System.out.println("Char At position 11: "+str1.charAt(11));
		
	}
	
	public static void getChar() {}
	
	public static void getByte() {}
	
	public static void toCharArray() {}
	
	public static void equals() {}
	
	//public static void hashCode() {}
	
	public static void equalsIgnoreCase() {}
	
	public static void split() {}
	
	public static void toLowerCase() {}
	
	public static void toUpperCase() {}
	
	public static void contentEquals() {}
	
	public static void compareTo() {}
	
	public static void compareToIgnoreCase() {}
	
	public static void startsWith() {}
	
	public static void endsWith() {}
	
	public static void substring() {}
	
	public static void subSequence() {}

	public static void concat() {}
	
	public static void replace() {} 
	public static void replaceFirst() {} 
	public static void replaceAll() {}
	
	public static void contains() {}
	
	public static void join() {}
	
	public static void trim() {} 
	public static void strip() {} 
	public static void stripLeading() {}
	public static void stripTrailing() {}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		length(); //Length of the String - Starts with index 0
		System.out.println(isEmpty()); //String is empty
		charAt();
	}

}
