package week3.HomeAssignment;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		// Step 1: Declare the input string
        String text = "We learn java basics as part of java sessions in java week1";
        System.out.println("The input string is: "+text);
        
        // Step 2: Split the String into an array of words
        String[] words = text.split(" ");
        
        // Step 3: Traverse through each word
        for (int i = 0; i < words.length; i++) {
            // Step 4: Check if the word is a duplicate
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    // Step 5: If duplicate, replace the word with ""
                    words[j] = "";
                }
            }
        }
        
        // Step 6: Join the words array back into a string
        String result = String.join(" ", words);
        
        // Step 7: Display the result
        System.out.println(result);

	}

}
