package test_cases;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTestCase {

	public static <WebdriverWait> void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		System.setProperty("webdriver.http.factory", "jdk-http-client");

		// Open Chrome Browser
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Delete cookies

		driver.manage().deleteAllCookies();

		// Open url swagLabs
		driver.get("http://www.saucedemo.com/");

		// Maximize browser

		driver.manage().window().maximize();

		// Fill username
		driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		// Fill password
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		// Thread.sleep(3000);

		// Click on login button
		// driver.findElement(By.id("login-button")).click();

		// Click on login button with explicit wait

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement btnLogin;
		btnLogin = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
		btnLogin.click();
		
		
		

		// Print a log in in message in the screen
		System.out.println("successfully authentification");

		// Check if product display in the page
		String products = driver.findElement(By.xpath("//span[contains(text(),'Products')]")).getText();

		Assert.assertEquals("Products", products);

		// Close browser
		// driver.quit(); // kill session

		
		
	}

}
