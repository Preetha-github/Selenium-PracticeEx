package lao.pack;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuruWindowHandleEx {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		driver.navigate().to("http://demo.guru99.com/popup.php");
		String HomeWindow = driver.getWindowHandle();
		System.out.println("HomeWindow : " + HomeWindow);

		driver.findElement(By.linkText("Click Here")).click();
//		Thread.sleep(2000);

		Set<String> SecondWindow = driver.getWindowHandles();
		System.out.println("SecondWindow : " + SecondWindow);

		for (String string1 : SecondWindow) {
			if (!string1.equals(HomeWindow)) {

				driver.switchTo().window(string1);
				WebElement message = driver.findElement(By.name("emailid"));
				message.sendKeys("test@gmail.com");
				WebElement submit = driver.findElement(By.name("btnLogin"));
				submit.click();
			}

		}

		Set<String> ThirdWindow = driver.getWindowHandles();
		System.out.println("ThirdWindow : " + ThirdWindow);

		for (String string3 : ThirdWindow) {
			if (!string3.equals(HomeWindow)) {
				driver.switchTo().window(string3);
				driver.close();
			}

		}

		driver.quit();
	}

}
