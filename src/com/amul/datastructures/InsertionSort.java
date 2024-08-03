package com.amul.datastructures;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {56, 18, -7};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertion(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) swap(arr, j - 1, j);
                else break;
            }
        }
    }

    private static void swap(int[] arr, int l, int r) {
        arr[l] = arr[l] + arr[r];
        arr[r] = arr[l] - arr[r];
        arr[l] = arr[l] - arr[r];
    }
}
