package com.vishal;

import com.vishal.Datastructures.*;
import com.vishal.sortingalgorithms.Sorting;

public class Main {

    public static void main(String[] args) {
//        BinarySearchTree tree = new BinarySearchTree(5);
//        tree.AddNode(6);
//        tree.AddNode(2);
//        tree.AddNode(3);
//        tree.AddNode(1);
//        tree.AddNode(7);
//        tree.AddNode(9);
//        //tree.AddNode(10);
//        tree.Preorder(tree.root);
//        System.out.print(tree.IsBalanced(tree.root));
        int[] arr = {1, 2, 21, 16, 2, 3, 12};
        //Sorting.QuickSort(arr,0,arr.length-1);
        Sorting.MergeSort(arr, 0, arr.length - 1);
//        int[] arr1 = {0,1,2,1,2,1,1,1,0,1,2,1,1,0,0,0};
//        DutchNationalFlag(arr1);
//        MiscString.isAnagram("abc", "cba");
//        MiscString.isAnagram("abc", "aba");
//        MiscString.isAnagram("abc", "aaaa");
//        MiscString.isAnagram("abc", "cab");
//        MiscString.isAnagram("abc", "a");
//        MiscString.countCharsForAnagram("fcrxzwscanmligyxyvym","jxwtrhvujlmrpdoqbisbwhmgpmeoke");
//        MiscString.countCharsForAnagram("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa","bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
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
