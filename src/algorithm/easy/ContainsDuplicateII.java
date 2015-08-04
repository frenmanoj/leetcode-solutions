package algorithm.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Contains Duplicate II 
 * 
 * Given an array of integers and an integer k, find out whether
 * there are two distinct indices i and j in the array such that 
 * nums[i] = nums[j] and the difference between i and j is at most k.
 * 
 * @author frenmanoj
 *
 */

public class ContainsDuplicateII {

	public boolean containsNearbyDuplicate(int[] nums, int k) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {

			if (map.containsKey(nums[i])) {

				int j = map.get(nums[i]);

				if (Math.abs(i - j) <= k) {

					return true;
				}
			}

			map.put(nums[i], i);
		}

		return false;
	}
}
