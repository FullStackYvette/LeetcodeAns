import java.util.*;

public class LeetCode15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] > nums[i - 1])//used for the this test case
            {
                int j = i + 1;
                int k = nums.length - 1;
                while (j < k) {
                    if (nums[i] + nums[j] + nums[k] < 0)
                        j++;
                    else if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> temp = new ArrayList<Integer>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        j++;
                        k--;
                        result.add(temp);
                        while (j < k && nums[j] == nums[j - 1])
                            j++;
                        while (j < k && nums[k] == nums[k + 1])
                            k--;
                    } else
                        k--;

                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] test1 = {-1, 0, 1, 2, -1, -4};

        ArrayPrint.printArray(threeSum(test1));
    }
}
//https://leetcode.com/problems/3sum/description/
//Time complexity O(n^2)

