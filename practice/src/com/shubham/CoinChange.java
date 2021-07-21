package com.shubham;

import java.util.HashMap;

public class CoinChange {

    static HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        int total = 3;
        int[] arr = new int[]{1, 2, 3};
        int res = cc(arr, total);
        System.out.println(res);
    }

    private static int cc(int[] arr, int total) {
        if (total < 0) return 0;
        if (total == 0) {
            map.put(0, 1);
            return 1;
        }
        if(map.containsKey(total)){
            return map.get(total);
        }
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            int coin = arr[i];
            int value = total - coin;
            res = res + map.getOrDefault(value, cc(arr, value));
        }

        System.out.println(""+total+": "+ res);
        map.put(total, res);
        return res;
    }

}
