
package homework;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExecuteLoginTestEdge {

	public static void main(String[] args) throws InterruptedException {


System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/msedgedriver.exe");

EdgeOptions options = new EdgeOptions();
//options.setBinary("C:/Program Files (x86)/Microsoft/Edge/Application/msedge.exe");

WebDriver driver = new EdgeDriver(options);

String URL = "http://www.saucedemo.com/";
driver.get(URL);
driver.manage().window().maximize();

driver.findElement(By.id("user-name")).clear();
driver.findElement(By.id("user-name")).sendKeys("standard_user");

driver.findElement(By.id("password")).clear();
driver.findElement(By.id("password")).sendKeys("secret_sauce");

WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
WebElement btnLogin;
btnLogin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-button")));

JavascriptExecutor executor = (JavascriptExecutor)driver;
executor.executeScript("arguments[0].click();", btnLogin);

WebElement burgerBtn = driver.findElement(By.id("react-burger-menu-btn"));
//burgerBtn.click();
executor.executeScript("arguments[0].click();", burgerBtn);

WebElement allitemBtn = driver.findElement(By.xpath("//*[@id=\"inventory_sidebar_link\"]"));
executor.executeScript("arguments[0].click();", allitemBtn);


WebDriverWait waitCross = new WebDriverWait(driver, Duration.ofSeconds(30));

WebElement crossBtn = waitCross.until(ExpectedConditions.elementToBeClickable(By.className("bm-cross-button")));
crossBtn.click();


WebElement sauceLabsBack = driver.findElement(By.id("item_4_title_link"));
sauceLabsBack.click();
WebElement addCartSauceLabs = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
addCartSauceLabs.click();

//Assert
WebElement removeBtn = driver.findElement(By.id("remove-sauce-labs-backpack"));
String cartBtnText = removeBtn.getText();
Assert.assertEquals("Remove", cartBtnText);

Thread.sleep(3000);
driver.navigate().back();

WebElement tshirtRed = driver.findElement(By.id("item_3_title_link"));
tshirtRed.click();
WebElement addCartTshirtRed = driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
addCartTshirtRed.click();

//Assert on container 
WebElement countContainer = driver.findElement(By.id("shopping_cart_container"));
String countContainerText = countContainer.getText();

Assert.assertEquals("2", countContainerText);

driver.findElement(By.className("shopping_cart_link")).click();
driver.findElement(By.id("checkout")).click();


driver.findElement(By.id("first-name")).sendKeys("Ghada");
driver.findElement(By.id("last-name")).sendKeys("Trabelsi");
driver.findElement(By.id("postal-code")).sendKeys("1030");
driver.findElement(By.id("continue")).click();


WebElement totalPrice = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]"));
String price = totalPrice.getText();
Assert.assertEquals("Total: $49.66", price);


//WebDriverWait waitBtn = new WebDriverWait(driver, Duration.ofSeconds(10));


/*WebElement finishBtn = driver.findElement(By.xpath("//button[@id='finish']"));
executor.executeScript("arguments[0].scrollIntoView();", finishBtn);
executor.executeScript("arguments[0].click();", finishBtn);*/


wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("summary_info")));

// Passer à la page de confirmation de commande
//driver.findElement(By.id("finish")).click();

// Vérifier que la page de confirmation se charge
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("complete-header")));


WebElement finishButton = driver.findElement(By.id("finish"));
((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", finishButton);
((JavascriptExecutor) driver).executeScript("arguments[0].click();", finishButton);


/*WebElement finishBtn = driver.findElement(By.xpath("//button[@id='finish']"));

Actions actions = new Actions(driver);
actions.moveToElement(finishBtn).click().perform();*/







	}
}
