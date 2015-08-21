package algorithm.dynamicprogramming;

/**
 * Best Time to Buy and Sell Stock
 * 
 * Say you have an array for which the ith element is the price of a given stock
 * on day i.
 * 
 * If you were only permitted to complete at most one transaction (ie, buy one
 * and sell one share of the stock), design an algorithm to find the maximum
 * profit.
 * 
 * @author frenmanoj@gmail.com
 *
 */
public class BestTimeToBuyAndSellStock {

	public int maxProfit(int[] prices) {

		if (prices == null || prices.length <= 0) {
			return 0;
		}

		int maxProfit = 0;
		int minPrice = prices[0];

		for (int price : prices) {

			maxProfit = Math.max(maxProfit, price - minPrice);

			if (price < minPrice) {
				minPrice = price;
			}
		}

		return maxProfit;
	}
}
