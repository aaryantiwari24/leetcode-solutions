
class Solution {
    public ListNode rotateRight(ListNode head, int r) {

        // Edge cases
        if(head == null || head.next == null || r == 0) {
            return head;
        }

        // Step 1: Find length
        int len = 0;
        ListNode i = head;

        while(i != null) {
            len++;
            i = i.next;
        }

        // Step 2: Calculate effective rotations
        r = r % len;

        if(r == 0) {
            return head;
        }

        // Step 3: Find new tail
        i = head;

        for(int l = 1; l < len - r; l++) {
            i = i.next;
        }

        // Step 4: Find new head
        ListNode newHead = i.next;

        // Step 5: Break the list
        i.next = null;

        // Step 6: Find old tail
        ListNode j = newHead;

        while(j.next != null) {
            j = j.next;
        }

        // Step 7: Connect old tail to old head
        j.next = head;

        return newHead;
    }
}
