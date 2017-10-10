import java.util.*;

public class LeetCode103 {
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
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
        for(int i=1;i<result.size();i=i+2)
        {
            Collections.reverse(result.get(i));
        }
        return result;
    }

    public static void main(String[] args)
    {
        ArrayPrint.printArray(zigzagLevelOrder(TreeNode.levelTraversal()));
    }
}
//https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/
