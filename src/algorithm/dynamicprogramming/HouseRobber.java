package algorithm.dynamicprogramming;

/**
 * House Robber
 * 
 * You are a professional robber planning to rob houses along a street. Each
 * house has a certain amount of money stashed, the only constraint stopping you
 * from robbing each of them is that adjacent houses have security system
 * connected and it will automatically contact the police if two adjacent houses
 * were broken into on the same night.
 * 
 * Given a list of non-negative integers representing the amount of money of
 * each house, determine the maximum amount of money you can rob tonight without
 * alerting the police.
 * 
 * @author frenmanoj@gmail.com
 *
 */
public class HouseRobber {

	public int rob(int[] nums) {

		int secondLastMax = 0;
		int lastMax = 0;

		for (int num : nums) {

			int currentMax = Math.max(secondLastMax + num, lastMax);

			secondLastMax = lastMax;
			lastMax = currentMax;
		}

		return lastMax;
	}
}
