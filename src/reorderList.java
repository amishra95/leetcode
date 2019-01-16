class Solution {
    public void reorderList(ListNode head) {
        if (head == null)
            return;
        ListNode mid = findMid(head);
        ListNode l2 = reverse(mid.next);
        mid.next = null;
        head = merge(head, l2);
    }
    
    ListNode findMid(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    // A->B (-->C) D->C
    ListNode reverse(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    
    ListNode merge(ListNode l1, ListNode l2) {
        ListNode head = l1;
        while (l2 != null) {
            //prev = l1;
            ListNode next1 = l1.next;
            ListNode next2 = l2.next;
            l1.next = l2;
            l2.next = next1;
            l1 = next1;
            l2 = next2;
        }
        /*I 've coded for another case:  a->b->c
                                         d->e->f->g
          however, this would not happend in this case, l1 is always longer than l2
          
        */
        
        return head;
        
    }
}
