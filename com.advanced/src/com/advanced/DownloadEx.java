package com.advanced;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/preethasoundararajan/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// maximize the window
		driver.manage().window().maximize();

		// go to url
		driver.get("http://leafground.com/pages/download.html");
		Thread.sleep(3000);

		WebElement Excel = driver.findElement(By.xpath("//*[@id=\'wrapper\']/div/div[3]/div[2]/a[1]"));
		Excel.click();
		Thread.sleep(3000);

		//driver.switchTo().window(arg0)
		
		
		File filelocation = new File ("/Users/preethasoundararajan/Downloads");
		
		File[] totalfiles = filelocation.listFiles();
		
		for (File fileName : totalfiles) {
			if (fileName.getName().equalsIgnoreCase("testleaf.xlsx")) 
			{
				System.out.println("File is present:" + fileName.getName());
				break;
			}
			else
			{
				System.out.println("File is NOT present" );
			}
			
		}
		driver.close();
		
		/*
		 * WebElement pdf = driver.findElement(By.xpath("//a[text()='Download PDF']"));
		 * pdf.click(); Thread.sleep(3000);
		 * 
		 * WebElement Text =
		 * driver.findElement(By.xpath("//a[text()='Download Text']")); Text.click();
		 * Thread.sleep(3000);
		 */
		
		
		
		
	}
	

}
