package week3.HomeAssignment;

public class ChangeOddIndexToUppercase {
	
	public static void main(String[] args) {
        // Step 1: Declare the String
        String test = "changeme";
        System.out.println("The input String is "+test);

        // Step 2: Convert the String to character array
        char[] charArray = test.toCharArray();

        // Step 3: Traverse through each character
        for (int i = 0; i < charArray.length; i++) {
            // Step 3a: Check if the index is odd
            if (i % 2 != 0) {
                // Step 3b: Change character to uppercase if index is odd
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }

        // Step 4: Convert the character array back to String
        String result = new String(charArray);

        // Step 5: Print the result
        System.out.println("The String after Change Odd Index To Uppercase is: "+result);
    }
}
