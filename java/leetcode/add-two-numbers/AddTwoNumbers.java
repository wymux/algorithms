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

	}

	public static void traverseLinkedList(ListNode head) {
		ListNode current = head;

		while (current != null) {
			System.out.print(current.val + " ");
			current = current.next;
		}
		System.out.println();
	}


	public static int listToNumber(ListNode head) {
		int number = 0;
		ListNode current = head;
		while (current != null) {
			number = number * 10 + current.val;
			current = current.next;
		}

		return number;
	}
	
	public static ListNode numberToList(int number) {
		ListNode dummyHead = new ListNode(0);
		ListNode current = dummyHead;

		if (number < 0) {
			current.next = new ListNode(-1);
			current = current.next;
			number = -number;
		}

		if (number == 0) {
			current.next = new ListNode(0);
			return dummyHead.next;
		}

		while (number > 0) {
			int digit = number % 10;
			current.next = new ListNode(digit);
			current = current.next;
			number /= 10;
		}
		return dummyHead.next;
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int num1 = listToNumber(l1);
		int num2 = listToNumber(l2);
		int res = num1 + num2;
		ListNode numHead = numberToList(res);
		return numHead;
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

		int num1 = listToNumber(node1);
		int num2 = listToNumber(node1_a);
		int res = num1 + num2;
		System.out.println(num1 + " " + num2 + " Res: " + res);

		ListNode numHead = numberToList(res);
		traverseLinkedList(numHead);

	}
}
