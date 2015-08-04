package algorithm.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Contains Duplicate 
 * 
 * Given an array of integers, find if the array contains any duplicates. 
 * Your function should return true if any value appears at least twice in the array, 
 * and it should return false if every element is distinct.
 * 
 * @author frenmanoj
 *
 */

public class ContainsDuplicate {

	public boolean containsDuplicate(int[] nums) {

		Set<Integer> list = new HashSet<Integer>();

		for (int n : nums) {

			int beforeSize = list.size();

			list.add(n);

			int afterSize = list.size();

			if (beforeSize == afterSize) {
				return true;
			}
		}

		return false;
	}
}
