package algorithm.medium;

/**
 * Add Two Numbers Total Accepted:
 * 
 * You are given two linked lists representing two non-negative numbers. The
 * digits are stored in reverse order and each of their nodes contain a single
 * digit. Add the two numbers and return it as a linked list.
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
 * 
 * @author frenmanoj
 */

public class AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode firstNode = new ListNode(-1);
		ListNode lastNode = firstNode;

		int sum = 0;
		int carryOver = 0;

		while (l1 != null || l2 != null) {

			sum = carryOver;

			if (l1 != null) {

				sum += l1.val;
				l1 = l1.next;
			}

			if (l2 != null) {

				sum += l2.val;
				l2 = l2.next;
			}

			carryOver = sum / 10;
			lastNode.next = new ListNode(sum % 10);
			lastNode = lastNode.next;

		}

		if (carryOver == 1) {
			lastNode.next = new ListNode(carryOver);
		}

		return firstNode.next;
	}

	public static void main(String[] args) {

		AddTwoNumbers obj = new AddTwoNumbers();

		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(9);
		l2.next = new ListNode(9);

		ListNode result = obj.addTwoNumbers(l1, l2);

		while (result != null) {

			System.out.println(result.val);

			result = result.next;
		}
	}
}

class ListNode {

	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
