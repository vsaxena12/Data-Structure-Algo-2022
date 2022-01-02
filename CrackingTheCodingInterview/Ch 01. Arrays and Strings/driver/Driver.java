package driver;

import Q1_01_Is_Unique.IsUnique;
import Q1_02_Check_Permutation.CheckPermutation;

public class Driver {
	
	public static void main(String args[])
	{
		//Q1_03_URLify
		
		
		
		//Q1_02_Is_Unique.IsUnique;
		
		  String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello",
		  "llloh"}}; for (String[] pair : pairs) { String word1 = pair[0]; String word2
		  = pair[1]; boolean anagram = CheckPermutation.permutation(word1, word2);
		  System.out.println(word1 + ", " + word2 + ": " + anagram); }
		 

		//Q1_01_Is_Unique.IsUnique;
		/*
		 * String[] words = {"abcde", "hello", "apple", "kite", "padle"}; for (String
		 * word : words) { System.out.println(word + ": " +
		 * IsUnique.isUniqueChars(word)); }
		 */
		
	}
}
