public class LeetCode53 {
    public static int maxSubArray(int[] nums) {
        if(nums==null||nums.length==0)
            return 0;
        int maxSum=nums[0];
        int[] sum = new int[nums.length];
        sum[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            sum[i]=Math.max(sum[i-1]+nums[i],nums[i]);
            maxSum = Math.max(maxSum,sum[i]);
            System.out.println(maxSum);
        }
        return maxSum;
    }


    public static void main(String[] args)
    {
        int[] num = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(num);
    }
}
//Needs to save sum[i] instead using maxSum directly
//https://leetcode.com/problems/maximum-subarray/description/
//Time Complexity O(n).
