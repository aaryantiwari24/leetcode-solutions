/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
            ListNode slow=head;
        ListNode fast=head;
        ListNode temp=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode p=null;
        ListNode c=slow;
        ListNode f=null;
        while(c!=null){
            f=c.next;
            c.next=p;
            p=c;
            c=f;
        }
        int sum=0;
        int max=0;
        while(p!=null){
            sum=temp.val+p.val;
            if(max<sum) max=sum;
            temp=temp.next;
            p=p.next;
        }
        return max;
    }
}