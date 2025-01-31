package week4.HomeAssignment4;

public class Base {
	// Method to find an element
    public void findElement(String element) {
        System.out.println("Finding element: " + element);
    }

    // Method to click an element
    public void clickElement(String element) {
        System.out.println("Clicking element: " + element);
    }

    // Method to enter text into an element
    public void enterText(String element, String text) {
        System.out.println("Entering text '" + text + "' into element: " + element);
    }

    // Method to be overridden
    public void performCommonTasks() {
        System.out.println("Performing common tasks from BasePage");
    }
}
