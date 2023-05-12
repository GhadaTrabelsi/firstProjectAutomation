package test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;


public class NavigationDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		System.setProperty("webdriver.http.factory", "jdk-http-client");

		// Open Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		String url = "https://demoqa.com/text-box";
		driver.get(url);
		driver.manage().window().maximize();
		
		
		//ScrollDown
		
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)","");
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.navigate().forward();
		

		//driver.quit();
		

		
		
	}

}
