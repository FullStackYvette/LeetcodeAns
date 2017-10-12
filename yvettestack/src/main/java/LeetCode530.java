import java.util.*;

public class LeetCode530 {
    public static int getMinimumDifference(TreeNode root) {
        if(root==null)
            return 0;
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            TreeNode temp = queue.poll();
            list.add(temp.val);
            if(temp.left!=null)
                queue.add(temp.left);
            if(temp.right!=null)
                queue.add(temp.right);
        }
        Collections.sort(list);
        double diff=Math.abs(list.get(1)-list.get(0));
        for(int i=2;i<list.size();i++)
        {
            diff=Math.min(diff, Math.abs(list.get(i)-list.get(i-1)));
        }
        return (int)diff;
    }

    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(1);
        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(2);
        root.right=n1;
        n1.left = n2;
        System.out.println(getMinimumDifference(root));
    }
}
