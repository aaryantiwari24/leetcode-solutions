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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode j=head;
        while(j!=null && j.next!=null){
            if(j.val==j.next.val) j.next=j.next.next;
            else j=j.next;
        }
        return head;
    }
}