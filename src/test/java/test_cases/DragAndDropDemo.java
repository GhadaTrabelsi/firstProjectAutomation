package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropDemo {

	public static void main(String[] args) {

		
		ChromeOptions chromeoptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver(chromeoptions); 
		
		String url= "https://demoqa.com/droppable/";
		driver.get(url);
		
		driver.manage().window().maximize();
		
        Actions actions = new Actions(driver);

        WebElement from = driver.findElement(By.id("draggable"));
        WebElement to  = driver.findElement((By.id("droppable")));

        actions.dragAndDrop(from, to).perform();
        
        //Verify text changed into Dropped!
        
        String textTo = to.getText();
        
        if(textTo.equals("Dropped!"))
        { System.out.println("Pass");
        
        }
        else {
        	System.out.println("Fail");
        }
        	
        driver.quit();
        
        }
        




	}


