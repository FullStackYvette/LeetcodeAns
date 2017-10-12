import java.util.*;

public class LeetCode389 {
    public static char findTheDifference(String s, String t) {
        char[] src = s.toCharArray();
        char[] target= t.toCharArray();
        char result='\0';
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(char c: src)
        {
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
        }

        for(char c: target)
        {
            if(map.containsKey(c)) {
                if(map.get(c)==0) {
                    return c;
                }
                map.put(c, map.get(c) - 1);
            }
            else
                return c;
        }
        return result;
    }

    public static void main(String[] args)
    {
        System.out.println(findTheDifference("abcd","abcde"));
        System.out.println(findTheDifference("abcd","abzcd"));
    }

}
