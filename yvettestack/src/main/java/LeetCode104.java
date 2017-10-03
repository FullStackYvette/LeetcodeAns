public class LeetCode104 {
    public static int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
//https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
//Time complexity O(n)

