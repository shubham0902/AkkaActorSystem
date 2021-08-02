package com.shubham;

public class Knapsack {

    public static void main(String[] args) {

        int[] v = new int[]{60, 100, 120};
        int[] w = new int[]{10, 20, 30};
        int W = 50;

        int res = knapsack(v, w, W, w.length);
        System.out.println("res = " + res);
    }

    private static int knapsack(int[] v, int[] w, int W, int length) {
        if (W <= 0 || length <= 0) {
            return 0;
        }

        if (w[length - 1] <= W) {
            return Math.max(knapsack(v, w, W, length - 1), v[length - 1] + knapsack(v, w, W - w[length - 1], length - 1));
        } else {
            return knapsack(v, w, W, length - 1);
        }

    }
}
