package com.shubham;

public class SUbsetSum {
    public static void main(String[] args) {
        int[] w = new int[]{2, 3, 8, 7, 10};
        int W = 13;

        boolean res = ss(w, W, w.length);
        System.out.println("res = " + res);
    }

    private static boolean ss(int[] w, int W, int length) {
        boolean dp[][] = new boolean[W + 1][length + 1];

        for (int i = 0; i < W + 1; i++) {
            dp[i][0] = false;
        }


        for (int i = 0; i < length + 1; i++) {
            dp[0][i] = true;
        }

        for (int i = 1; i < W + 1; i++) {
            for (int j = 1; j < length + 1; j++) {
                if (i >= w[j - 1]) {
                    dp[i][j] = dp[i][j - 1] || dp[i - w[j - 1]][j - 1];
                } else {
                    dp[i][j] = dp[i][j - 1];
                }

            }
        }

        return dp[W][length];
    }
}
