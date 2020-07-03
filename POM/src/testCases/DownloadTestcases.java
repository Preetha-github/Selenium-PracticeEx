package testCases;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.DownloadPageObjects;


public class DownloadTestcases {

	WebDriver driver;

	@Test
	public void downloadfile() {
	
	System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
	driver = new ChromeDriver();

	// Maximize the screen
	driver.manage().window().maximize();

	// Implicit wait
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

	// Navigate to url
	driver.navigate().to("http://leafground.com/pages/download.html");

	PageFactory.initElements(driver, DownloadPageObjects.class);
	
	DownloadPageObjects.Excel.click();
	
	File fileloc = new File ("/Users/preethasoundararajan/Downloads");
	File[] TotalFile = fileloc.listFiles();
	for (File file : TotalFile) {
		if (file.getName().equals("testleaf.xlsx")) {
			System.out.println("File is present");
			break;
			
		}
		/*
		 * else { System.out.println("File is NOT present"); }
		 */
		
	}

	
	//pdf
	
	DownloadPageObjects.pdf.click();
	driver.findElement(By.xpath("//*[@id=\"icon\"]/iron-icon")).click();
	
	//Invoice-C678F184-0001.pdf
	File fileloc1 = new File ("/Users/preethasoundararajan/Downloads");
	File[] Totfiles = fileloc1.listFiles();
	for (File file1 : Totfiles) {
		if (file1.getName().equals("Invoice-C678F184-0001.pdf")) {
			System.out.println("File is present");
			break;
		}
	}
	
	
	
	
}
	
}
