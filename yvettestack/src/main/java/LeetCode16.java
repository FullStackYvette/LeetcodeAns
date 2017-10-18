import java.util.*;

public class LeetCode16 {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int result=0;
        for(int i=0;i<nums.length;i++)
        {
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                int sum = nums[i]+nums[j]+nums[k];
                int diff = Math.abs(sum-target);
                if(diff==0)
                    return sum;
                if(diff<min)
                {
                    min = diff;
                    result=sum;
                }
                if(sum<target)
                    j++;
                else if(sum>target)
                    k--;
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        int[] test1= {0,0,0};
        int target1 = 1;
        System.out.println(threeSumClosest(test1,target1));

        int[] test2 = {-1, 2, 1, -4};
        int target2 = 2;
        System.out.println(threeSumClosest(test2,target2));
    }
}

