package test_cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExampleFrame {

	public static void main(String[] args) {

		ChromeOptions chromeoptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver(chromeoptions); 

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// Charger l'URL de la page
		driver.get("http://demo.guru99.com/test/guru99home/");

		// Basculer vers le cadre (iframe) spécifié par l'ID
		WebElement frame = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("a077aa5e")));
		driver.switchTo().frame(frame);

		// Attendre la visibilité de l'élément cible
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/a/img")));

		// Cliquer sur l'élément cible
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();

		System.out.println("Access to the frame");

		driver.quit();
	}
}


