public class LeetCode268 {
    public static int missingNumber(int[] nums) {
        int n=nums.length;
        int result=0;
        for(int i=1;i<=n;i++)
        {
            result=result^i;
        }
        for(int i=0;i<nums.length;i++)
        {
            result=result^nums[i];
        }
        return result;
    }

    public static void main(String[] args)
    {
        int[] test1 = {0, 1, 3};
        int[] test2={0};
        System.out.println(missingNumber(test1));
        System.out.println(missingNumber(test2));
    }
}
