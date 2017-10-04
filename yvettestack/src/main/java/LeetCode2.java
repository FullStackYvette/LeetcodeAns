public class LeetCode2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode dummy= new ListNode(-1);
        ListNode p = dummy;
        while(l1!=null||l2!=null)
        {
            int val=carry;
            if(l1!=null) {
                val += l1.val;
                l1=l1.next;
            }
            if(l2!=null) {
                val += l2.val;
                l2=l2.next;
            }
            ListNode temp = new ListNode(val%10);
            p.next = temp;
            p=p.next;
            carry=val/10;
        }
        if(carry==1)
            p.next = new ListNode(1);
        return dummy.next;
    }

    public static void main(String[] args)
    {
        ListNode n1= new ListNode(2);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(3);
        n1.next=n2;
        n2.next=n3;

        ListNode n4= new ListNode(5);
        ListNode n5 = new ListNode(6);
        ListNode n6= new ListNode(4);
        n4.next=n5;
        n5.next=n6;

        ListNode n7=null;

        ListNode result = addTwoNumbers(n1,n4);
        printListNode(result);
        System.out.println("\n");

        ListNode result1 = addTwoNumbers(n7,n1);
        printListNode(result1);
        System.out.println("\n");

        ListNode result2 = addTwoNumbers(n1,n7);
        printListNode(result2);

    }

    public static void printListNode(ListNode n)
    {
        while(n!=null) {
            System.out.print(n.val + "|");
            n=n.next;
        }
    }
}
//https://leetcode.com/problems/add-two-numbers/description/
//Time Complexity O(a+b)