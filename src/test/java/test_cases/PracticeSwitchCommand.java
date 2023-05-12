package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeSwitchCommand {

	public static void main(String[] args) {

		
		ChromeOptions chromeoptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver(chromeoptions); 
		
		String url= "http://demo.guru99.com/test/guru99home/";
		driver.get(url);
		
		driver.manage().window().maximize();
		
		
		
		driver.switchTo().frame("a077aa5e");
		WebElement elm = driver.findElement(By.xpath("html/body/a/img"));
		elm.click();
		
		
		
		//code does not work 
		
		/*WebDriverWait wait = new WebDriverWait(driver,10);
	
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("a077aa5e"));

		//Attente explicite de 10 secondes
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/a/img")));

		WebElement elm = driver.findElement(By.xpath("html/body/a/img"));

		Actions actions = new Actions(driver);
		actions.moveToElement(elm).click().build().perform();*/
		
		
		
	}

}
