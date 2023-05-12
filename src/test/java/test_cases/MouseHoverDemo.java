package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverDemo {

	public static void main(String[] args) {

		ChromeOptions chromeoptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		chromeoptions.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(chromeoptions);

		String url = "https://demoqa.com/menu/";
		driver.get(url);

		driver.manage().window().maximize();
Actions action = new Actions(driver);
WebElement mainItem2= driver.findElement(By.xpath("//*[@id='nav']/li[2]/a"));

action.moveToElement(mainItem2).perform();

		
		
	}

}
