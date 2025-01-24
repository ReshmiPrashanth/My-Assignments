package week3.HomeAssignment;

public class APIClient{

	// Method to send a request with one argument: endpoint
	    public void sendRequest(String endpoint) {
	        System.out.println("Sending request to endpoint: " + endpoint);
	    }

	    // Overloaded method to send a request with three arguments: endpoint, requestBody, and requestStatus
	    public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
	        System.out.println("Sending request to endpoint: " + endpoint);
	        System.out.println("Request body: " + requestBody);
	        if (requestStatus) {
	            System.out.println("Request was successful.");
	        } else {
	            System.out.println("Request failed.");
	        }
	    }

	    // Main method to demonstrate the usage of the overloaded methods
	    public static void main(String[] args) {
	        // Create an object of APIClient
	        APIClient apiClient = new APIClient();

	        // Call the first version of sendRequest
	        apiClient.sendRequest("https://api.example.com/data");

	        // Call the overloaded version of sendRequest
	        apiClient.sendRequest("https://api.example.com/data", "{\"key\": \"value\"}", true);
	    }
	}
