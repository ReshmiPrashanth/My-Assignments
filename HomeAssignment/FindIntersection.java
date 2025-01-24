package week3.HomeAssignment;

public class FindIntersection {

	public static void main(String[] args) {
		//Declare the arrays
        int a[] = {3, 2, 11, 4, 6, 7};
        int b[] = {1, 2, 8, 4, 9, 7};

        // Iterate through the first array
        for (int i = 0; i < a.length; i++) {
            // Nested loop to iterate through the second array
            for (int j = 0; j < b.length; j++) {
                // Compare the elements of both arrays
                if (a[i] == b[j]) {
                    // Print the matching element
                    System.out.println("Matching element: " + a[i]);
                }
            }
        }
    }
}
