import java.util.*;

public class LeetCode671 {
    public static int findSecondMinimumValue(TreeNode root) {
        //No empty tree
        Stack<TreeNode> sta = new Stack<TreeNode>();
        int minVal=-1;
        int secondVal=-1;
        sta.push(root);
        while(!sta.isEmpty())
        {
            TreeNode temp = sta.pop();
            int val=Integer.MAX_VALUE;
            if(temp.left==null && temp.right==null)
                val=temp.val;//if there are no children, take its own value
            if(temp.left!=null && temp.right!=null)
            {
                val = Math.min(temp.left.val,temp.right.val);
                sta.push(temp.left);
                sta.push(temp.right);
            }
            if(minVal==-1)
                minVal=val;
            else if(minVal>val)
            {
                minVal=val;
                secondVal=minVal;
            }
            else if(minVal==val||secondVal==val)
                continue; //It did not count the duplicate value
            else
            {
                if(secondVal==-1)
                    secondVal=val;
                else
                    secondVal=Math.min(val,secondVal);
            }

        }
        return secondVal;
    }

    public static void main(String[] args)
    {
        TreeNode root1 = new TreeNode(2);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(5);
        TreeNode n3 = new TreeNode(5);
        TreeNode n4 = new TreeNode(7);
        root1.left = n1;
        root1.right = n2;
        n2.left = n3;
        n2.right = n4;

        TreeNode root2 = new TreeNode(2);
        TreeNode n5= new TreeNode(2);
        TreeNode n6 = new TreeNode(2);
        root2.left = n5;
        root2.right = n6;

        System.out.println(findSecondMinimumValue(root1));//5
        System.out.println(findSecondMinimumValue(root2));//-1
    }
}

//https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/description/
//Time complexity is O(n)


