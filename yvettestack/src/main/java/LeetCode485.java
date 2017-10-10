public class LeetCode485 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        if(nums==null||nums.length==0)
            return 0;
        if(nums.length==1&&nums[0]==1)
            return 1;
        int start =0;
        int maxLen =0;
        int len=0;
        while(start<nums.length)
        {
            if(nums[start]==0)
            {
                start++;
                len=0;
            }
            else
            {
                start++;
                len++;
            }
            maxLen=Math.max(len,maxLen);
        }
        return maxLen;
    }
}
//https://leetcode.com/problems/max-consecutive-ones/description/
