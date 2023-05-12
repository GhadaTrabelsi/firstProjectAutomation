package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBordEvent1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		System.setProperty("webdriver.http.factory", "jdk-http-client");

		// Open Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		String url = "https://demoqa.com/text-box";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement fullName = driver.findElement(By.id("userName"));
		WebElement userEmail = driver.findElement(By.id("userEmail"));
		WebElement currentAddress = driver.findElement(By.id("currentAddress"));
		WebElement permanenttAddress = driver.findElement(By.id("permanentAddress"));
		
		
		fullName.sendKeys("Ghada Trabelsi");
		userEmail.sendKeys("tghada0211@gmail.com");
		currentAddress.sendKeys("Ennasr");
		

		currentAddress.sendKeys(Keys.CONTROL,"a");
		currentAddress.sendKeys(Keys.CONTROL,"c");
		permanenttAddress.sendKeys(Keys.CONTROL,"v");
		/*WebElement btnLogin = driver.findElement(By.id("submit"));
		btnLogin.click();*/

		WebElement btnSubmit = driver.findElement(By.id("submit"));

		JavascriptExecutor executor = (JavascriptExecutor)driver;

		executor.executeScript("arguments[0].click();", btnSubmit);
		
	
		
		
	}

}
