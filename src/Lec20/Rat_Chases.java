package Lec20;

import java.util.Scanner;

public class Rat_Chases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] maze = new char[n][m];
		int[][] ans = new int[n][m];
		for (int i = 0; i < maze.length; i++) {
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				maze[i][j] = s.charAt(j);
			}
		}
		PathPrint(maze, 0, 0, ans);
		if (val == 0);
	}

	static int val = 0;

	public static void PathPrint(char[][] maze, int cr, int cc, int[][] ans) {
		if (cr < 0 || cc < 0 || cr >= maze.length || cc >= maze[0].length || maze[cr][cc] == 'X') {
			return;
		}
		maze[cr][cc] = 'X';
		ans[cr][cc] = 1;
		if (cr == maze.length - 1 && cc == maze[0].length - 1) {
			Display(ans);
		}
		int r[] = { -1, 0, 1, 0 };
		int c[] = { 0, -1, 0, 1 };
		for (int i = 0; i < c.length; i++) {
			PathPrint(maze,cr + r[i], cc + c[i], ans);
		}
		PathPrint(maze, cr - 1, cc, ans);// up
		PathPrint(maze, cr, cc - 1, ans);// left
		PathPrint(maze, cr + 1, cc, ans);// down
		PathPrint(maze, cr, cc + 1, ans);// right
		maze[cr][cc] = 'O';
		ans[cr][cc] = 0;
	}

	public static void Display(int[][] ans) {
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}

	}

}