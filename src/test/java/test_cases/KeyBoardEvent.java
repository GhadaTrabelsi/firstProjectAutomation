package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardEvent {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		System.setProperty("webdriver.http.factory", "jdk-http-client");

		// Open Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		String url = "https://kodingwindow.com/testapp/";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		
		username.sendKeys("kodingwindow");
		username.sendKeys(Keys.CONTROL,"a");
		username.sendKeys(Keys.CONTROL,"c");
		password.sendKeys(Keys.CONTROL,"v");
		
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		//driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		

		

		
	}

}
