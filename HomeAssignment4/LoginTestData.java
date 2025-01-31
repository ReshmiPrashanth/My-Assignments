package week4.HomeAssignment4;

public class LoginTestData extends TestData {
	    // Method to enter username
	    public void enterUsername() {
	        System.out.println("Entering username: testUser");
	    }
	    
	    // Method to enter password
	    public void enterPassword() {
	        System.out.println("Entering password: ********");
	    }

	    public static void main(String[] args) {
	        // Creating an object of TestData class
	        TestData testData = new TestData();
	        testData.enterCredentials();
	        testData.navigateToHomePage();
	        
	        System.out.println("-------------------------");
	        
	        // Creating an object of LoginTestData class
	        LoginTestData loginTestData = new LoginTestData();
	        loginTestData.enterCredentials(); // Inherited method
	        loginTestData.navigateToHomePage(); // Inherited method
	        loginTestData.enterUsername();
	        loginTestData.enterPassword();
	    }
	}
