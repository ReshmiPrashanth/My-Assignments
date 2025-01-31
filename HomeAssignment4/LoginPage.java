package week4.HomeAssignment4;

import week3.HomeAssignment.BasePage;

public class LoginPage extends BasePage {
    @Override
    public void performCommonTasks() {
        System.out.println("Performing login-specific tasks in LoginPage");
    }

	public static void main(String[] args) {
		// Creating an object of BasePage class
        BasePage basePage = new BasePage();
        basePage.findElement("username");
        basePage.clickElement("loginButton");
        basePage.enterText("password", "mySecretPassword");
        basePage.performCommonTasks();

        System.out.println("-------------------------");

        // Creating an object of LoginPage class
        LoginPage loginPage = new LoginPage();
        loginPage.findElement("username");
        loginPage.clickElement("loginButton");
        loginPage.enterText("password", "mySecretPassword");
        loginPage.performCommonTasks(); // Overridden method
    }
	}
