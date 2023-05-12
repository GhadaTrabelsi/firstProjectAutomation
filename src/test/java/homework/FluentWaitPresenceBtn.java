package homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitPresenceBtn {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		Wait<WebDriver> wait = new FluentWait<>(driver)
		        .withTimeout(Duration.ofSeconds(30))
		        .pollingEvery(Duration.ofMillis(500))
		        .ignoring(Exception.class);

		// Wait for the  visibility of button login with ID "login-button"
		WebElement logbtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login-buttonn")));	
		
        logbtn.click();

        //driver.close();

		
		
		
		
		
	}

}
