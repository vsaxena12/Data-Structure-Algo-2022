
//Leetcode Problem: 3 Longest Substring Without Repeating Characters

class LongestSubstringWithoutRepeatingCharacters 
{
    public int lengthOfLongestSubstring(String s) 
    {
        Set<Character> set = new HashSet<Character>();
        int i=0;
        int j=0;
        int max = 0;
        
        while(i<s.length())
        {
            char c = s.charAt(i);
            
            while(set.contains(c))
            {
                set.remove(s.charAt(j));
                j++;
            }
            
            set.add(c);
            
            max = Math.max(max, i-j+1);
            i++;
        }
        
        return max;
        
    }
}