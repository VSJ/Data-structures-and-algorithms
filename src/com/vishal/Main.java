package com.vishal;

import com.vishal.datastructures.LinkedList;
import com.vishal.datastructures.Stack;
import sun.awt.image.ImageWatched;

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
        newStack.push("BB");
        newStack.push("CCC");
        newStack.push("DD");
        newStack.push("DA");
        newStack.push("DA");
        newStack.display();
        LinkedList list = new LinkedList();
        list.AddNode('1');
        list.AddNode('2');
        list.AddNode('3');
        list.AddNode('4');
        list.AddNode('5');
        list.AddNode('6');
        list.AddNode('7');
        list.Display();
        list.RemoveNode(7);
        list.Display();
        list.RemoveNode(5);
        list.Display();
        list.RemoveNode(9);
        list.Display();
        list.RemoveNode(2);
        list.Display();
        list.RemoveNode(3);
        list.Display();

    }
}
