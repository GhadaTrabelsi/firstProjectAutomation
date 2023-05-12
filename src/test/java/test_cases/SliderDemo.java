package test_cases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderDemo {

	public static void main(String[] args) {

		ChromeOptions chromeoptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		chromeoptions.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(chromeoptions);

		String url = "http://demoqa.com/slider/";
		driver.get(url);

		driver.manage().window().maximize();
		
		
		Actions action =  new Actions(driver);
		WebElement Slider = driver.findElement(By.id("sliderContainer"));
		
		action.moveToElement(Slider, 20, 0).click().build().perform();
		//Slider.click();
		System.out.println("move the slide in horizontal direction");
		

		String value = driver.findElement(By.id("sliderValue")).getAttribute("value");
		System.out.println("the value of the value attribute is "+value);
		Assert.assertEquals("72", value);

		
		//driver.quit();

		
		
		

		
		
	}

}
