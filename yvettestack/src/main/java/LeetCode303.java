public class LeetCode303 {
    static int[] sum;
    public static void NumArray(int[] nums) {
        if(nums.length==0)
            return;
        sum=new int[nums.length];
        sum[0]=nums[0];
        for(int i=1;i<nums.length;i++)
            sum[i]=nums[i]+sum[i-1];
    }

    public static int sumRange(int i, int j) {
        if(sum==null||sum.length==0)
            return 0;
        if(i-1>=0)
            return sum[j]-sum[i-1];
        else
            return sum[j];
    }

    public static void main(String[] args)
    {
        int[] test1 = new int[0];
        int[] test2 = {-2, 0, 3, -5, 2, -1};
        NumArray(test1);
        System.out.println(sumRange(0,3));
        System.out.println(sumRange(1,4));

        NumArray(test2);
        System.out.println(sumRange(0, 2));
        System.out.println(sumRange(2, 5));
        System.out.println(sumRange(0, 5));

    }
}
//https://leetcode.com/problems/range-sum-query-immutable/description/
//Time Complexity O(n)

