import java.util.*;

public class LeetCode78 {

    public static List<List<Integer>> subsets(int[] nums) {
        if(nums==null||nums.length==0)
            return null;
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> temp = new ArrayList<Integer>();
        dfs(result,temp,0,nums);
        result.add(new ArrayList<Integer>());
        return result;
    }


    public static void dfs(List<List<Integer>> result, List<Integer> temp, int start, int[] nums)
    {
        for(int i=start;i<nums.length;i++)
        {
            temp.add(nums[i]);
            dfs(result,temp,i+1,nums);
            result.add(new ArrayList<Integer>(temp));
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args)
    {
        int[] nums={1,2,3};
        List<List<Integer>> result = subsets(nums);
        for(List ls: result)
        {
            System.out.print("[");
            for(int i=0;i<ls.size()-1;i++)
            {
                System.out.print(ls.get(i)+",");
            }
            if(ls.size()!=0)
                System.out.print(ls.get(ls.size()-1));
            System.out.print("]\n");
        }
    }
}

//https://leetcode.com/problems/subsets/description/
//Time complexity O(2^n)

