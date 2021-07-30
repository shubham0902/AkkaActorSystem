package com.shubham;

public class Knapsack {

    static int[][] memo = new int[102][1002];

    public static void main(String[] args) {

        for (int i = 0; i < 102; i++) {
            for (int j = 0; j < 1002; j++) {
                memo[i][j] = -1;
            }
        }

        int[] w = new int[]{10, 20, 30};
        int[] v = new int[]{60, 100, 120};
        int W = 50;
        int res = ks(w, v, W, w.length);
        System.out.println(res);
    }

    private static int ks(int[] w, int[] v, int W, int length) {
        if (W == 0 || length == 0) {
            return 0;
        }

        if(memo[length][W] != -1){
            return memo[length][W];
        }

        if (w[length - 1] <= W) {
            memo[length][W] = Math.max(ks(w, v, W, length - 1), v[length - 1] + ks(w, v, W - w[length - 1], length - 1));
        } else {
            memo[length][W] = ks(w, v, W, length - 1);
        }
        return memo[length][W];
    }

}
