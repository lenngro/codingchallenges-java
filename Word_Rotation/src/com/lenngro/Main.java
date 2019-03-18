package com.lenngro;

public class Main {

    public static boolean rotation(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        for (int i=0; i<word1.length(); i++) {
            if(word1.charAt(i) != word2.charAt(word2.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String word1 = "abbbab";
        String word2 = "babbba";

        System.out.println(rotation(word1, word2));

    }
}
