package com.vishal.Datastructures;

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
            }
        } else {
            if (root.right != null)
                AddNode(root.right, node);
            else {
                root.right = node;
            }
        }
    }
    public void Preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data);
        Preorder(root.left);
        Preorder(root.right);
    }
    public Boolean IsBalanced(Node root) {
        if (root == null)
            return false;
        else {
            return Math.abs(HeightOfSubTree(root.left) - HeightOfSubTree(root.right)) > 1 ? false : true;
        }
    }
    public int HeightOfSubTree(Node root) {
        if (root == null) {
            return 0;
        } else {
            int lDepth = HeightOfSubTree(root.left) + 1;
            int rDept = HeightOfSubTree(root.right) + 1;
            return lDepth > rDept ? lDepth : rDept;

        }
    }
}
