package com.amul.datastructures;

import java.util.Arrays;

public class BubbleSort {
    static void swap(int[] arr, int l, int r) {
        arr[l] = arr[l] + arr[r];
        arr[r] = arr[l] - arr[r];
        arr[l] = arr[l] - arr[r];
    }

    static void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    isSwapped = true;
                }
            }

            if (!isSwapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
