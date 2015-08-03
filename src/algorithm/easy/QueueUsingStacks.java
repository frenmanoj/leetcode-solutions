package algorithm.easy;

import java.util.Stack;

/**
 * Implement Queue using Stacks 
 * 
 * Implement the following operations of a queue using stacks.

 * push(x) -- Push element x to the back of queue.
 * pop() -- Removes the element from in front of queue.
 * peek() -- Get the front element.
 * empty() -- Return whether the queue is empty.
 * 
 * Notes:
 * You must use only standard operations of a stack -- which means only push to top, peek/pop from top, size, and is empty operations are valid.
 * Depending on your language, stack may not be supported natively. 
 * You may simulate a stack by using a list or deque (double-ended queue), as long as you use only standard operations of a stack.
 * You may assume that all operations are valid (for example, no pop or peek operations will be called on an empty queue).
 * 
 * @author frenmanoj
 *
 */
public class QueueUsingStacks {

	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	// Push element x to the back of queue.
	public void push(int x) {

		if (stack1.empty() && !stack2.empty()) {

			while (!stack2.empty()) {

				stack1.push(stack2.pop());
			}
		}

		stack1.push(x);
	}

	// Removes the element from in front of queue.
	public void pop() {

		if (stack2.empty() && !stack1.empty()) {

			while (!stack1.empty()) {

				stack2.push(stack1.pop());
			}
		}

		stack2.pop();
	}

	// Get the front element.
	public int peek() {

		if (stack2.empty() && !stack1.empty()) {

			while (!stack1.empty()) {

				stack2.push(stack1.pop());
			}
		}

		return stack2.peek();
	}

	// Return whether the queue is empty.
	public boolean empty() {

		return stack1.empty() && stack2.empty();
	}
}
