package com.lenngro.SingleLinkedList;

public class SingleLinkedList {
    /**
     * INSERTION TIME: O(1)
     * DELETION AND SEARCH TIME: O(N)
     */


    private static Node head;
    private static Integer length = 0;

    public static void insert(Integer numberToInsert) {

        if (length == 0) {
            Node node = new Node(numberToInsert);
            head = node;
            length += 1;
        }
        else {
            Node node = new Node(numberToInsert);
            node.next = head;
            head = node;
            length += 1;
        }
    }

    public static Node setNext(Integer numberToDelete, Node node) {

        if (node.value == numberToDelete) {
            length -= 1;
            return node.next;
        }
        if (node.next == null) {
            return node;
        }
        else {
            node.next = setNext(numberToDelete, node.next);
        }

        return node;
    }

    public static Node setNext(Integer indexToDelete, Integer currentIndex, Node node) {

        if (indexToDelete == currentIndex) {
            length -= 1;
            return node.next;
        }
        else if (currentIndex == length) {
            return null;
        }
        else {
            node.next = setNext(indexToDelete, currentIndex+1, node.next);
        }
        return node;
    }

    public static void removeFirstOccurrence(Integer numberToDelete) {

        if (head.value == numberToDelete) {
            length -= 1;
            head = head.next;
        }
        else {
            head.next = setNext(numberToDelete, head.next);
        }
    }

    public static void delete(Integer indexToDelete) {
        if (indexToDelete > length-1) {
            return;
        }
        if (indexToDelete == 0) {
            length -= 1;
            head = head.next;
        }
        else {
            Integer currentIndex = 0;
            head.next = setNext(indexToDelete, currentIndex+1, head.next);
        }
    }

    public static void printNode(Node node) {

        System.out.print(node.value + " ");
        if (node.next != null) {
            printNode(node.next);
        }
    }

    public static void print() {

        printNode(head);
        System.out.println();

    }

    public static void main(String args[]) {

        insert(10);
        insert(5);
        insert(19);
        insert(15);
        insert(17);
        print();
        removeFirstOccurrence(19);
        print();
        delete(length-1);
        print();

    }
}
