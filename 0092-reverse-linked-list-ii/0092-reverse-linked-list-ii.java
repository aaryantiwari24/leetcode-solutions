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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null)return head;
        ListNode temp=head;
        ListNode d=new ListNode(-1);
        ListNode t=d;
        d.next=temp;
        for(int i=0;i<left-1;i++){
            t=t.next;
        }
        ListNode tail1=t;
        ListNode head2=tail1.next;
        t=d;
        for(int i=0;i<right;i++){
            t=t.next;
        }
        ListNode tail2=t;
        ListNode head3=tail2.next;
        tail1.next=null;
        tail2.next=null;
        reverse(head2);
        tail1.next=tail2;
        head2.next=head3;
        return d.next;
        
    }
    void reverse(ListNode h2){
        ListNode p=null;
        ListNode c=h2;
        ListNode f=null;
        while(c!=null){
            f=c.next;
            c.next=p;
            p=c;
            c=f;
        }

    }
}