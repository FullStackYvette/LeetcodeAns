import java.util.*;

public class LeetCode77 {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> temp = new ArrayList<Integer>();
        int[] nums = new int[n];
        for(int i=1;i<=n;i++)
            nums[i-1]=i;
        dfs(result,temp,k,nums,0);
        return result;
    }

    public static void dfs(List<List<Integer>> result, List<Integer> temp, int k, int[] nums, int start)
    {
        if(temp.size()==k)
        {
            result.add(new ArrayList<Integer>(temp));
            temp = new ArrayList<Integer>();
        }
        for(int i=start;i<nums.length;i++)
        {
            temp.add(nums[i]);
            dfs(result,temp,k,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args)
    {
        ArrayPrint.printArray(combine(4,2));
    }
}
//https://leetcode.com/problems/combinations/description/
//C(k|n)
