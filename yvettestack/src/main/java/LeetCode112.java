import java.util.*;

public class LeetCode112 {
    public static boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)
            return false;
        if(root.val==sum && root.left==null && root.right==null)
            return true;
        return hasPathSum(root.left, sum-root.val)||hasPathSum(root.right, sum-root.val);
    }
    //[],0 will consider as false

    public static boolean hasPathSumIterative(TreeNode root, int sum)
    {
        if(root==null)
            return false;
        LinkedList<TreeNode> nodes = new LinkedList<TreeNode>();
        LinkedList<Integer> value = new LinkedList<Integer>();

        nodes.add(root);
        value.add(root.val);

        while(!nodes.isEmpty())
        {
            TreeNode temp = nodes.poll();
            int val = value.poll();
            if(val==sum)
                return true;
            if(temp.left!=null)
            {
                nodes.add(temp.left);
                value.add(temp.left.val+val);
            }
            if(temp.right!=null)
            {
                nodes.add(temp.right);
                value.add(temp.right.val+val);
            }

        }
        return false;
    }

    public static void main(String[] args)
    {
        TreeNode n1 = new TreeNode(5);
        TreeNode n2 = new TreeNode(4);
        TreeNode n3 = new TreeNode(8);
        TreeNode n4 = new TreeNode(11);
        TreeNode n5 = new TreeNode(13);
        TreeNode n6 = new TreeNode(4);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(2);
        TreeNode n9 = new TreeNode(1);

        n1.left = n2;
        n1.right = n3;
        n2.left =n4;
        n4.left =n7;
        n4.right = n8;
        n3.left = n5;
        n3.right = n6;
        n6.right =n9;

        System.out.println(hasPathSum(n1,22));
        System.out.println(hasPathSumIterative(n1,22));
    }
}
//https://leetcode.com/problems/path-sum/description/
//Time Complexity is O(n)
