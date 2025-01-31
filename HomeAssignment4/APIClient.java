package week4.HomeAssignment4;

public class APIClient {
	// Overloaded method: Accepts only endpoint
    public void sendRequest(String endpoint) {
        System.out.println("Sending request to endpoint: " + endpoint);
    }
     // Overloaded method: Accepts endpoint, requestBody, and requestStatus
        public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
            System.out.println("Sending request to endpoint: " + endpoint);
            System.out.println("Request Body: " + requestBody);
            System.out.println("Request Status: " + (requestStatus ? "Success" : "Failure"));
        }
        
        public static void main(String[] args) {
            // Creating an object of APIClient class
            APIClient apiClient = new APIClient();
            
            // Calling the first overloaded method
            apiClient.sendRequest("https://api.example.com/data");
            
            // Calling the second overloaded method
            apiClient.sendRequest("https://api.example.com/data", "{\"key\": \"value\"}", true);
        }
    }