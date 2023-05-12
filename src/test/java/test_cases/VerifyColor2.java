package test_cases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyColor2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		String url = "https://demoqa.com/buttons";
		driver.get(url);
		driver.manage().window().maximize();

		// Get element color
		String color = driver.findElement(By.id("doubleClickBtn")).getCssValue("color");
		String[] hexValue = color.replace("rgba(", "").replace(")", "").split(",");

		int hexValue1 = Integer.parseInt(hexValue[0]);
		hexValue[1] = hexValue[1].trim();

		int hexValue2 = Integer.parseInt(hexValue[1]);
		hexValue[2] = hexValue[2].trim();

		int hexValue3 = Integer.parseInt(hexValue[2]);

		String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
		Assert.assertEquals("#ffffff", actualColor);

		System.out.println("The color of the button is: " + actualColor);

		driver.quit();

	}

}
