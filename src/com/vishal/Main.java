package com.vishal;

import com.vishal.datastructures.Stack;

public class Main {

    public static void main(String[] args) {
        Stack newStack = new Stack(5);
        newStack.push("AAA");
        newStack.push("BB");
        newStack.push("CCC");
        newStack.push("DD");
        newStack.push("DA");
        newStack.push("DA");
        newStack.pop();
        newStack.pop();
        newStack.pop();
        newStack.pop();
        newStack.pop();
        newStack.pop();
    }
}
