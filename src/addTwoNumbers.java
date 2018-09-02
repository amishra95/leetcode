/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {   
       ListNode l3 = new ListNode(0);
        ListNode head = l3;
        int carry = 0;
        
    while(l1 != null || l2 != null){
        if(l1 != null){
            carry += l1.val;
            l1 = l1.next;
        }
        if(l2 != null){
            carry += l2.val;
            l2 = l2.next;
        }
        l3.next = new ListNode(carry % 10);
        l3 = l3.next;
        carry = carry/10;
    }
        if(carry != 0){
            l3.next = new ListNode(carry);
        }
        return head.next;
    }
}