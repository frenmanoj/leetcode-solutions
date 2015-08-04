package algorithm.easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Implement the following operations of a stack using queues.
 * 
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * empty() -- Return whether the stack is empty.
 * 
 * Notes:
 * 
 * You must use only standard operations of a queue -- 
 * 		which means only push to back, peek/pop from front, size, and is empty operations are valid.
 * Depending on your language, queue may not be supported natively. 
 * You may simulate a queue by using a list or deque (double-ended queue), as long as you use only standard operations of a queue.
 * You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).
 * 
 * @author frenmanoj
 *
 */
public class StackUsingQueues {

	Queue<Integer> queue1 = new LinkedList<Integer>();
	Queue<Integer> queue2 = new LinkedList<Integer>();

	// Push element x to the back of queue.
	public void push(int x) {

		if (!queue1.isEmpty()) {

			queue1.add(x);
		} else {

			queue2.add(x);
		}
	}

	// Removes the element from in front of queue.
	public void pop() {

		if (!queue1.isEmpty()) {

			while (queue1.size() > 1) {

				queue2.add(queue1.remove());
			}

			queue1.remove();
		} else {

			while (queue2.size() > 1) {

				queue1.add(queue2.remove());
			}

			queue2.remove();

		}
	}

	// Get the top element.
	public int top() {

		if (!queue1.isEmpty()) {

			int x = -1;
			while (!queue1.isEmpty()) {

				x = queue1.remove();
				queue2.add(x);
			}

			return x;

		} else {

			int x = -1;
			while (!queue2.isEmpty()) {

				x = queue2.remove();
				queue1.add(x);
			}

			return x;

		}
	}

	// Return whether the queue is empty.
	public boolean empty() {

		return queue1.isEmpty() && queue2.isEmpty();
	}
}
