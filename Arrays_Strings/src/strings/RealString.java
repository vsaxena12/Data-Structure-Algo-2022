package strings;

public class RealString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch = {'j','a','v','a',' ','t','u','t'};
		String s = new String(ch);
		
		String str = new String("java tut");
		 
		System.out.println(s);
		System.out.println(str);
		if(s == str) {
			System.out.print(true);
		}
		else {
			System.out.println(false);
		}
		
		if(s.equals(str)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		//String Pool
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		if(s1 == s2) {
			System.out.println(true);
		}
		
		if(s1 == s3) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		if(s1.equals(s3)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		if(s4 == s3) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		if(s4.equals(s3)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		
		String s5 = "String";
		char c = s5.charAt(4);
		System.out.println(c);
		
	}

}
