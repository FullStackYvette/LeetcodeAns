public class LeetCode643 {
    public static double findMaxAverage(int[] nums, int k) {
        int result=0;
        for(int i=0;i<k;i++)
        {
            result+=nums[i];
        }
        int firstR=result;
        int start=0;
        while(start<nums.length-k)
        {
            result=result-nums[start]+nums[start+k];
            start++;
            firstR=Math.max(firstR,result);
        }
        return (double)firstR/k;
    }

    public static void main(String[] args)
    {
        int[] test = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(test,k));//12.75
    }
}
//https://leetcode.com/problems/maximum-average-subarray-i/description/
//Time Complexity: O(n)
