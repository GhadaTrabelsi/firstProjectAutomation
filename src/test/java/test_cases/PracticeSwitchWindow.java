package test_cases;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeSwitchWindow {

	public static void main(String[] args) {

		ChromeOptions chromeoptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		chromeoptions.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(chromeoptions);

		String url = "https://demoqa.com/browser-windows";
		driver.get(url);

		driver.manage().window().maximize();

		String handle = driver.getWindowHandle();
		System.out.println(handle);

		driver.findElement(By.id("messageWindowButton")).click();
		
		driver.switchTo().window(handle);
		driver.manage().window().maximize();


		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));

		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);

		for (String handle1 : driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
			System.out.println(handle1);

		}


		driver.switchTo().window(handle);

		String handleex2 = driver.getWindowHandle();
		System.out.println(handleex2);

		driver.findElement(By.xpath("//button[@id='tabButton']")).click();

		Set<String> handlesex2 = driver.getWindowHandles();
		System.out.println(handlesex2);

		/*for (String handle2 : driver.getWindowHandles()) {
			driver.switchTo().window(handle2);
			System.out.println(handle2);

			

		}*/



		driver.switchTo().window(handle);

		String handle3 = driver.getWindowHandle();
		System.out.println(handle3);

		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.numberOfWindowsToBe(3));
		
		driver.findElement(By.id("windowButton")).click();

		Set<String> handles3= driver.getWindowHandles();
		System.out.println(handles3);

		
		driver.switchTo().window(handle);


}
	}
