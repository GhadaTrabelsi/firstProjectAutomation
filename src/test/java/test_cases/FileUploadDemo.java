package test_cases;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

 

import io.github.bonigarcia.wdm.WebDriverManager;

 

public class FileUploadDemo {

 

 public static void main(String[] args) {


 ChromeOptions chromeOptions = new ChromeOptions();

 WebDriverManager.chromedriver().setup();

 System.setProperty("webdriver.http.factory", "jdk-http-client");

 WebDriver driver = new ChromeDriver(chromeOptions);

 

 String url = "https://demo.guru99.com/test/upload/";

 driver.get(url);

 driver.manage().window().maximize();

 

 WebElement uploadFie = driver.findElement(By.id("uploadfile_0"));

 uploadFie.sendKeys("C:\\Users\\user\\Desktop\\Formation\\Formation Selenium ZD HA\\Data\\Test.txt");



 WebElement checkbox = driver.findElement(By.id("terms"));

 checkbox.click();


 boolean resut = checkbox.isSelected();

 System.out.println(resut);
 driver.findElement(By.id("submitbutton")).click();

 

 driver.quit();

 

 }

 

}
