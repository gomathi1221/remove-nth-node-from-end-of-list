 class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }

        // Initialize two pointers
        ListNode fast = head;
        ListNode slow = head;

        // Move fast pointer n steps ahead
        for (int i = 0; i < n; i++) {
            
            fast = fast.next;
        }

        // If fast is null, it means n is exactly the length of the list,
        // so we need to remove the head node
        if (fast == null) {
            return head.next;
        }

        // Move both pointers until fast reaches the end
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the nth node from end
        slow.next = slow.next.next;
        return head;
    }

    
}
    
