public class LeetCode477 {
    public static int totalHammingDistance(int[] nums) {
        int total = 0, n = nums.length;
        for (int j=0;j<32;j++) {
            int bitCount = 0;
            for (int i=0;i<n;i++)
                bitCount += (nums[i] >> j) & 1;
            total += bitCount*(n - bitCount);
        }
        return total;
    }

    /*
     public int totalHammingDistance(int[] nums) {
        int result=0;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                result+=HammingDistance(nums[i],nums[j]);
            }
        }
        return result;
    }

    public int HammingDistance(int x, int y)
    {
        int n=x^y;
        int count=0;
        while(n!=0)
        {
            n=n&(n-1);
            count++;
        }
        return count;
    }
     */

    public static void main(String[] args)
    {
        int[] test = {4,14,2};
        System.out.println(totalHammingDistance(test));
    }
}
//https://leetcode.com/problems/total-hamming-distance/description/
//Time complexity is k(n-k)
