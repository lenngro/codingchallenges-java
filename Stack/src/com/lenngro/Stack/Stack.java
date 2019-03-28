package com.lenngro.Stack;

public class Stack {

    private static Integer[] elements;
    private static int maxSize;
    private static int currentStackHeight;

    private static void create(Integer length) {
        elements = new Integer[length];
        currentStackHeight = length-1;
        maxSize = length;
    }

    private static void push(Integer element) {

        if (currentStackHeight < 0) {
            System.out.println("Stack full. Can't push any more elements.");
        }
        else {
            elements[currentStackHeight] = element;
            currentStackHeight--;
        }

    }

    private static void pop() {
        if (currentStackHeight == maxSize) {
            System.out.println("Stack empty. Can't pop any more elements.");
        }
        else {
            elements[currentStackHeight+1] = null;
            currentStackHeight++;
        }
    }

    private static void print() {
        for (int i = 0; i<maxSize; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {

        create(10);
        for (int i = 0; i<10; i++) {
            push(i);
        }
        print();
        for (int i = 0; i<10; i++) {
            pop();
        }
        print();
    }
}
