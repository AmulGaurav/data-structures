package StackQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception, StackException {
        // Stack<Integer> stack = new Stack<>();
        // stack.push(67);
        // stack.push(2);
        // stack.push(5);
        // stack.push(7);
        // stack.push(367);

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        // Queue<Integer> queue = new LinkedList<>();
        // queue.add(8);
        // queue.add(48);

        // System.out.println(queue.remove());
        // System.out.println(queue.remove());

        // Deque<Integer> deque = new ArrayDeque<>();

        // Custom Stack Implementation
        // DynamicStack stack = new DynamicStack(2);
        // System.out.println(stack.push(4));
        // System.out.println(stack.push(7));
        // System.out.println(stack.push(90));

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        CustomQueue queue = new CustomQueue(5);
        queue.add(3);
        queue.add(5);
        queue.add(25);
        queue.add(54);
        queue.add(78);

        queue.display();

        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();

        queue.display();
    }
}
