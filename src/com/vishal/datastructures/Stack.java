package com.vishal.datastructures;

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
}
