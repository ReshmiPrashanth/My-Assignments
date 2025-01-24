package week3.HomeAssignment;

public class LoginPage extends BasePage {
    @Override
	public void performCommonTasks() {
        System.out.println("Performing login-specific tasks in LoginPage.");
    }

    // Additional method specific to LoginPage
    public void login(String username, String password) {
        System.out.println("Logging in with username: " + username + " and password: " + password);
    }

// Class to demonstrate the functionality
    public static void main(String[] args) {
        // Create an object of BasePage and call its methods
        BasePage basePage = new BasePage();
        basePage.findElement("#baseElement");
        basePage.clickElement("#baseButton");
        basePage.enterText("#baseInput", "Base Text");
        basePage.performCommonTasks();

        // Create an object of LoginPage and call its methods
        LoginPage loginPage = new LoginPage();
        loginPage.findElement("#loginUsername");
        loginPage.enterText("#loginUsername", "user123");
        loginPage.enterText("#loginPassword", "pass123");
        loginPage.performCommonTasks();
        loginPage.login("user123", "pass123");
    }
}

