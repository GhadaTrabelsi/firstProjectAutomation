package homework;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class DragDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		WebDriver driver = new ChromeDriver();
		String url= "https://demoqa.com/droppable"; 
		driver.get(url);
		driver.manage().window().maximize();
		
		
		WebElement from = driver.findElement(By.id("draggable"));
		
		WebElement to = driver.findElement(By.id("droppable"));

		Actions actions = new Actions(driver);
		actions.dragAndDrop(from, to).perform();
		
		String msg= to.getText();
		Assert.assertEquals(msg, "Dropped!");
		
		
		//driver.quit();
		
	}

}
