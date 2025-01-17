package week2.Day1.HomeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Sanjana");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("15");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		WebElement cacc = driver.findElement(By.className("smallSubmit"));
		cacc.click();
		//Verify that the Title is displayed correctly
		System.out.println("The Title is"+driver.getTitle());
		if (driver.getTitle().contains("opentaps")) {
			System.out.println("I confirm the title has OpenTaps");
		}else {
			System.out.println("The Title does not have the word OpenTaps");
		}
		driver.close();
	}

}
