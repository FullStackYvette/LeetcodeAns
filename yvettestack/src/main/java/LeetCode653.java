import java.util.*;

public class LeetCode653 {
    public static boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<Integer>();
        if(root==null)
            return k==0;
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            TreeNode temp = queue.poll();
            if(set.contains(k-temp.val))
                return true;
            set.add(temp.val);
            if(temp.left!=null)
                queue.add(temp.left);
            if(temp.right!=null)
                queue.add(temp.right);
        }
        return false;
    }

    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(5);
        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(6);
        TreeNode n3 = new TreeNode(2);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(7);
        root.left = n1;
        n1.left =n3;
        n1.right=n4;
        root.right = n2;
        n2.right=n5;
        System.out.println(findTarget(root,9)); //True
        System.out.println(findTarget(root,28)); //False

    }
}
//https://leetcode.com/problems/two-sum-iv-input-is-a-bst/description/
