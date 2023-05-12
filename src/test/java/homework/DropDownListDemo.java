package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownListDemo {

	public static void main(String[] args) {

		ChromeOptions chromeoptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		chromeoptions.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(chromeoptions);

		String url = "https://www.wikipedia.org/";
		driver.get(url);

		driver.manage().window().maximize();

		WebElement lgge = driver.findElement(By.id("searchLanguage"));
		
		Select select = new Select(lgge);
		select.selectByValue("de");
		
				
				
				
				
				
				
	}

}
