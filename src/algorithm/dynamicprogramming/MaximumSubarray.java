package algorithm.dynamicprogramming;

/**
 * Maximum Subarray
 * 
 * Find the contiguous subarray within an array (containing at least one number)
 * which has the largest sum.
 * 
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4], the contiguous subarray
 * [4,-1,2,1] has the largest sum = 6.
 * 
 * @author frenmanoj@gmail.com
 *
 */
public class MaximumSubarray {

	public int maxSubArray(int[] nums) {

		int largest = nums[0];
		int largestSoFar = nums[0];

		for (int i = 1; i < nums.length; i++) {

			largestSoFar = Math.max(largestSoFar + nums[i], nums[i]);

			if (largestSoFar > largest) {
				largest = largestSoFar;
			}
		}

		return largest;
	}

	public static void main(String[] args) {

		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		MaximumSubarray test = new MaximumSubarray();

		System.out.println(test.maxSubArray(nums));
	}
}
