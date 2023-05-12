
package test_cases;

import java.util.List;
import org.openqa.selenium.By;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.Point;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

 

import io.github.bonigarcia.wdm.WebDriverManager;

 

public class WebElementsCommands {

 

 public static void main(String[] args) throws InterruptedException {

 

 ChromeOptions chromeOptions = new ChromeOptions();

 WebDriverManager.chromedriver().setup();

 System.setProperty("webdriver.http.factory", "jdk-http-client");

 WebDriver driver = new ChromeDriver(chromeOptions);

 

 String url = "https://opensource-demo.orangehrmlive.com/";

 driver.get(url);

 driver.manage().window().maximize();

 Thread.sleep(3000);

 

 WebElement usernameField = driver.findElement(By.name("username"));

 usernameField.clear();

 usernameField.sendKeys("Admin");

 

 String attUsername = usernameField.getAttribute("name");

 System.out.println("The attribute is : " + attUsername);

 

 WebElement passwordField = driver.findElement(By.name("password"));

 passwordField.clear();

 passwordField.sendKeys("admin123");

 

 String attPassword = passwordField.getAttribute("placeholder");

 System.out.println("The attribute is : " + attPassword);

 

 // Dimension ==> Height , Width

 Dimension dimensions = usernameField.getSize();

 System.out.println("Height : " + dimensions.height);

 System.out.println("Width : " + dimensions.width);

 

 // Point ==> X , Y

 Point points = passwordField.getLocation();

 System.out.println("X coordinate : " + points.x);

 System.out.println("Y coordinate : " + points.y);

 

 // Vérifier si le bouton affiché Vrai / faux

 WebElement btnLogin = driver.findElement(By.xpath("//button[@type = 'submit']"));

 boolean result = btnLogin.isDisplayed();

 System.out.println(result);

 

 // Vérifier si le bouton activé vrai / faux

 boolean result1 = btnLogin.isEnabled();

 System.out.println(result1);

 

 // Vérifier si le bouton existe

 List<WebElement> login = driver.findElements(By.xpath("//button[@type = 'submit']"));

 if (login.size() != 0) {

 System.out.println("The button  exist");

 } else {

 System.out.println("The button doesnt exist");

 }

 

 driver.quit();

 

 }

 

}
