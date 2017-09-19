import java.util.*;

public class LeetCode572 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null && t==null)
            return true;
        if(s==null||t==null)
            return false;
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(s);
        while(!queue.isEmpty())
        {
            TreeNode temp = queue.poll();
            if(temp.val==t.val)
            {
                if(isSameTree(temp,t))
                    return true;
            }
            if(temp.left!=null)
                queue.add(temp.left);
            if(temp.right!=null)
                queue.add(temp.right);
        }
        return false;
    }

    public boolean isSameTree(TreeNode orig, TreeNode target)
    {
        if(orig==null && target==null)
            return true;
        if(orig==null||target==null)
            return false;
        if(orig.val==target.val)
        {
            return isSameTree(orig.left,target.left) && isSameTree(orig.right,target.right);
        }
        else
            return false;
    }

    public static void main(String[] str)
    {
        //TreeNode root1 = new TreeNode(3);
        //TreeNode n1 = new TreeNode()
    }
}
