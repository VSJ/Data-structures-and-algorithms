package com.vishal.datastructures;
// Algorithm -   3 2 3
//  For empty --
    // rear = -1 or front == rear
// For full -
    // rear > SIZE,
/**
 * Created by vishaljadhav on 4/22/15.
 */
public class Queue {
    private static int SIZE;
    private static int front;
    private static int rear;
    String[] elements;

    public Queue(int size) {
        front = 0;
        rear = 0;
        SIZE = size;
    }
    public void Enqueue(String data) {
        if (!isFull()) {
            elements[rear] = data;
            rear++;

        }
        else {
            System.out.println("Queue is full!!");
        }
    }
    public void Dequeue(String data) {
        if (!isEmpty()) {
            System.out.println("Removed element:" + elements[front]);
            front++;

        }
        else {
            System.out.println("Queue is full!!");
        }
    }
    public boolean isFull()
    {
        if ((rear == SIZE && front == 0) || (rear < front && rear == front - 1)) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isEmpty()
    {
        if ((front == rear && front == 0) || (front == rear + 1)) {
            return true;
        }
        else {
            return false;
        }
    }
}
