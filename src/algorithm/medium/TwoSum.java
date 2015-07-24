package algorithm.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Two Sum
 * 
 * Given an array of integers, find two numbers such that they add up to a
 * specific target number.
 * 
 * The function twoSum should return indices of the two numbers such that they
 * add up to the target, where index1 must be less than index2. Please note that
 * your returned answers (both index1 and index2) are not zero-based.
 * 
 * You may assume that each input would have exactly one solution.
 * 
 * Input: numbers={2, 7, 11, 15}, target=9 Output: index1=1, index2=2
 * 
 * @author frenmanoj
 *
 */

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {

			int difference = target - nums[i];

			if (map.containsKey(difference)) {

				int index1 = map.get(difference) + 1;
				int index2 = i + 1;

				return new int[] { index1, index2 };
			}

			map.put(nums[i], i);
		}

		return new int[] { -1, -1 };
	}

	public static void main(String[] args) {

		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		TwoSum obj = new TwoSum();

		int[] indices = obj.twoSum(nums, target);

		System.out.println(Arrays.toString(indices));
	}
}
