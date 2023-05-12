package homework;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {

		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver(chromeOptions);

		String url = "https://demoqa.com/checkbox";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement checkBox = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[1]")); // TODO
		checkBox.click();

		String message = driver.findElement(By.xpath("//span[normalize-space()='You have selected :']")).getText(); // TODO
		Assert.assertEquals("You have selected :", message);

		WebElement toggle = driver.findElement(By.xpath("//button[@title='Toggle']"));
		toggle.click();

		WebElement expandAll = driver.findElement(By.xpath("//button[@title='Expand all']"));
		expandAll.click();

		WebElement collapseAll = driver.findElement(By.xpath("//button[@title='Collapse all']"));
		collapseAll.click();

		// driver.quit();

	}

}
