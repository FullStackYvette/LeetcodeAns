import java.util.*;

public class LeetCode500 {
    public static String[] findWords(String[] words) {
        String firstRow = "qwertyuiop";
        String secondRow="asdfghjkl";
        String thirdRow = "zxcvbnm";
        HashSet<Character> set1 = getSet(firstRow);
        HashSet<Character> set2 = getSet(secondRow);
        HashSet<Character> set3 = getSet(thirdRow);
        ArrayList<String> result = new ArrayList<String>();
        for(String w:words)
        {
            if(containsInOneRow(w,set1)||containsInOneRow(w,set2)||containsInOneRow(w,set3))
                result.add(w);
        }
        return result.toArray(new String[result.size()]);
    }

    private static HashSet<Character> getSet (String src)
    {
        HashSet<Character> temp = new HashSet<Character>();
        char[] source = src.toCharArray();
        for(char c:source)
            temp.add(c);
        return temp;
    }

    private static boolean containsInOneRow(String w, HashSet<Character> set)
    {
        String temp = w.toLowerCase();
        for(int i=0;i<temp.length();i++)
        {
            char c=temp.charAt(i);
            if(!set.contains(c))
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        String[] test1 = {"Hello", "Alaska", "Dad", "Peace"};
        ArrayPrint.printStrArray(findWords(test1));
    }
}
//https://leetcode.com/problems/keyboard-row/description/
