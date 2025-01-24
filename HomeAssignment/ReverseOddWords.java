package week3.HomeAssignment;

public class ReverseOddWords {

	public static void main(String[] args) {
		// Input string
        String test = "I am a software tester";

        // Split the string into words and store in an array
        String[] words = test.split("\\s+");

        // Result string to store the final output
        String result = "";

        // Traverse through each word
        for (int i = 0; i < words.length; i++) {
            if ((i + 1) % 2 == 0) { // Check if the position is even (1-based index)
                // Reverse the even-positioned word
                String reversedWord = "";
                char[] charArray = words[i].toCharArray();
                for (int j = charArray.length - 1; j >= 0; j--) {
                    reversedWord += charArray[j];
                }
                result += reversedWord;
            } else {
                // For odd positions, append the word as it is
                result += words[i];
            }

            // Add a space after each word except the last one
            if (i < words.length - 1) {
                result += " ";
            }
        }

        // Print the final result
        System.out.println(result);
    }
}