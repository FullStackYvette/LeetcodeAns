public class LeetCode557 {
    public static String reverseWords(String s) {
        if(s==null||s.length()==0)
            return s;
        char[] src = s.toCharArray();
        int start=0;
        int end=0;
        for(int i=0;i<src.length;i++)
        {
            if(src[i]==' ')
            {
                end = i-1;
                reverse(src,start,end);
                start=i+1;
            }
            else if(i==src.length-1)
            {
                end =i;
                reverse(src,start,end);
            }
        }
        return new String(src);
    }

    public static void reverse(char[] src, int start, int end)
    {
        while(start<end)
        {
            char c = src[start];
            src[start]=src[end];
            src[end]=c;
            start++;
            end--;
        }
    }

    public static void main(String[] args)
    {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
//https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
//Time complexity O(n)
