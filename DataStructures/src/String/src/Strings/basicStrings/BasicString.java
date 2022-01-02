package Strings.basicStrings;


public class BasicString
{
	public void performStringOperations()
	{
		String s = "How are you doing, buddy";

		//s.length();
		//s.charAt(i);

		System.out.println("Length of the String: "+s.length());
		System.out.println("Char at position 23: "+s.charAt(23));

		//Compare two string
		String s1="hello";  
		String s2="";  
		String s3="me";  
		System.out.println(s1.compareTo(s2));  
		System.out.println(s2.compareTo(s3)); 

		/*
			The java string concat() method combines specified string at the end of this string. It returns combined string. It is like appending another string.
		*/
		String s4="java string";  
		s4.concat("is immutable");  
		System.out.println(s4);  
		s4=s4.concat(" is immutable so assign it explicitly");  
		System.out.println(s4);  

		//s.contains(s2); -- Checks the Boolean

		String str = "To learn Java visit Javatpoint.com";        
        if(str.contains("Javatpoint.com")) {  
            System.out.println("This string contains javatpoint.com");  
        }else  
            System.out.println("Result not found");    


        //s1.equals(s2); --s1.equalsIgnoreCase(s2);
        s1 = "javatpoint";    
        s2 = "javatpoint";    
        s3 = "Javatpoint";  
        System.out.println(s1.equals(s2)); // True because content is same    
        if (s1.equals(s3)) {  
            System.out.println("both strings are equal");  
        }else System.out.println("both strings are unequal");     

        //Convert Bytes
        s1="ABCDEFG";  
		byte[] barr=s1.getBytes();  
		for(int i=0;i<barr.length;i++)
		{  
			System.out.println(barr[i]);  
		}

		/*
		 * s1="ABCDEFG"; char[] ch=s1.getChar(); for(int i=0;i<ch.length;i++) {
		 * System.out.println(ch[i]); }
		 */




	}

}