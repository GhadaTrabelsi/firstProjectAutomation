package homework;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindowDemo2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		String url = "https://demoqa.com/browser-windows";
		driver.get(url);

		driver.manage().window().maximize();

		String handle = driver.getWindowHandle();
		System.out.println(handle);
		
		
		WebElement WebMsg = driver.findElement(By.id("messageWindowButton"));
		WebMsg.click();
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);

			for (String handle1 : driver.getWindowHandles()) {
				
				driver.switchTo().window(handle1);
				System.out.println(handle1);

				
				
			}	
		
		
	}

}
