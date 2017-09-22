public class LeetCode10 {
    public static boolean isMatch(String s, String p) {
        if(p.isEmpty())
            return s.isEmpty();
        boolean isFirstMatch = !s.isEmpty() && (p.charAt(0)==s.charAt(0)||p.charAt(0)=='.');//!s.isEmpty() example will be [aa,a]
        if(p.length()>=2 && p.charAt(1)=='*') //p.length()>=2 example will be [aa,a*]
            return isFirstMatch&&isMatch(s.substring(1),p) || isMatch(s,p.substring(2));
        else
            return isFirstMatch && isMatch(s.substring(1),p.substring(1));
    }

    public static void main(String[] args)
    {
        System.out.println(isMatch("aa","a"));//isMatch("aa","a") → false
        System.out.println(isMatch("aa","aa"));//isMatch("aa","aa") → true
        System.out.println(isMatch("aaa","aa"));//isMatch("aaa","aa") → false
        System.out.println(isMatch("aa","a*"));//isMatch("aa", "a*") → true
        System.out.println(isMatch("aa",".*"));//isMatch("aa", ".*") → true
        System.out.println(isMatch("ab",".*"));//isMatch("ab", ".*") → true
        System.out.println(isMatch("aab","c*a*b"));//isMatch("aab", "c*a*b") → true
    }
}
//https://leetcode.com/problems/regular-expression-matching/description/
//Time complexity still needs to calculate
