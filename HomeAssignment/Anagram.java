package week3.HomeAssignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// Declare two strings
        String text1 = "stops";
        String text2 = "potss";

        // a) Check if lengths of the strings are the same
        if (text1.length() == text2.length()) {
            // b) Convert both strings into character arrays
            char[] charArray1 = text1.toCharArray();
            char[] charArray2 = text2.toCharArray();

            // c) Sort both arrays
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // d) Check if both arrays have the same values
            if (Arrays.equals(charArray1, charArray2)) {
                System.out.println("The strings are anagrams.");
            } else {
                System.out.println("The strings are not anagrams.");
            }
        } else {
            System.out.println("The strings are not anagrams (different lengths).");
        }
    }
}
