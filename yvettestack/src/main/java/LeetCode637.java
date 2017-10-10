import java.util.*;

public class LeetCode637 {
    public static List<Double> averageOfLevels(TreeNode root) {
        LinkedList<TreeNode> current = new LinkedList<TreeNode>();
        LinkedList<TreeNode> next = new LinkedList<TreeNode>();
        List<Double> result = new ArrayList<Double>();
        if(root==null)
            return result;
        current.add(root);
        double val=0;
        int count=0;
        while(!current.isEmpty())
        {
            TreeNode temp = current.poll();
            val+=temp.val;
            count++;
            if(temp.left!=null)
                next.add(temp.left);
            if(temp.right!=null)
                next.add(temp.right);
            if(current.isEmpty())
            {
                result.add(val/count);
                current=new LinkedList<TreeNode>(next);
                next = new LinkedList<TreeNode>();
                count=0;
                val=0;
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        ArrayPrint.printDoubleList(averageOfLevels(TreeNode.levelTraversal()));
    }
}
//https://leetcode.com/problems/average-of-levels-in-binary-tree/description/
