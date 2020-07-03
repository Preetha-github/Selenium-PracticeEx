package lao.pack;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleEx {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		driver.navigate().to("http://leafground.com/");

		driver.findElement(By.linkText("Window")).click();

		// HomeButton

		String MainWindow = driver.getWindowHandle();
		System.out.println("mainwindow: " + MainWindow);

		WebElement HomepageButton = driver.findElement(By.id("home"));
		HomepageButton.click();

		Set<String> Windows = driver.getWindowHandles();
		System.out.println("windows opened: " + Windows);

		for (String string : Windows) {
			driver.switchTo().window(string);
		}
		WebElement Edit = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]"));
		Edit.click();
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(MainWindow);

		WebElement Multiple = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		Multiple.click();
		int numberofwindows= driver.getWindowHandles().size();
		
		System.out.println("Number of windows opened: " + numberofwindows);
		
		WebElement dontcloseme = driver.findElement(By.id("color"));
		dontcloseme.click();
		
		Set<String> Win2 = driver.getWindowHandles();
		
		for (String string : Win2) {
			if (!string.equals(MainWindow)) {
				driver.switchTo().window(string);
				driver.close();
				
			}
			
		}
		
		driver.quit();
		
		
		
		
		
		
		
		
		
	}

}
