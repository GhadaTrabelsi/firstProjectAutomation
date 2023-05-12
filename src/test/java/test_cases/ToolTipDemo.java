package test_cases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		String url = "https://demoqa.com/tool-tips/";
		driver.get(url);
		driver.manage().window().maximize();

		WebElement toolTip = driver.findElement(By.id("toolTipButton"));
		String toolTipText = toolTip.getText();

		// Check the tooltip of the button howverme to see

		if (toolTipText.equals("Hover me to see")) {

			System.out.println("Pass: tool tips maching expected value");
		} else {

			System.out.println("Fail: tool tips not maching expected value");

		}

		String msg = driver.findElement(By.id("toolTipButton")).getText();

		Assert.assertEquals("Hover me to see", msg);

	}

}
