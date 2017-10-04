public class LeetCode136 {
    public static int singleNumber(int[] nums) {
        int result=nums[0];
        for(int i=1;i<nums.length;i++)
            result=result^nums[i];
        return result;
    }

    public static void main(String[] args)
    {
        int[] test1 ={1,1,2,2,3};
        int[] test2={1,2,2,3,3,4,4};
        System.out.println(singleNumber(test1));
        System.out.println(singleNumber(test2));
    }
}
//https://leetcode.com/problems/single-number/description/
//Time Complexity is O(n)
