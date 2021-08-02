package com.shubham;

public class KnapsackDP {
    public static void main(String[] args) {

        int[] v = new int[]{60, 100, 120};
        int[] w = new int[]{10, 20, 30};
        int W = 50;

        int res = knapsack(v, w, W, w.length);
        System.out.println("res = " + res);
    }


    private static int knapsack(int[] v, int[] w, int W, int length) {
        int[][] dp = new int[W + 1][length + 1];

        for (int i = 0; i < W + 1; i++) {
            dp[i][0] = 0;
        }

        for (int i = 0; i < length + 1; i++) {
            dp[0][i] = 0;
        }


        for (int i = 1; i < W + 1; i++) {
            for (int j = 1; j < length + 1; j++) {
                if (i >= w[j-1]) {
                    dp[i][j] = Math.max(v[j-1] + dp[i - w[j-1]][j - 1], dp[i][j - 1]);
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }

        return dp[W][length];
    }


}
