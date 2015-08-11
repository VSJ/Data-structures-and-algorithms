package com.vishal.Datastructures;

/**
 * Created by Vishal Jadhav on 4/22/15.
 * The class for representing a stack.
 */
public class Stack {

    private String[] items;
    private static int SIZE;
    private int currentIndex = 0;

    public Stack(int size) {
        SIZE = size;
        items = new String[size];
    }

    public void push(String data) {
        if (currentIndex >= SIZE) {
            System.out.println("The stack is full!!");
        }
        else {
            items[currentIndex] = data;
            currentIndex++;
        }
    }
    public void pop() {
        if (currentIndex == 0) {
            // Throw exception
            System.out.println("The stack is empty!!");
        }
        else {
            currentIndex--;
            System.out.println("Popped element:" + items[currentIndex]);
        }
    }
    public void display() {
        System.out.println("__");
        for (int i=currentIndex-1; i>=0; i--) {
            System.out.println("|" + items[i] + "|");
            System.out.println("___");
        }
    }
    /* Write a program to sort a stack in ascending order (with biggest items on top).
    You may use at most one additional stack to hold items, but you may not copy the elements into
    any other data structure (such as an array).
    The stack supports the following operations: push, pop, peek, and isEmpty.
    Algo -
    1. Store the stack in sorted order on the other stack
    2. 5 2 -- 2,5 -- 3
  */

}
