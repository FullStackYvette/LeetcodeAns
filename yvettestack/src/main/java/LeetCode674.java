public class LeetCode674 {
    public static int findLengthOfLCIS(int[] nums) {
        if(nums==null||nums.length==0)
            return 0;
        int maxLen=1;
        int prev=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>nums[i-1])
                maxLen=Math.max(i-prev+1,maxLen);
            else
                prev=i;
        }
        return maxLen;
    }

    public static void main(String[] args)
    {
        int[] testSet1 = new int[]{};
        int[] testSet2 = new int[]{1,3,5,4,7};
        int[] testSet3 = new int[]{2,2,2,2,2};
        System.out.println(findLengthOfLCIS(testSet1)); // 0
        System.out.println(findLengthOfLCIS(testSet2)); // 3
        System.out.println(findLengthOfLCIS(testSet3)); // 1
    }
}


//https://leetcode.com/problems/longest-continuous-increasing-subsequence/description/
//Time complexity is O(n)