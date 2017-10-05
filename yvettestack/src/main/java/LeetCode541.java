public class LeetCode541 {
    public static String reverseStr(String s, int k) {
        if(s==null||s.length()==0)
            return s;

        char[] src =s.toCharArray();
        for(int i=0;i<src.length;i=i+2*k)
        {
            int end = i+k-1;
            if(end>=src.length)
                end=src.length-1;
            reverse(src,i,end);
        }
        return new String(src);
    }

    public static void reverse(char[] src, int start, int end)
    {
        while(start<end)
        {
            char c = src[start];
            src[start]= src[end];
            src[end] = c;
            start++;
            end--;
        }
    }

    public static void main(String[] args)
    {
        System.out.println(reverseStr("abcdefg",2));
    }
}
//https://leetcode.com/problems/reverse-string-ii/description/
//Time complexity is O(n/2)