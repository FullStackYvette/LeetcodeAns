import java.util.*;

public class LeetCode3 {
    public static int lengthOfLongestSubstring(String s) {
        char[] src = s.toCharArray();
        int start=0;
        int maxLen=0;
        HashMap<Character, Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<src.length;i++)
        {
            if(map.containsKey(src[i])) {
                maxLen= Math.max(maxLen, map.size());
                while(map.containsKey(src[i]))
                {
                    map.remove(src[start]);
                    start++;
                }
            }
            map.put(src[i],1);
        }
        maxLen=Math.max(maxLen,map.size());
        return maxLen;
    }

    public static void main(String args[])
    {
        String test1 = "abcabcbb";
        String test2 = "bbbbb";
        String test3 = "pwwkew";

        System.out.println(lengthOfLongestSubstring(test1));//3
        System.out.println(lengthOfLongestSubstring(test2));//1
        System.out.println(lengthOfLongestSubstring(test3));//3
    }
}
//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
//time complexity: O(n)
