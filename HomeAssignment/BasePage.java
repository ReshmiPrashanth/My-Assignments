package week3.HomeAssignment;

public class BasePage {
	// Superclass containing common methods for interacting with web elements

	    // Method to find an element
	    public void findElement(String locator) {
	        System.out.println("Finding element using locator: " + locator);
	    }

	    // Method to click an element
	    public void clickElement(String locator) {
	        System.out.println("Clicking on element with locator: " + locator);
	    }

	    // Method to enter text into an element
	    public void enterText(String locator, String text) {
	        System.out.println("Entering text '" + text + "' into element with locator: " + locator);
	    }

	    // Method to perform common tasks (can be overridden)
	    public void performCommonTasks() {
	        System.out.println("Performing common tasks in BasePage.");
	    }
	}

