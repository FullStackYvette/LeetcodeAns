public class LeetCode100 {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null)
            return true;
        else if(p==null||q==null)
            return false;
        else
            return p.val==q.val&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
//https://leetcode.com/problems/same-tree/description/
//Time complexity is O(n)
