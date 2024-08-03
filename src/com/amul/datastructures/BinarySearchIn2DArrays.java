package com.amul.datastructures;

import java.util.Arrays;

public class BinarySearchIn2DArrays {
    static int[] binarySearchIn2D(int[][] arr, int target) {
        int r = 0;
        int c = arr.length - 1;

        while (r < arr.length && c >= 0) {
            if (arr[r][c] == target) return new int[]{r, c};

            if (arr[r][c] > target) c--;
            else r++;
        }

        return new int[]{-1, -1};
    }

    static int[] binarySearch(int[][] arr, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;

            if (arr[row][mid] == target) return new int[]{row, mid};

            if (arr[row][mid] > target) cEnd = mid - 1;
            else cStart = mid + 1;
        }

        return new int[]{-1, -1};
    }

    static int[] searchSortedMatrix(int [][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length;

        if (rows == 1) return binarySearch(arr, 0, 0, cols, target);

        int rStart = 0;
        int rEnd = rows - 1;

        int cMid = cols / 2;
        while (rStart != rEnd - 1) {
            int mid = rStart + (rEnd - rStart) / 2;

            if (arr[mid][cMid] == target) return new int[]{mid, cMid};

            if (arr[mid][cMid] < target) rStart = mid;
            else rEnd = mid;
        }

        if (target <= arr[rStart][cols - 1]) return binarySearch(arr, rStart, 0, cols - 1, target);

        return binarySearch(arr, rEnd, 0, cols - 1, target);
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        int[][] sortedMatrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

//        int[] ans1 = binarySearchIn2D(matrix, 38);
//        System.out.println(Arrays.toString(ans1));

        int[] ans2 = searchSortedMatrix(sortedMatrix, 0);
        System.out.println(Arrays.toString(ans2));

    }
}
