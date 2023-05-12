package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		WebDriver driver= new ChromeDriver();
		String url= "https://demoqa.com/alerts";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement btn= driver.findElement(By.id("alertButton"));
		btn.click();
		driver.switchTo().alert().accept();
		
		
		
		
	}

}
