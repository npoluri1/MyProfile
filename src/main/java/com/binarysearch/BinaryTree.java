package com.binarysearch;

class Node {

    int data;
    Node right;
    Node left;

    public Node(int data) {
        this.data = data;
    }
}

public class BinaryTree {

    Node root;

    public void insert(int data) {
        root = insertRecrusion(root, data);

    }

    public Node insertRecrusion(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else if (data < root.data) {
            root.left = insertRecrusion(root.left, data);
        } else if (data > root.data) {
            root.right = insertRecrusion(root.right, data);
        }
        return root;
    }

    public void inOrder() {
        inOrderRec(root);
    }

    public void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.println(root.data + " ");
            inOrderRec(root.right);
        }
    }

    public void preOrder() {
        preOrderRec(root);
    }

    public void preOrderRec(Node root) {
        if (root != null) {
            System.out.println(root.data + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    public void postOrder() {
        postOrderRec(root);
    }

    public void postOrderRec(Node root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.println(root.data + " ");
        }
    }
}
