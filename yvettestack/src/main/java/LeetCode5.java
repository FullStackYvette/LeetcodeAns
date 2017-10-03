public class LeetCode5 {
    public static String longestPalindrome(String s) {
        int maxLen=0;
        String result="";
        for(int i=0;i<s.length();i++)
        {
            String temp1 = lengthOfPalindrome(i,i,s);
            String temp2 = lengthOfPalindrome(i,i+1,s);
            String temp;
            if(temp1.length()>temp2.length())
                temp =temp1;
            else
                temp = temp2;
            if(temp.length()>maxLen)
            {
                result = temp;
                maxLen= temp.length();
            }
        }
        return result;
    }

    public static String lengthOfPalindrome(int i, int j,String s)
    {
        while(i>=0&&j<s.length()&&s.charAt(i)==s.charAt(j))
        {
            i--;
            j++;
        }
        return s.substring(i+1,j);
    }

    public static void main(String[] args)
    {
        System.out.println(longestPalindrome("babad"));//aab, bab
        System.out.println(longestPalindrome("cbbd"));;//bb
    }
}
//https://leetcode.com/problems/longest-palindromic-substring/description/
//Time Complexity O(n^2), Space Complexity O(1)
