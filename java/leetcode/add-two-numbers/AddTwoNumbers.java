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

public class AddTwoNumbers {
	private static class ListNode {
		int val;
		ListNode next;
		ListNode() {};
		ListNode(int val) {
			this.val = val;
		}
		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	

	public static void traverseLinkedList(ListNode head) {
		ListNode current = head;

		while (current != null) {
			System.out.print(current.val + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode p = l1, q = l2, current = dummyHead;
		int carry = 0;

		while (p != null || q != null) {
			int x = (p != null) ? p.val : 0;
			int y = (q != null) ? q.val : 0;
			int sum = carry + x + y;
			
			carry = sum / 10;
			current.next = new ListNode(sum % 10);
			current = current.next;
			if (p != null) p = p.next;
			if (q != null) q = q.next;
		}
		if (carry > 0)
			current.next = new ListNode(carry);
		return dummyHead.next;
	}
	
	public static void main(String[] args) {
		ListNode node3 = new ListNode(3);
		ListNode node2 = new ListNode(2, node3);
		ListNode node1 = new ListNode(1, node2);
		traverseLinkedList(node1);
		
		ListNode node3_a = new ListNode(1);
		ListNode node2_a = new ListNode(2, node3_a);
		ListNode node1_a = new ListNode(3, node2_a);
		traverseLinkedList(node1_a);

		ListNode res = addTwoNumbers(node1, node1_a);
		traverseLinkedList(res);
	}
}
