package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlaceHolderFinish {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		String url = "https://demoqa.com/tool-tips/";
		driver.get(url);
		driver.manage().window().maximize();

		WebElement placeHolder = driver.findElement(By.id("toolTipTextField"));
		String text = placeHolder.getAttribute("placeholder");

		System.out.println("The placeholder is" + text);

	}

}
