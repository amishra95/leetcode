
public class deleteNodeOfaVal {
		public ListNode removeElements(ListNode head, int val) {
		        if (null == head) return head;
		        ListNode root = new ListNode(0);
		        root.next = head;
		        ListNode node = root;
		        while (node != null) {
		            if (node.next != null && node.next.val == val) 
		                node.next = node.next.next;
		            else 
		                node = node.next;
		        }
		        return root.next;
		    
		  
		   

		        
		    
		    
		}

}
