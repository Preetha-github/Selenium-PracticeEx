package login;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Logintotal {
	WebDriver driver;
	
	String [] [] data = null;

	
	@DataProvider (name = "LoginData")
	
	public String[][] dataprovider () throws BiffException, IOException {
		
		data = getExcelData();
		return data;
	}
	@BeforeTest
	public void beforeTest() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}
	
	
	
	
	public String[][] getExcelData() throws BiffException, IOException {

		FileInputStream excel = new FileInputStream("/Users/preethasoundararajan/Downloads/LoginUserdata.xls");
		Workbook workbook = Workbook.getWorkbook(excel);
		Sheet sheet = workbook.getSheet(0);
		int RowCount =sheet.getRows();
		int ColumnCount = sheet.getColumns();
		
		
		String testdata[][]= new String [RowCount-1][ColumnCount];
		
		for (int i=1; i<RowCount; i++) {
			for(int j=0; j<ColumnCount; j++) {
				testdata[i-1][j]=sheet.getCell(j,i).getContents();
						
			}
	
		}
		return testdata;
		
		}
		
		
	
	@Test(dataProvider = "LoginData" )
	public void CUserpwd(String user, String pwd) {
		
	 
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys(user);
		
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys(pwd);
		
		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		loginButton.click();
		
		
		
	}
	
	@AfterTest
	public void afterTest() {
	driver.close();
	}
	
	
	}


