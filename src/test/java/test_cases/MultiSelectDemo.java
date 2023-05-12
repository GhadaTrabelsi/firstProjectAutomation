package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		String url = "https://demoqa.com/select-menu";
		driver.get(url);
		driver.manage().window().maximize();

		WebElement list = driver.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div"));

		list.click();

		Actions actions = new Actions(driver);
		actions.sendKeys(list, "Green").sendKeys(Keys.ENTER).perform();
		actions.sendKeys(list, "Red").sendKeys(Keys.ENTER).perform();

		list.click();

		System.out.println("Multiselect colors  drop down is displayed  successfully");

		WebElement StandardMselect = driver.findElement(By.id("cars"));
		Select list1 = new Select(StandardMselect);
		list1.selectByValue("volvo");
		list1.selectByValue("saab");
		list1.selectByVisibleText("Opel");
		list1.selectByVisibleText("Audi");

		System.out.println("Multiselect cars  drop down is displayed  successfully");

	}

}


