package com.vishal.datastructures;

/**
 * Created by vishaljadhav on 4/25/15.
 */
class Node {
    public char data;
    Node next;
    public Node(char data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedList {
    Node head;
    public LinkedList() {
        head = null;
    }
    public void AddNode(char data) {
        if (head == null) {
            head = new Node(data);
        }
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
    }
    public void Display() {
        System.out.print("Linked List =>");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }
    public void RemoveNode(int index) {
        Node current = head;
        // remove head
        if (index == 1) {
            Node temp = head;
            head = head.next;
            temp = null;
        }
        else {
            while (index > 1 && current != null) {
                index--;
                // removing last node
                if (index == 1) {
                    if (current.next != null && current.next.next == null) {
                        current.next = null;
                        return;
                    }
                }
                current = current.next;

            }
            if (index == 1) {
                Node temp;
                temp = current.next;
                current.data = temp.data;
                current.next = temp.next;
                temp = null;
            }
        }
    }
}
