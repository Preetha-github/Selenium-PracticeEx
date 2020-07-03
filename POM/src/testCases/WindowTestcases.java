package testCases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.WindowPageObjects;

public class WindowTestcases {

	WebDriver driver;

	@Test
	public void window() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		driver = new ChromeDriver();

		// Maximize the screen
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		// Navigate to url
		driver.navigate().to("http://testleaf.herokuapp.com/pages/Window.html");

		PageFactory.initElements(driver, WindowPageObjects.class);

		String parentwindow = driver.getWindowHandle();

		WindowPageObjects.OpenHomeButton.click();

		Set<String> Editallwindows = driver.getWindowHandles();

		for (String string1 : Editallwindows) {
			if (!string1.equals(parentwindow)) {

				driver.switchTo().window(string1);
				driver.findElement(By.xpath("//*[contains(text(),'Edit')]")).click();
				driver.close();

			}
		}

		driver.switchTo().window(parentwindow);

		WindowPageObjects.OpenMultipleButton.click();
		Set<String> allwindows = driver.getWindowHandles();
		int size = allwindows.size();
		System.out.println("Number of Opened windows: " + size);

		driver.switchTo().window(parentwindow);

		WindowPageObjects.CloseButton.click();

		Set<String> closewindows = driver.getWindowHandles();
		for (String string2 : closewindows) {
			if (!string2.equals(parentwindow)) {
				driver.switchTo().window(string2);
				driver.close();

			}

		}
		
		driver.switchTo().window(parentwindow);
		WindowPageObjects.WaitButton.click();
		Thread.sleep(5000);
		
		
driver.quit();
	}

}
