package test_cases;

import java.time.Duration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
    public  WebDriver driver;
    @BeforeClass
    public  void setup() {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        String url = "https://www.saucedemo.com/";
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }
    
    @Test
    public void valid_UserCredential() {
        
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }
    
    @Test
    public void invalid_UserCredential() {
        
        driver.findElement(By.id("user-name")).sendKeys("Seif");
        driver.findElement(By.id("password")).sendKeys("Seif123");
        driver.findElement(By.id("login-button")).click();
    }
    
    @AfterClass
    public  void tearDown() {
        driver.quit();
    }
}
