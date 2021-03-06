public class LeetCode21 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(l1!=null||l2!=null)
        {
            if(l1!=null&&l2!=null)
            {
                if(l1.val<=l2.val)
                {
                    temp.next=l1;
                    l1=l1.next;
                }
                else
                {
                    temp.next= l2;
                    l2=l2.next;
                }
                temp=temp.next;
            }
            else if(l1!=null)
            {
                temp.next=l1;
                break;
            }
            else if(l2!=null)
            {
                temp.next=l2;
                break;
            }
        }
        return dummy.next;
    }
}
//https://leetcode.com/problems/merge-two-sorted-lists/description/
//O(a)+O(b)
