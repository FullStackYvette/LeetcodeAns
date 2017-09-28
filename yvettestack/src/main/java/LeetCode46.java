import java.util.*;

public class LeetCode46 {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> temp = new ArrayList<Integer>();
        boolean[] used = new boolean[nums.length];
        dfs(result,temp,nums,used);
        return result;
    }

    public static void dfs(List<List<Integer>> result, List<Integer> temp, int[] nums, boolean[] used)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(temp.size()==nums.length)
            {
                result.add(new ArrayList<Integer>(temp));
                temp = new ArrayList<Integer>();
            }
            if(used[i]==true)
                continue;
            temp.add(nums[i]);
            used[i]=true;
            dfs(result,temp,nums,used);
            temp.remove(temp.size()-1);
            used[i]=false;
        }
    }

    public static void main(String[] args)
    {
        int[] test1 = {1,2,3};
        ArrayPrint.printArray(permute(test1));
    }
}


