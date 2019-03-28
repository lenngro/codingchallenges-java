package com.lenngro;

// Java program to convert binary tree to double linked list

class BinaryTree
{
    Node root;

    Node bintree2listUtil(Node node)
    {
        if (node == null)
            return node;

        if (node.left != null){

            /**
             * If there is a left subtree:
             * Recursively traverse it and connect the nodes.
             */
            Node left = bintree2listUtil(node.left);

            for (; left.right != null; left = left.right);

            /**
             * Connect the nodes according to a double linked list.
             */
            left.right = node;
            node.left = left;
        }

        if (node.right != null){

            /**
             * Same for the right subtree.
             */
            Node right = bintree2listUtil(node.right);

            for (; right.left != null; right = right.left);

            right.left = node;
            node.right = right;
        }

        return node;
    }

    Node bintree2list(Node node)
    {
        if (node == null)
            return node;

        node = bintree2listUtil(node);

        while (node.left != null)
            node = node.left;

        return node;
    }

    /* Function to print nodes in a given doubly linked list */
    void printList(Node node)
    {
        while (node != null)
        {
            System.out.print(node.data + " ");
            node = node.right;
        }
    }

    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(10);
        tree.root.left = new Node(12);
        tree.root.right = new Node(15);
        tree.root.left.left = new Node(25);
        tree.root.left.right = new Node(30);
        tree.root.right.left = new Node(36);

        Node head = tree.bintree2list(tree.root);
        tree.printList(head);

    }
}
