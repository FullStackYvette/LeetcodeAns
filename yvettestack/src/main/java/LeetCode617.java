public class LeetCode617 {
    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null)
            return t2;
        if(t2==null)
            return t1;
        t1.val+=t2.val;
        t1.left=mergeTrees(t1.left,t2.left);
        t1.right=mergeTrees(t1.right,t2.right);
        return t1;
    }

    public static void main(String[] args)
    {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(2);
        TreeNode n4 = new TreeNode(5);

        n1.left=n2;
        n1.right=n3;
        n2.left=n4;

        TreeNode n5 = new TreeNode(2);
        TreeNode n6 = new TreeNode(1);
        TreeNode n7 = new TreeNode(3);
        TreeNode n8 = new TreeNode(7);
        TreeNode n9 = new TreeNode(4);

        n5.left = n6;
        n5.right = n7;
        n6.right = n9;
        n7.right = n8;

        TreeNode n10 = new TreeNode(3);
        TreeNode n11= new TreeNode(4);
        TreeNode n12 = new TreeNode(5);
        n10.left = n11;
        n10.right = n12;
        TreeNode n13 = new TreeNode(5);
        TreeNode n14 = new TreeNode(4);
        n11.left=n13;
        n11.right=n14;
        TreeNode n15 = new TreeNode(7);
        n12.right=n15;

        System.out.println(LeetCode100.isSameTree(mergeTrees(n1,n5),n10));
    }
}
//https://leetcode.com/problems/merge-two-binary-trees/description/
//Time Complexity O(m)+O(n)
