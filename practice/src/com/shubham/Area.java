package com.shubham;

public class Area {


    static int area(int[] arr) {
        int size = arr.length;
        int i = 0;
        int j = size - 1;
        int res = 0;
        while (i < j) {
            int area = (j-i) * Math.min(arr[i], arr[j]);
            if (arr[i] < arr[j]) {
                ++i;
            } else {
                --j;
            }
            if (res < area) {
                res = area;
            }
        }

        return res;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1,7,2,8,1,6};

       System.out.println(area(arr));

    }

}
