package test_cases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		//Instantiate Actions Class 
		
		Actions actions = new Actions(driver);
		
		WebElement btnRC = driver.findElement(By.id("rightClickBtn"));
		actions.contextClick(btnRC).build().perform();
		
System.out.println("Btn RIGHT clicked");
		
		// Check if msg display in the page
				String msg = driver.findElement(By.xpath("//p[@id='rightClickMessage']")).getText();

				Assert.assertEquals("You have done a right click", msg);
		//driver.quit();
		
	}

}
