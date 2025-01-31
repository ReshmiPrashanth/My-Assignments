package week4.HomeAssignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// Declare a String array
        String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};
        
        // Add the array elements to a List
        List<String> companyList = new ArrayList<>();
        for (int i=0;i<companies.length;i++) {
        	companyList.add(companies[i]);
        }
     // Sort the list using Collections.sort()
        Collections.sort(companyList);
        
     //Print the sorted list items
        System.out.println("Companies after sorting:"+companyList);

        
     // Print the list in reverse order
        System.out.println("Reversed order:");
        for (int i = companyList.size() - 1; i >= 0; i--) {
            System.out.println(companyList.get(i));
        }
    }
}