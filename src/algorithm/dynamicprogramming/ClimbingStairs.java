package algorithm.dynamicprogramming;

/**
 * Climbing Stairs
 * 
 * You are climbing a stair case. It takes n steps to reach to the top. Each
 * time you can either climb 1 or 2 steps. In how many distinct ways can you
 * climb to the top?
 *
 * @author frenmanoj@gmail.com
 *
 */
public class ClimbingStairs {

	public int climbStairs(int n) {

		if (n <= 2) {
			return n;
		}

		int f1 = 1;
		int f2 = 2;

		int f = 0;

		for (int i = 3; i <= n; i++) {

			f = f1 + f2;

			f1 = f2;
			f2 = f;
		}

		return f;
	}
}
