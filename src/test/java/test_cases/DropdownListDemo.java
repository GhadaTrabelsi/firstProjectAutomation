package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownListDemo {

	public static void main(String[] args) {

		ChromeOptions chromeoptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		chromeoptions.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(chromeoptions);

		String url = "https://demoqa.com/select-menu";
		driver.get(url);

		driver.manage().window().maximize();
		
		WebElement selectmenu = driver.findElement(By.id("oldSelectMenu"));
		Select dropdownlist = new Select(selectmenu);
		
		//select the option by index 
		dropdownlist.selectByIndex(5);
		
		
		//select the option by value
		dropdownlist.selectByValue("9");

		//select the option by visible text
		dropdownlist.selectByVisibleText("Yellow");

		//driver.quit();
	}

}
