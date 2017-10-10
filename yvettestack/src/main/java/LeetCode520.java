public class LeetCode520 {
    public static boolean detectCapitalUse(String word) {
        char[] src = word.toCharArray();
        boolean isCap=false;
        boolean isNonCap=false;
        boolean isFirst=false;
        for(int i=0;i<src.length;i++)
        {
            char c = src[i];
            if(c>='A'&&c<='Z'&&i==0)
                isFirst=true;

            else if(c>='A'&&c<='Z'&&i!=0)
            {
                if(isNonCap)
                    return false;
                isCap=true;
            }
            else
            {
                if(isCap)
                    return false;
                isNonCap=true;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("leetcode"));
        System.out.println(detectCapitalUse("Leetcode"));
        System.out.println(detectCapitalUse("uSa"));
    }
}
//https://leetcode.com/problems/detect-capital/description/
//O(n)
