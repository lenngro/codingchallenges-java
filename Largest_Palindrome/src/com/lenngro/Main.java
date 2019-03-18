package com.lenngro;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    private static boolean isPalindrome(int number) {
        int digit = 0;
        int reversedNumber = 0;
        int originalNumber = number;

        while(number > 0){
            digit = number % 10;
            reversedNumber  = reversedNumber  * 10 + digit;
            number = number / 10;
        }

        if (reversedNumber == originalNumber) {
            return true;
        }
        else {
            return false;
        }

    }

    private static int largestPalindrome(int[] numbers) {

        Arrays.sort(numbers);
        int n = numbers.length-1;

        for (int i=n; i>0; i--) {

            if(isPalindrome(numbers[i])) {
                return numbers[i];
            }
        }
        return -1;

    }
    public static void main(String[] args) {
	int[] numbers = new int[] {1, 33, 444, 8888, 456654, 123454322};
	System.out.println(largestPalindrome(numbers));
    }
}
