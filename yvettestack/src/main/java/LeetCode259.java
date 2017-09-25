import java.util.*;

public class LeetCode259 {
    public static int threeSumSmaller(int[] nums, int target) {
        int count=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            int j=i+1;
            int k=nums.length-1;

            while(j<k)
            {
                if(nums[i]+nums[j]+nums[k]<target)
                {
                    count+=k-j;//Do not just use one by one, since when you increase j you can not revoke back to k
                    j++;

                }
                else
                {
                    k--;

                }
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        int[] test1 = {-2, 0, 1, 3};
        System.out.println(threeSumSmaller(test1,2)); //2

        int[] test2 = {1,1,-2};
        System.out.println(threeSumSmaller(test2,1)); //1

        int[] test3 = {2,0,0,2,-2};
        System.out.println(threeSumSmaller(test3,2)); //5, does not need unique triple

        int[] test4 = {3,2,-2,6,2,-2,6,-2,-4,2,3,0,4,4,1};
        System.out.println(threeSumSmaller(test4,2)); //115
    }
}

//https://leetcode.com/problems/3sum-smaller/description/
// The turple does not be to be unique
// There is difference beween Leetcode 15 and Leetcode 259




