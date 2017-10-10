import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LeetCode107 {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<TreeNode> current = new LinkedList<TreeNode>();
        LinkedList<TreeNode> next = new LinkedList<TreeNode>();
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> arr = new ArrayList<Integer>();
        if(root==null)
            return result;
        current.add(root);

        while(!current.isEmpty())
        {
            TreeNode temp = current.poll();
            arr.add(temp.val);
            if(temp.left!=null)
                next.add(temp.left);
            if(temp.right!=null)
                next.add(temp.right);
            if(current.isEmpty())
            {
                result.add(new ArrayList<Integer>(arr));
                current=new LinkedList<TreeNode>(next);
                next = new LinkedList<TreeNode>();
                arr = new ArrayList<Integer>();
            }
        }
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args)
    {
        ArrayPrint.printArray(levelOrder(TreeNode.levelTraversal()));
    }
}
//https://leetcode.com/problems/binary-tree-level-order-traversal-ii/description/
