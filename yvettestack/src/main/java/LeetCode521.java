public class LeetCode521 {
    public static int findLUSlength(String a, String b) {
        return a.equals(b)?-1:Math.max(a.length(),b.length());
    }

    public static void main(String[] args)
    {
        System.out.println(findLUSlength("aba","cdc"));
    }

}
//https://leetcode.com/problems/longest-uncommon-subsequence-i/description/
