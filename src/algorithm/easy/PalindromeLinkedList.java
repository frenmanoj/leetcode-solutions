package algorithm.easy;

/**
 * Palindrome Linked List
 * 
 * Given a singly linked list, determine if it is a palindrome.
 * 
 * @author frenmanoj
 *
 */
public class PalindromeLinkedList {

	public boolean isPalindrome(ListNode head) {

		ListNode reverseListHead = null;

		ListNode forwardListHead = head;
		while (forwardListHead != null) {

			int value = forwardListHead.val;

			ListNode tempNode = new ListNode(value);
			tempNode.next = reverseListHead;

			reverseListHead = tempNode;
			forwardListHead = forwardListHead.next;
		}

		forwardListHead = head;
		while (reverseListHead != null) {

			if (forwardListHead.val != reverseListHead.val) {
				return false;
			}

			forwardListHead = forwardListHead.next;
			reverseListHead = reverseListHead.next;
		}

		return true;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
