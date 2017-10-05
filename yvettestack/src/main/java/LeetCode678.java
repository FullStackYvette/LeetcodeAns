public class LeetCode678 {
    public static boolean checkValidString(String s) {
        return checkValidString(s,0,0);
    }

    public static boolean checkValidString(String s, int start, int extraLeft)
    {
        if(extraLeft<0)
            return false;
        for(int i=start;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
                extraLeft++;
            else if(s.charAt(i)==')')
            {
                if(extraLeft<=0)
                    return false;
                extraLeft--;
            }
            else if(s.charAt(i)=='*')
            {
                return checkValidString(s,i+1,extraLeft+1)||checkValidString(s,i+1,extraLeft-1)||checkValidString(s,i+1,extraLeft);
            }
        }
        return extraLeft==0;
    }

    public static void main(String[] args)
    {
        System.out.println(checkValidString(")("));
        System.out.println(checkValidString("()"));
        System.out.println(checkValidString("())"));
        System.out.println(checkValidString("(*))"));
    }
}
//https://leetcode.com/problems/valid-parenthesis-string/description/
