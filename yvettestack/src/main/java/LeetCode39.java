import java.util.*;

public class LeetCode39 {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> temp = new ArrayList<Integer>();
        dfs(result,temp,target,candidates,0);
        return result;
    }

    public static void dfs(List<List<Integer>> result, List<Integer> temp, int target, int[] candidates, int start)
    {
        if(target<0)
            return;
        if(target==0)
        {
            result.add(new ArrayList<Integer>(temp));
            temp = new ArrayList<Integer>();
        }
        for(int i=start;i<candidates.length;i++)
        {
            temp.add(candidates[i]);
            dfs(result,temp,target-candidates[i],candidates,i);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args)
    {
        int[] test = new int[] {2, 3, 6, 7};
        ArrayPrint.printArray(combinationSum(test,7));
    }
}
//https://leetcode.com/problems/combination-sum/description/
