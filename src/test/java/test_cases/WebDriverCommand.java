package test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommand {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		driver.manage().window().maximize();

		String titlePage = driver.getTitle();
		int titleLength = titlePage.length();

		System.out.println("title of page is" + titlePage);
		System.out.println("Length of page is" + titleLength);

		String actualUrl = driver.getCurrentUrl();
		if (actualUrl.equals(url)) {
			System.out.println("Verification successfull, correct URL opened");
		} else {
			System.out.println("Verification failed, an incorrect  URL opened");

		}

		System.out.println("The actual url is" + actualUrl);

		System.out.println("The expected url is" + url);

		String sourcePage = driver.getPageSource();

		int lengthPageSource = sourcePage.length();

		System.out.println("Length of the sourcePage" + lengthPageSource);

	}

}
