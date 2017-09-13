import java.util.*;

public class LeetCode645 {
    public static List<Double> averageOfLevels(TreeNode root) {
        LinkedList<TreeNode> current = new LinkedList<TreeNode>();
        LinkedList<TreeNode> next = new LinkedList<TreeNode>();
        List<Double> result = new ArrayList<Double>();
        if (root == null)
            return result;
        current.add(root);
        double tempResult = 0;
        int count = 0;
        while (!current.isEmpty()) {
            TreeNode temp = current.remove(0);
            tempResult += temp.val;
            count++;
            if (temp.left != null)
                next.add(temp.left);
            if (temp.right != null)
                next.add(temp.right);
            if (current.isEmpty()) {
                double val = (double) tempResult / count;
                result.add(val);
                tempResult = 0;
                count = 0;
                current = new LinkedList<TreeNode>(next);
                next = new LinkedList<TreeNode>();
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        TreeNode testRoot=new TreeNode(3);
        TreeNode n1=new TreeNode(9);
        TreeNode n2=new TreeNode(20);
        TreeNode n3=new TreeNode(15);
        TreeNode n4=new TreeNode(7);
        testRoot.left =n1;
        testRoot.right=n2;
        n2.left=n3;
        n2.right=n4;

        printArray(averageOfLevels(testRoot));//[3, 14.5, 11]

        TreeNode testRoot2 = null;
        printArray(averageOfLevels(testRoot2));//[]

        TreeNode testRoot3 = new TreeNode(2147483647);
        TreeNode n5 = new TreeNode(2147483647);
        TreeNode n6 = new TreeNode(2147483647);
        testRoot3.left =n5;
        testRoot3.right=n6;

        printArray(averageOfLevels(testRoot3));//[2147483647,2147483647]
    }

    private static void printArray(List<Double> list)
    {
        System.out.print("[");
        for(int i=0;i<list.size()-1;i++)
        {
            System.out.print(list.get(i)+",");
        }
        if(list.size()>=1)
            System.out.print(list.get(list.size()-1));
        System.out.print("]\n");
    }
}
//https://leetcode.com/problems/average-of-levels-in-binary-tree/description/
//Time complexity O(n)