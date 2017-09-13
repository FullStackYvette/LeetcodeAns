import java.util.*;

public class LeetCode1 {
    public static int[] twoSum(int[] nums, int target) {
      HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
      int[] result = new int[2];
      if(nums==null||nums.length==0)
          return result;
      for(int i=0;i<nums.length;i++)
      {
          if(map.containsKey(target-nums[i]))
          {
              result[0]=map.get(target-nums[i]);
              result[1]=i;
          }
          else
              map.put(nums[i],i);
      }
      return result;
    }

    public static void main(String[] args)
    {
        int[] test = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(test,target);
        System.out.print(result[0]+","+result[1]);
    }
}

//https://leetcode.com/problems/two-sum/description/
//Time complexity O(n)