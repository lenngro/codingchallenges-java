package com.lenngro;


public class Main {

    public static int trap(int[] map) {
        /**
         * Gehe das Array inkrementell durch. Die Menge an Wasser, die für einen
         * Tower gespeichert werden kann, ist die Differenz seiner Höhe und des höchsten
         * Towers links neben ihm ODER des höchsten Towers rechts neben ihm.
         * Daher: Überprüfe für jeden Tower ob gerade die linke oder die rechte Seite den höheren Tower bietet.
         * Falls die linke Seite den höheren Tower bietet, Addiere Differenz zum linken höchsten Tower dazu, ansonsten
         * Differenz zum rechten höchsten Tower.
         */
        int a = 0;
        int b = map.length-1;
        int maxLeft = 0;
        int maxRight = 0;
        int result = 0;
        int iteration = 0;
        while (a <= b) {
            System.out.println("Iteration: " + Integer.toString(iteration));

            maxLeft = Math.max(maxLeft, map[a]);
            maxRight = Math.max(maxRight, map[b]);
            System.out.println("Max Left: " + Integer.toString(maxLeft));
            System.out.println("Max Right: " + Integer.toString(maxRight));
            if (maxLeft <= maxRight) {
                result += maxLeft - map[a];
                a++;
            }
            else {
                result += maxRight - map[b];
                b--;
            }
            System.out.println("Result: " + Integer.toString(result) );
            iteration++;
        }
        return result;
    }

    public static void main(String[] args) {
	// write your code here
        int[] map = new int[] {3,1,4};
        System.out.println(trap(map));
    }
}
