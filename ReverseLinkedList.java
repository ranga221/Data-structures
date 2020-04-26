package recursion;

import java.util.LinkedList;

public class ReverseLinkedList {

	
	
	
	public ListNode reverseLinkedList(ListNode head)
	{
		if(head == null || head.next == null)
		{
			return head;
		}
		
		ListNode p = reverseLinkedList(head.next);
		
		head.next.next = head;
		head.next = null;
		return p;
				
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
         
	}

}
