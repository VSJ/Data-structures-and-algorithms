package com.vishal;

import com.vishal.datastructures.*;
import sun.awt.image.ImageWatched;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree(5);
        tree.AddNode(6);
        tree.AddNode(2);
        tree.AddNode(3);
        tree.AddNode(1);
        tree.AddNode(7);
        tree.AddNode(9);
        //tree.AddNode(10);
        tree.Preorder(tree.root);
        System.out.print(tree.IsBalanced(tree.root));
        int[] arr = {9, 5, 2, 6, 2, 3, 12};
        Sorting.QuickSort(arr,0,arr.length-1);
        int[] arr1 = {0,1,2,1,2,1,1,1,0,1,2,1,1,0,0,0};
        DutchNationalFlag(arr1);
    }
    public static void DutchNationalFlag(int[] arr) {
        int i = 0, j = 0, n = arr.length-1, temp;
        while (j <= n) {
            if (arr[j] == 0) {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
                j++;
            }
            else if (arr[j] == 2) {
                temp = arr[j];
                arr[j] = arr[n];
                arr[n] = temp;
                n--;
            }
            else
                j++;
        }
        System.out.print("Sorted Array = >");
        for (int k = 0; k<arr.length; k++) {
            System.out.print(" " + arr[k]);
        }
    }
    /*an animal shelter holds only dogs and cats, and operates on a strictly "first in, first out" basis.
    People must adopt either the "oldest" (based on arrival time) of all animals at the shelter,
    or they can select whether they would prefer a dog or a cat (and will receive the oldest animal of that type).
    They cannot select which specific animal they would like. Create the data structures to maintain this system
    and implement opera- tions such as enqueue, dequeueAny, dequeueDog and dequeueCat.
    You may use the built-in L inkedL list data structure.
    Algo --
    AnimalQueue {
      Animal animal

    }

    */
    public static boolean IsLinkedListPalindrome(LinkedList list) {
        if (list.head.next == null) {
            return true;
        }
        Node fast, slow;
        LinkedList newList = new LinkedList();
        Node head = list.head;
        fast = slow = head;
        newList.head = new Node(slow.data);
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            AddToNewList(new Node(slow.data), newList);
            newList.Display();
        }
        if (fast.next == null) { //odd remove first comparison node
            newList.head = newList.head.next;
        }
        slow = slow.next;
        Node newListNode = newList.head;
        while (slow.next != null && newListNode != null) {
            if (slow.data != newListNode.data)
                return false;
            slow = slow.next;
            newListNode = newListNode.next;
        }
        return true;
    }
    static void AddToNewList(Node node, LinkedList list) {
        Node temp;
        temp = list.head;
        list.head = node;
        node.next = temp;
    }
}
