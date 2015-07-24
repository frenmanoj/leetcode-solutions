package algorithm.medium;

/**
 * 
 * Kth Smallest Element in a BST
 *
 * Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.
 *
 * Note: 
 * You may assume k is always valid, 1 ≤ k ≤ BST's total elements.
 *
 * @author frenmanoj
 *
 */
public class KthSmallestInBST {

	public int kthSmallest(TreeNode root, int k) {

		// plus one for the current root node
		int leftSubtreeCount = getTotalNodesOfSubtree(root.left) + 1;

		if (k == leftSubtreeCount) {
			return root.val;
		} else if (k < leftSubtreeCount) {
			return kthSmallest(root.left, k);
		} else {
			return kthSmallest(root.right, k - leftSubtreeCount);
		}

	}

	private int getTotalNodesOfSubtree(TreeNode node) {

		if (node == null) {
			return 0;
		}

		return 1 + getTotalNodesOfSubtree(node.left) + getTotalNodesOfSubtree(node.right);
	}

	/**
	 * Definition for a binary tree node.
	 */
	class TreeNode {

		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
}
