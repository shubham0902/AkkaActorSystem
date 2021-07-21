package com.shubham;

import java.util.Arrays;

public class Quicksort {

    static void quicksort(int[] arr, int l, int h){
        if(l>=h) return;
        int pivot = quick(arr, l, h);
        System.out.println(pivot);
        quicksort(arr, l, pivot-1);
        quicksort(arr, pivot+1, h);
    }

    private static int quick(int[] arr, int l, int h) {
        int p = arr[l];
        int i = l, j = h;
        while(i<j) {
            while(arr[i]<=p && i<h-1){
                ++i;
            }
            while(arr[j]>=p && j>l){
                --j;
            }
            if(i<j){
                int a = arr[i];
                arr[i] = arr[j];
                arr[j] = a;
            }
        }

            int a = arr[l];
            arr[l] = arr[j];
            arr[j] = a;
        return j;
    }


    public static void main(String[] args) {
        int[] a = new int[]{9,5,3,7,8,4};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        quicksort(a, 0, a.length-1);
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }

}
