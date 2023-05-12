package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextBox {

	public static void main(String[] args) {

		ChromeOptions chromeoptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver(chromeoptions);

		String url = "https://demoqa.com/text-box";
		driver.get(url);

		driver.manage().window().maximize();
		WebElement FN = driver.findElement(By.id("userName"));

		FN.sendKeys("Ghada");

		WebElement UE = driver.findElement(By.id("userEmail"));

		UE.sendKeys("Ghada@gmail.com");

		WebElement CA = driver.findElement(By.id("currentAddress"));

		CA.sendKeys(" Ennasr");
		
		WebElement PA = driver.findElement(By.id("permanentAddress"));

		PA.sendKeys("Sfax");
		
		/*WebElement btn = driver.findElement(By.xpath("//button[@id='submit']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(btn).click().perform();*/ //doesn't work
		
		
		/*WebElement btn = driver.findElement(By.xpath("//button[@id='submit']"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(btn)).click();*/  //doesn't work
			
		WebElement btn = driver.findElement(By.id("submit"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", btn);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");	
		
		
		//driver.quit();
		
	}

}
