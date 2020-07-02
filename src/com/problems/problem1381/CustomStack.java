package com.problems.problem1381;

import java.util.ArrayList;
import java.util.List;

public class CustomStack {
    final List<Integer> cStack;
    final int maxSize;

    public CustomStack(int maxSize) {
        cStack = new ArrayList<>(maxSize);
        this.maxSize = maxSize;
    }

    public void push(int x) {
        if (cStack.size() != maxSize) {
            cStack.add(0, x);
        }
    }

    public int pop() {
        if (cStack.isEmpty()) {
            return -1;
        } else {
            return cStack.remove(0);
        }
    }

    public void increment(int k, int val) {
        int size = cStack.size();
        if (k > size) {
            k = size;
        }
        int curr;

        for (int i = (size - k); i < size; i++) {
            curr = cStack.remove(i);
            curr += val;
            cStack.add(i, curr);
        }
    }
}
