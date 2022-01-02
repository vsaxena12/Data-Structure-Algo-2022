package Q1_02_Check_Permutation;

import java.util.Arrays;

public class CheckPermutation {
	
	public static String sort(String s)
	{
		char[] content = s.toCharArray();
		Arrays.sort(content);
		System.out.println(content);
		return new String(content);
	}
	
	public static boolean permutation(String str1, String str2)
	{
		return sort(str1).equals(sort(str2));
	}
}
