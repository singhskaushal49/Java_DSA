package LeetCode_solution;

import java.util.Arrays;

public class Minimum_Path_Sum {

	class Solution {
		public int minPathSum(int[][] grid) {
			int[][] dp = new int[grid.length][grid[0].length];

			// Initialize the dp array with -1
			for (int i = 0; i < dp.length; i++) {
				Arrays.fill(dp[i], -1);
			}

			return pathsum(grid, 0, 0, dp);
		}

		public static int pathsum(int[][] maze, int cc, int cr, int[][] dp) {
			if (cc == maze[0].length - 1 && cr == maze.length - 1) {
				return maze[cr][cc];
			}
			if (cc >= maze[0].length || cr >= maze.length) {
				return Integer.MAX_VALUE;
			}
			if (dp[cr][cc] != -1) {
				return dp[cr][cc];
			}

			int v = pathsum(maze, cc, cr + 1, dp);
			int h = pathsum(maze, cc + 1, cr, dp);
			return dp[cr][cc] = maze[cr][cc] + Math.min(v, h);

		}
	}
}

//https://leetcode.com/problems/minimum-path-sum/description/
