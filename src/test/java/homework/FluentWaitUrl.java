package homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitUrl {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		        .withTimeout(Duration.ofSeconds(30))
		        .pollingEvery(Duration.ofSeconds(1))
		        .ignoring(Exception.class);
		// Wait until the URL of the page contains "https://www.saucedemo.com/inventory.html"
        wait.until(ExpectedConditions.urlContains("https://www.saucedemo.com/inventory.htmlllll"));

        // Get the current URL of the page
        String currentUrl = driver.getCurrentUrl();

        // Print the current URL of the page
        System.out.println("The current URL of the page is: " + currentUrl);

        // Close the driver
       // driver.close();
		
		
	}

}
