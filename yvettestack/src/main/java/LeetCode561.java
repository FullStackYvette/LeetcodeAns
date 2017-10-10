import java.util.*;

public class LeetCode561 {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result=0;
        for(int i=0;i<nums.length;i=i+2)
        {
            result+=nums[i];
        }
        return result;
    }

    public static void main(String[] args)
    {
        int[] nums= {1,4,3,2};
        System.out.println(arrayPairSum(nums));
    }
}
//https://leetcode.com/problems/array-partition-i/description/
//O(n)


