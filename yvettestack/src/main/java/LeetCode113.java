import java.util.*;

public class LeetCode113 {
    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        if(root==null) // null case
            return result;
        temp.add(root.val);// add root out of recursive
        pathSumRecur(root,sum,temp,result);
        return result;
    }

    public static void pathSumRecur(TreeNode root, int sum, List<Integer> temp, List<List<Integer>> result)
    {
        if(root == null)
            return;
        if(root.val==sum && root.left==null && root.right==null)
            result.add(new ArrayList<Integer>(temp));
        if(root.left!=null)
        {
            temp.add(root.left.val);
            pathSumRecur(root.left, sum - root.val, temp, result );
            temp.remove(temp.size()-1);
        }
        if(root.right!=null)
        {
            temp.add(root.right.val);
            pathSumRecur(root.right, sum - root.val, temp, result );
            temp.remove(temp.size()-1);
        }
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
        TreeNode n10 = new TreeNode(5);

        n1.left = n2;
        n1.right = n3;
        n2.left =n4;
        n4.left =n7;
        n4.right = n8;
        n3.left = n5;
        n3.right = n6;
        n6.right =n9;
        n6.left = n10;

        List<List<Integer>> result = pathSum(n1,22);
        for(List l:result)
        {
            System.out.print("[");
            for(int i=0;i<l.size()-1;i++)
            {
                System.out.print(l.get(i)+",");
            }
            System.out.print(l.get(l.size()-1)+"]\n");
        }

    }
}
//https://leetcode.com/problems/path-sum-ii/description/
//Time complexity is O(n)

