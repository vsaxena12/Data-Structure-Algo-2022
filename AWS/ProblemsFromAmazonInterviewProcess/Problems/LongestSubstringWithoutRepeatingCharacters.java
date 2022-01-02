package Problems;
import java.util.HashSet;


class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<Character>();
        int counter = 0;
        int temp = 0;
        int result = 0;
        int j = 0;

        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            while(set.contains(c))
            {
                set.remove(s.charAt(j));
                j++;
            }
            set.add(s.charAt(i));
            
            counter = Math.max(counter, i-j+1);

            
        }
        return counter;
    }
}
