package lao.pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonEx {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		driver.navigate().to("http://leafground.com/");
		
		driver.findElement(By.linkText("Button")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("home")).click();
		driver.navigate().back();
		
		
		
		WebElement posbutton = driver.findElement(By.id("position"));
		Point loc = posbutton.getLocation();
		int x = loc.getX();
		int y=loc.getY();
		System.out.println("x position: " + x + "y position: " + y);
		
		Thread.sleep(2000);
		
		WebElement colorbutton = driver.findElement(By.id("color"));
		String bckgroundcolor = colorbutton.getCssValue("background-color");
		
		System.out.println("Color of the button : " + bckgroundcolor);
		
		Thread.sleep(2000);
		
		WebElement sizebutton = driver.findElement(By.id("size"));
		int ht = sizebutton.getSize().getHeight();
		int width = sizebutton.getSize().getWidth();
		
		System.out.println("Height: " + ht);
		System.out.println("Width: " + width);
		Thread.sleep(2000);
		
		
		
		

	}

}
