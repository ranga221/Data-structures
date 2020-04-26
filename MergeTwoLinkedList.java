package recursion;

public class MergeTwoLinkedList {
	

public ListNode mergeTwoLists(ListNode l1, ListNode l2)
{
	if(l1 == null) return l2;
	if(l2 == null) return l1;
	
	
	ListNode head = new ListNode(0);
	ListNode curr = head;
	
	while(l1 != null && l1 !=null)
	{
		if(l1.val <l2.val )
		{
			curr.next = l1;
			l1 = l1.next;
		}
		else
		{
			curr.next = l2;
			l2 = l2.next;
		}
		
		curr = curr.next;
	}
	
	if(l1 != null)
	{
		curr.next = l1;
		l1 = l1.next;
	}
	
	if(l2 != null)
	{
		curr.next = l2;
		l2 = l2.next;
	}
	
	if(head != null)
	{
		head = head.next;
	}
	return head;
}
	

	
	
}