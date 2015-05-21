package com.vishal.datastructures;

/**
 * Created by vj028567 on 5/21/15.
 */
public class BinarySearchTree {
    public Node root;
    public BinarySearchTree(int root) {
        this.root = new Node(root,null,null);
    }
    public class Node {
        Node left;
        Node right;
        int data;
        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

    }
    public void AddNode(int data){
        if (root == null) {
            root = new Node(data, null, null);
        } else {
            AddNode(root, new Node(data, null, null));
        }
    }
    public void AddNode(Node root, Node node) {
        if (node.data < root.data) { // traverse left subtree
            if (root.left != null)
                AddNode(root.left, node);
            else {
                root.left = node;
                return;
            }
        } else {
            if (root.right != null)
                AddNode(root.right, node);
            else {
                root.right = node;
                return;
            }
        }
    }
    public void Preoder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data);
        Preoder(root.left);
        Preoder(root.right);
    }
}
