import java.util.*;

public class LeetCode217 {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
                return true;
            else
                set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args)
    {
        int[] test1 = {1,2,3,4,5,6};
        int[] test2 = {1,1,2,3,4};
        System.out.println(containsDuplicate(test1));
        System.out.println(containsDuplicate(test2));
    }
}
//https://leetcode.com/problems/contains-duplicate/description/
//Time Complexity O(n)
