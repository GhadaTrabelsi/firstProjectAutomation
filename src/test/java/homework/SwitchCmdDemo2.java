package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchCmdDemo2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		String url = "http://demo.guru99.com/test/guru99home/";
		driver.get(url);

		driver.manage().window().maximize();
		
		driver.switchTo().frame("a077aa5e");
		
		driver.findElement(By.xpath("/html/body/a/img")).click();
		//driver.quit();
		
		
		
		
		
	}

}
