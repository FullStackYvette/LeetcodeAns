import java.util.*;

public class LeetCode169 {
    public static int majorityElement(int[] nums) {
        if(nums.length==1)
            return nums[0];

        int count=nums.length/2;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int result = -1;
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                if(map.get(nums[i])==count)
                    result = nums[i];
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
                map.put(nums[i],1);
        }
        return result;
    }
}
//https://leetcode.com/problems/majority-element/description/
//Time Complexity O(n)
