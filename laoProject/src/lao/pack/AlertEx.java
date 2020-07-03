package lao.pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEx {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		driver.navigate().to("http://leafground.com/");
		
		driver.findElement(By.linkText("Alert")).click();
		
		WebElement alertButton = driver.findElement(By.xpath("//*[text()='Alert Box']"));
			alertButton.click();
		
		Alert alert = driver.switchTo().alert();
		//Thread.sleep(2000);
		alert.accept();
		
		WebElement ConfirmButton = driver.findElement(By.xpath("//*[contains(text(),'Confirm Box')]"));
		ConfirmButton.click();
		Alert alert1 =  driver.switchTo().alert();
		//Thread.sleep(2000);
		alert1.dismiss();
		
		WebElement PromptButton = driver.findElement(By.xpath("//*[contains(text(),'Prompt Box')]"));
		PromptButton.click();
		
		Alert alert2 = driver.switchTo().alert();
		
		alert2.sendKeys("lao");
		alert2.accept();
		
		WebElement Prompttext = driver.findElement(By.id("result1"));
		String txt = Prompttext.getText();
		System.out.println("Text displayed after PromptAlert:" + txt);
		
		
		
		WebElement SweetButton = driver.findElement(By.xpath("//*[contains(text(),'Sweet Alert')]"));
		SweetButton.click();
		Thread.sleep(2000);
		Alert alert3Alert = driver.switchTo().alert();
		alert3Alert.accept();
		
		


	}

}
