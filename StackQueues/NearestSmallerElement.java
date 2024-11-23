package StackQueues;

import java.util.Arrays;
import java.util.Stack;

// Nearest smaller to left or Nearest Smaller Element

public class NearestSmallerElement {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 4 };
        int[] ans = new int[arr.length];

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (stack.empty())
                ans[i] = -1;
            else if (stack.peek() < arr[i])
                ans[i] = stack.peek();
            else {
                while (!stack.empty() && stack.peek() >= arr[i])
                    stack.pop();

                if (stack.empty())
                    ans[i] = -1;
                else
                    ans[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        System.out.println(Arrays.toString(ans));
    }
}