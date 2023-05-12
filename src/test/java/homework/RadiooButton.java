

		package homework;

		import org.junit.Assert;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.chrome.ChromeOptions;

		import io.github.bonigarcia.wdm.WebDriverManager;

		public class RadiooButton {

			public static void main(String[] args) {

				ChromeOptions chromeoptions = new ChromeOptions();
				WebDriverManager.chromedriver().setup();
				System.setProperty("webdriver.http.factory", "jdk-http-client");
				WebDriver driver = new ChromeDriver(chromeoptions); 
				
				String url= "https://demoqa.com/radio-button";
				
				driver.get(url);
				
				driver.manage().window().maximize();
				
				
				WebElement Rbyes = driver.findElement(By.xpath("//label[normalize-space()='Yes']"));
				Rbyes.click();
				
				String msg = driver.findElement(By.xpath("//p[@class='mt-3']")).getText();
				try {
				    Assert.assertEquals(msg, "You have selected Yes");
				    System.out.println("Assertion passed!");
				} catch (AssertionError e) {
				    System.err.println("Assertion failed: " + e.getMessage());
				
				System.out.println("failed");
				}
				
				WebElement Rbimp = driver.findElement(By.xpath("//label[normalize-space()='Impressive']"));
				Rbimp.click();
				String msgg = driver.findElement(By.xpath("//p[@class='mt-3']")).getText();
				Assert.assertEquals(msgg, "You have selected Impressive");
			    System.out.println("Assertion passed!");
			    WebElement Rbno = driver.findElement(By.xpath("//label[normalize-space()='No']"));
				Rbno.click();
				String msggg = driver.findElement(By.xpath("//p[@class='mt-3']")).getText();
				Assert.assertNotEquals(msggg, "You have selected No");
			    System.out.println("Assertion failed!");
			    
		//driver.quit();
			    
		
		
			    
	}

}
