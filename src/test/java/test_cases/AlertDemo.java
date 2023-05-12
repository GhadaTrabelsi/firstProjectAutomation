package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo {

	public static void main(String[] args) {

		ChromeOptions chromeoptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver(chromeoptions); 
		
		String url= "https://demoqa.com/alerts";
		driver.get(url);
		
		driver.manage().window().maximize();
		WebElement button = driver.findElement(By.id("alertButton"));
	
		button.click();
		
		//Accept Alert
		driver.switchTo().alert().accept();
		
		String title = driver.getTitle();
		System.out.println("title of the page"+title);
		
	
	
		
		//driver.quit();

		
	}

}
