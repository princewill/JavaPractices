package com.cake.interview;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaxStack {

    Deque<Integer> stack = new ArrayDeque<>();
    Deque<Integer> maxStack = new ArrayDeque<>();

    void push(int item) {
        stack.push(item);

        if(maxStack.isEmpty() || maxStack.peek() <= item){
            maxStack.push(item);
        }
    }

    int pop() {
       int item = stack.pop();
        if(maxStack != null && item == maxStack.peek()){
            maxStack.pop();
        }
        return item;
    }

    int getMax(){
        return maxStack.peek();
    }
}
