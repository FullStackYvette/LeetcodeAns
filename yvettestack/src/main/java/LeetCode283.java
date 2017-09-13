public class LeetCode283 {
    public static void moveZeroes(int[] nums) {
        if(nums==null||nums.length==0)
            return;
        int index=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
                nums[index++]=nums[i];
        }
        for(int i=index;i<nums.length;i++)
            nums[i]=0;
    }

    public static void main(String[] args)
    {
        int[] test1 = new int[]{};
        moveZeroes(test1);
        print(test1);
        int[] test2 = new int[]{0, 1, 0, 3, 12};
        moveZeroes(test2);
        print(test2);
    }

    private static void print(int[] test)
    {
        if(test.length==0) {
            System.out.println("[]\n");
            return;
        }
        System.out.print("[");
        for(int i=0;i<test.length-1;i++)
        {
            System.out.print(test[i]+",");
        }
        System.out.print(test[test.length-1]+"]\n");
    }
}
//https://leetcode.com/problems/move-zeroes/description/
//Time complexity O(n)
