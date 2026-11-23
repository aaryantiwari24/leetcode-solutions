
class Solution {
    public ListNode swapPairs(ListNode head) {

        ListNode temp = head;

        if(temp == null || temp.next == null)
            return head;

        ListNode a = new ListNode(-1);
        ListNode b = new ListNode(-1);
        ListNode c = new ListNode(-1);

        ListNode t1 = a;
        ListNode t2 = b;
        ListNode t3 = c;

        int count = 0;

        // Separate odd and even positions
        while(temp != null) {
            count++;

            ListNode next = temp.next;
            temp.next = null;

            if(count % 2 == 0) {
                t2.next = temp;
                t2 = t2.next;
            }
            else {
                t1.next = temp;
                t1 = t1.next;
            }

            temp = next;
        }

        a = a.next;
        b = b.next;

        // Merge even first, then odd
        while(a != null && b != null) {

            t3.next = b;
            t3 = t3.next;
            b = b.next;

            t3.next = a;
            t3 = t3.next;
            a = a.next;
        }

        if(a != null)
            t3.next = a;
        else
            t3.next = b;

        return c.next;
    }
}
