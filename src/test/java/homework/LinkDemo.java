
package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkDemo {

	public static void main(String[] args) {

		/*
		 * ChromeOptions chromeoptions = new ChromeOptions();
		 * WebDriverManager.chromedriver().setup();
		 * System.setProperty("webdriver.http.factory", "jdk-http-client"); WebDriver
		 * driver = new ChromeDriver(chromeoptions);
		 */

		ChromeOptions options = new ChromeOptions();
		WebDriverManager.chromedriver().setup();

		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);

		String url = "https://demoqa.com/links";

		driver.get(url);

		driver.manage().window().maximize();

		WebElement linkHome = driver.findElement(By.id("simpleLink"));
		linkHome.click();
		String title = driver.getTitle();
		System.out.println("the title of the link " + title);

	}

}
