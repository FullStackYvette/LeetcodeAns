import java.util.*;

public class LeetCode47 {
    public static List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> temp = new ArrayList<Integer>();
        boolean[] visited = new boolean[nums.length];
        dfs(result,temp,nums,visited);
        return result;
    }

    public static void dfs(List<List<Integer>> result, List<Integer>temp, int[] nums, boolean[] visited)
    {
        if(temp.size()==nums.length)
        {
            result.add(new ArrayList<Integer>(temp));
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!visited[i])
            {
                if(i>=1&&nums[i]==nums[i-1]&&!visited[i-1])continue;
                /*
                [1,1,2]
                [1,2,1]
                [1,1,2]
                [1,2,1]
                [2,1,1]
                [2,1,1]
                 */
                temp.add(nums[i]);
                visited[i]=true;
                dfs(result,temp,nums,visited);
                temp.remove(temp.size()-1);
                visited[i]=false;
            }
        }
    }

    public static void main(String[] args)
    {
        int[] test = {1,1,2};
        ArrayPrint.printArray(permuteUnique(test));
    }

}
