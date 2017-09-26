public class LeetCode14 {
    public static String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0)
            return "";
        if(strs.length==1)
            return strs[0];
        String result = strs[0];
        for(int i=1;i<strs.length;i++)
            result = commonStr(result,strs[i]);
        return result;
    }

    public static String commonStr(String str1, String str2)
    {
        int len = Math.min(str1.length(),str2.length());//This one covers the conner case ["",""]
        int start=0;
        char[] src1 = str1.toCharArray();
        char[] src2 = str2.toCharArray();
        while(start<len && src1[start]==src2[start])
            start++;
        return str1.substring(0,start);
    }

    public static void main(String[] args)
    {
        String[] test1 = new String[]{"",""};
        String[] test2 = new String[]{" ", " "};
        String[] test3 = new String[]{"aa","aa"};
        System.out.println(longestCommonPrefix(test1));
        System.out.println(longestCommonPrefix(test2));
        System.out.println(longestCommonPrefix(test3));
    }
}
//https://leetcode.com/problems/longest-common-prefix/description/
//Time Complexity is n^p
