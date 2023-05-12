package homework;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicClick {

	public static void main(String[] args) {

		
		ChromeOptions chromeoptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver(chromeoptions); 
		
		String url= "https://demoqa.com/buttons";
		driver.get(url);
		
		driver.manage().window().maximize();
		//id is dynamic , so i choosed xpath from selector hub 
		
		WebElement btn = driver.findElement(By.xpath("//button[text()='Click Me']"));
		btn.click();
		
		String  msg = driver.findElement(By.id("dynamicClickMessage")).getText();

	Assert.assertEquals("You have done a dynamic click",msg);
	
	
	
	}

}
