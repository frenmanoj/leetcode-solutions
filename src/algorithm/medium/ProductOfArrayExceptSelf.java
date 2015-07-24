package algorithm.medium;

import java.util.Arrays;

/**
 * Product of Array Except Self
 * 
 * Given an array of n integers where n > 1, nums, return an array output such
 * that output[i] is equal to the product of all the elements of nums except
 * nums[i].
 * 
 * Solve it WITHOUT DIVISION and in O(n).
 * 
 * For example, given [1,2,3,4], return [24,12,8,6].
 * 
 * Follow up:
 * 
 * Could you solve it with constant space complexity? (Note: The output array
 * does not count as extra space for the purpose of space complexity analysis.)
 * 
 * @author frenmanoj
 *
 */

public class ProductOfArrayExceptSelf {

	public int[] productExceptSelf(int[] a) {

		int n = a.length;

		// result array
		int[] b = new int[n];

		// first calculate product of left elements for each index

		int left = 1;
		for (int i = 0; i < n; i++) {

			b[i] = left;

			left = left * a[i];
		}

		// now sum those values with the product of right elements for each index
		int right = 1;
		for (int i = n - 1; i >= 0; i--) {

			b[i] = b[i] * right;

			right = right * a[i];
		}

		return b;
	}

	public static void main(String[] args) {

		ProductOfArrayExceptSelf obj = new ProductOfArrayExceptSelf();

		int[] nums = { 1, 2, 3, 4 };

		int[] result = obj.productExceptSelf(nums);

		System.out.println(Arrays.toString(result));
	}
}
