package com.amul.datastructures;

import java.util.Arrays;

public class SelectionSort {
    static void swap(int[] arr, int l, int r) {
        arr[l] = arr[l] + arr[r];
        arr[r] = arr[l] - arr[r];
        arr[l] = arr[l] - arr[r];
    }

    static void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int last = n - i - 1;
            int max = 0;

            for (int j = 1; j < last; j++) {
                if (arr[max] < arr[j]) max = j;
            }

            swap(arr, max, last);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, -32, 0, 78, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
