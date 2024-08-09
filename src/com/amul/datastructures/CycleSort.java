package com.amul.datastructures;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cycle(int[] arr) {
        int n = arr.length;

        int i = 0;
        while (i < n - 1) {
            if (arr[i] != arr[arr[i] - 1])
                swap(arr, i, arr[i] - 1);
            else
                i++;
        }
    }

    private static void swap(int[] arr, int l, int r) {
        arr[l] = arr[l] + arr[r];
        arr[r] = arr[l] - arr[r];
        arr[l] = arr[l] - arr[r];
    }
}
