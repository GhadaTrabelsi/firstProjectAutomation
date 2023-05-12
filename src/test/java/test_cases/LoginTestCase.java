package test_cases;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginTestCase {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//implicitly wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		// Fill password
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement logbtn; 
        logbtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
        logbtn.click();
        
        System.out.println("Successfull authentification");
        
        String  products = driver.findElement(By.xpath("//span[contains(text(),'Products')]")).getText();
        Assert.assertEquals("Products", products);
      
        //driver.close();
        	

	
		
		
		
		
		
	}

}
