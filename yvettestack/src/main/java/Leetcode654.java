public class Leetcode654 {
    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaxBT(nums,0,nums.length-1);
    }

    public static TreeNode constructMaxBT(int[] nums, int i, int j)
    {
        if(i>j)
            return null;
        int max=nums[i];
        int index=i;
        for(int k=i;k<=j;k++)
        {
            if(nums[k]>max)
            {
                max=nums[k];
                index=k;
            }
        }
        TreeNode root = new TreeNode(max);
        root.left=constructMaxBT(nums,i,index-1);
        root.right=constructMaxBT(nums,index+1,j);
        return root;
    }

    public static void main(String[] args)
    {
        int[] test = {3,2,1,6,0,5};
        int start=0;
        int end = test.length-1;
        TreeNode result = constructMaximumBinaryTree(test);
        System.out.println(result.val);
        System.out.println(result.left.val);
        System.out.println(result.left.right.val);
        System.out.println(result.left.right.right.val);
        System.out.println(result.right.val);
        System.out.println(result.right.left.val);
    }
}

//https://leetcode.com/problems/maximum-binary-tree/description/
//Time complexity O(n)
