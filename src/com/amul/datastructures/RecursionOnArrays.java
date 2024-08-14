package com.amul.datastructures;

import java.util.ArrayList;

public class RecursionOnArrays {
    public static void main(String[] args) {
//        int[] arr = {1, 4, 3,  2, 4, 5};
//        int ans = findIndex(arr, -1, 0);
//        System.out.println(ans);
//
//        System.out.println(findAllIndex(arr, 4, 0, new ArrayList<>()));

        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(binarySearch(arr, 4, 0, arr.length - 1));
    }

    private static int binarySearch(int[] arr, int target, int s, int e) {
        if (s > e)
            return -1;

        int m = s + (e - s) / 2;
        if (arr[m] == target)
            return m;

        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m])
                return binarySearch(arr, target, s, m);
            else
                return binarySearch(arr, target, m + 1, e);
        }

        if (target >= arr[m] && target <= arr[e])
            return binarySearch(arr, target, m, e);

        return binarySearch(arr, target, s, m - 1);
    }

    private static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length)
            return list;

        if (arr[index] == target)
            list.add(index);

        return findAllIndex(arr, target, index + 1, list);
    }

    private static boolean find(int[] arr, int target, int index) {
        if (index == arr.length)
            return false;

        return arr[index] == target || find(arr, target, index + 1 );
    }

    private static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length)
            return -1;

        if (arr[index] == target)
            return index;

        return findIndex(arr, target, index + 1 );
    }

    private static boolean sorted(int[] arr, int index) {
        if (index == arr.length - 1)
            return true;

        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }

    private static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length)
            return list;

        if (arr[index] == target)
            list.add(index);

        ArrayList<Integer> ansFromBelow = findAllIndex2(arr, target, index + 1);
        list.addAll(ansFromBelow);

        return list;
    }
}
