public class LeetCode461 {
    public static int hammingDistance(int x, int y) {
        int result = x^y;
        int count=0;
        while(result!=0)
        {
            result=result&(result-1);
            count++;
        }
        return count;
    }

    public static void main(String[] args)
    {
        System.out.println(hammingDistance(1,4));
        System.out.println(hammingDistance(7,16));
    }
}
//https://leetcode.com/problems/hamming-distance/description/
//Time Complexity O(n)
