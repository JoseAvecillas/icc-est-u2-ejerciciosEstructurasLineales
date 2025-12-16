package utils;

import java.util.Stack;

public class StackSorter {
    public void sort(Stack<Integer> stack) {
        Stack<Integer> auxiliar = new Stack<>();
        while (!stack.isEmpty()) {
            int temp = stack.pop();

            while (!auxiliar.isEmpty() && auxiliar.peek() > temp) {
                stack.push(auxiliar.pop());
            }

            auxiliar.push(temp);
        }
        while (!auxiliar.isEmpty()) {
            stack.push(auxiliar.pop());
        }
    }
}