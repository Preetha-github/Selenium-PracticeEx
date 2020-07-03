package lao.pack;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {

//	public void filedownload() {
//
//		File filelocation = new File("/Users/preethasoundararajan/Downloads");
//
//		File[] filespotted = filelocation.listFiles();
//		for (File file1 : filespotted) {
//			if (file1.getName().equals("testleaf.xlsx")) {
//				System.out.println(file1 + " - File is present");
//				break;
//
//			}
//
//		}
//	}

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		driver.navigate().to("http://leafground.com/pages/download.html");

//		DownloadFile DF = new DownloadFile();

		WebElement linkExcel = driver.findElement(By.linkText("Download Excel"));
		linkExcel.click();
		
		Thread.sleep(2000);

		File filelocation = new File("/Users/preethasoundararajan/Downloads");
		File[] Totalfiles = filelocation.listFiles();
		Thread.sleep(2000);
		for (File file : Totalfiles) {
			if (file.getName().equals("testleaf.xlsx")) {
				System.out.println(file + " - File is present");
				break;

			}
		}

		// DF.filedownload();

//		WebElement linkPDF = driver.findElement(By.linkText("Download Excel"));
//		linkPDF.click();
		
		
//
//		WebElement linkText = driver.findElement(By.linkText("Download Excel"));
//		linkText.click();

//driver.close();
	}

}
