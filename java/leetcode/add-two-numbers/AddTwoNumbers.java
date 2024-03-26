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
		ListNode() {}
		ListNode(int val) {
			this.val = val;
		}
		
		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}

		private static void traveseLinkedList(ListNode head) {
			ListNode current = head;

			while (current != null) {
				System.out.print(current.val + " ");
				current = current.next;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		ListNode node3 = new ListNode(3);
		ListNode node2 = new ListNode(2, node3);
		ListNode node1 = new ListNode(1, node2);
		node3.traverseLinkedList(node1);
		
		ListNode node3_a = new ListNode(3);
		ListNode node2_a = new ListNode(2, node3);
		ListNode node1_a = new ListNode(1, node2);
		node3.traverseLinkedList(node1_a);

	}
}
