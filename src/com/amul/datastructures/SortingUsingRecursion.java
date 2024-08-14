package com.amul.datastructures;

import java.util.Arrays;

public class SortingUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 0, 4, -5, 9};

//        bubbleSort(arr, arr.length - 1, 0);
        selectionSort(arr, arr.length - 1, 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr, int r, int c) {
        if (r == 0)
            return;

        if (c < r) {
            if (arr[c] > arr[c + 1])
                swap(arr, c, c + 1);

            bubbleSort(arr, r, c + 1);
        } else {
            bubbleSort(arr, r - 1, 0);
        }
    }

    private static void selectionSort(int[] arr, int r, int c, int max) {
        if (r == 0)
            return;

        if (c <= r) {
            if (arr[c] > arr[max])
                selectionSort(arr, r, c + 1, c);
            else
                selectionSort(arr, r, c + 1, max);
        } else {
            if (max != r)
                swap(arr, max, r);

            selectionSort(arr, r - 1, 1, 0);
        }
    }

    private static void swap(int[] arr, int l, int r) {
        arr[l] = arr[l] + arr[r];
        arr[r] = arr[l] - arr[r];
        arr[l] = arr[l] - arr[r];
    }
}
