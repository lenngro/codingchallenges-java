package com.lenngro;

import java.util.ArrayDeque;

public class Main {

    static ArrayDeque<Integer> hits = new ArrayDeque<Integer>();

    public static void hit(int timestmap) {
        hits.add(timestmap);
    }

    public static int getHits(int timestamp) {
        while (!hits.isEmpty() && ((timestamp-hits.getFirst()) >= 300)) {
            hits.pop();
        }
        return hits.size();
    }

    public static void main(String[] args) {
        hit(1);

        // hit at timestamp 2.
        hit(2);

        // hit at timestamp 3.
        hit(3);

        // get hits at timestamp 4, should return 3.
        System.out.println(getHits(4));

        // hit at timestamp 300.
        hit(300);

        // get hits at timestamp 300, should return 4.
        System.out.println(getHits(300));

        // get hits at timestamp 301, should return 3.
        System.out.println(getHits(301));
    }
}
