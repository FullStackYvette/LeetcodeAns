public class LeetCode344 {
    public static String reverseString(String s) {
        if(s==null||s.length()==0)
            return s;
        char[] src=s.toCharArray();
        for(int i=0;i<s.length()/2;i++)
        {
            char c=src[i];
            src[i]=src[s.length()-1-i];
            src[s.length()-1-i]=c;
        }
        return new String(src);
    }

    public static void main(String[] args)
    {
        System.out.println(reverseString("hello"));
    }
}
//https://leetcode.com/problems/reverse-string/description/
//Time Complexity O(n)
