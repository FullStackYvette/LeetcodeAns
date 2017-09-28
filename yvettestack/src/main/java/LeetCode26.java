public class LeetCode26 {
    public static int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0)
            return 0;
        if(nums.length==1)
            return 1;
        int index=0;
        int prev=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=prev)
            {
                nums[++index]=nums[i];//index needs to be add first, otherwise[1,1] will fail
                prev=nums[i];
            }
        }
        return index+1;
    }

    public static void main(String[] args)
    {
        int[] test1 = {1,1};
        int[] test2 = {1,1,1,2,2};
        System.out.println(removeDuplicates(test1));
        System.out.println(removeDuplicates(test2));
    }

}
