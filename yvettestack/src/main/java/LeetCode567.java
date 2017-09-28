import java.util.*;

public class LeetCode567 {
    /*public static boolean checkInclusion(String s1, String s2) {
        if(s1==null&&s2==null||s1.length()==0)
            return true;
        if(s2.length()==0)
            return s1.length()==0;

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] src = s1.toCharArray();
        for(char c:src)
        {
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
        }

        Arrays.sort(src);
        String pp = new String(src);
        System.out.println(pp);

        for(int i=0;i<=s2.length()-s1.length();i++)
        {
            String newStr = s2.substring(i,i+s1.length());
            char[] target = newStr.toCharArray();
            Arrays.sort(target);
            String newTarget=new String(target);
            System.out.println(newTarget);
            if(newTarget.equals(pp))
            {
                int aa=0;
            }
            if(isSame(map,newStr))
                return true;
        }
        return false;
    }

    private static boolean isSame(HashMap<Character,Integer> map, String src)
    {
        char[] target = src.toCharArray();
        HashMap<Character,Integer> newMap = new HashMap<Character, Integer>();
        newMap.putAll(map);
        for(char c:target)
        {
            if(!newMap.containsKey(c)||newMap.get(c)==0)
                return false;
            else if(newMap.get(c)==1)
                newMap.remove(c);
            else
                newMap.put(c,newMap.get(c)-1);
        }

        return newMap.isEmpty();
    }
*/
    public static boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        if (len1 > len2) return false;

        int[] count = new int[26];
        for (int i = 0; i < len1; i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        if (allZero(count)) return true;

        for (int i = len1; i < len2; i++) {
            count[s2.charAt(i) - 'a']--;
            count[s2.charAt(i - len1) - 'a']++;
            if (allZero(count)) return true;
        }
        return false;
    }

    private static boolean allZero(int[] count) {
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println(checkInclusion("adc", "dcda"));
        System.out.println(checkInclusion("trinitrophenylmethylnitramine",
        "dinitrophenylhydrazinetrinitrophenylmethylnitramine"));

    }
}
//https://leetcode.com/problems/permutation-in-string/description/
//Time Complexity is O(n)
