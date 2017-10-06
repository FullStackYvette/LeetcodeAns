import java.util.*;

public class LeetCode266 {
    public boolean canPermutePalindrome(String s) {
        char[] src = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0;i<src.length;i++)
        {
            if(map.containsKey(src[i]))
                map.put(src[i],map.get(src[i])+1);
            else
                map.put(src[i],1);
        }
        boolean isOdd=false;
        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            if(entry.getValue()%2==0)
                continue;
            else if(!isOdd)
                isOdd=true;
            else
                return false;
        }
        return true;
    }
}
//https://leetcode.com/problems/palindrome-permutation/description/
//O(n)
