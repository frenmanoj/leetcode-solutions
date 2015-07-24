package algorithm.medium;

/**
 *  Search a 2D Matrix II
 *  
 *	Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
 *	
 *	Integers in each row are sorted in ascending from left to right.
 *	Integers in each column are sorted in ascending from top to bottom.
 *	For example,
 *	
 *	Consider the following matrix:
 *	
 *	[
 *	  [1,   4,  7, 11, 15],
 *	  [2,   5,  8, 12, 19],
 *	  [3,   6,  9, 16, 22],
 *	  [10, 13, 14, 17, 24],
 *	  [18, 21, 23, 26, 30]
 *	]
 *	
 *  Given target = 5, return true.
 *	
 *	Given target = 20, return false.
 */

public class Search2DMatrix {

	public boolean searchMatrix(int[][] matrix, int target) {

		int maxRow = matrix.length - 1;
		int maxColumn = matrix[0].length - 1;

		if (target < matrix[0][0]) {
			return false;
		}

		if (target > matrix[maxRow][maxColumn]) {
			return false;
		}

		int row = 0;
		int column = maxColumn;

		while (row <= maxRow && column >= 0) {

			if (target == matrix[row][column]) {
				return true;
			}

			if (target < matrix[row][column]) {
				column--;
			} else {
				row++;
			}
		}

		return false;
	}

	public static void main(String[] args) {

		int[][] matrix = { 
				{ 1, 4, 7, 11, 15 }, 
				{ 2, 5, 8, 12, 19 },
				{ 3, 6, 9, 16, 22 }, 
				{ 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } };

		int target = 20;

		Search2DMatrix obj = new Search2DMatrix();

		boolean searchResult = obj.searchMatrix(matrix, target);

		System.out.println(searchResult);
	}
}
