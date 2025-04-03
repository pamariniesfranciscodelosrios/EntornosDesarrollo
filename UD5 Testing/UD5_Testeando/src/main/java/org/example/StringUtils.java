package org.example;

public class StringUtils {
    public static String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }

    public static int countChars(String input) {
        return (input != null) ? input.length() : 0;
    }
}