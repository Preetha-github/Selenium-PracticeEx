package com.advanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesEx {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// maximize the window
		driver.manage().window().maximize();
		
		//go to url
		
		driver.navigate().to("http://leafground.com/pages/table.html");
		
		//find the number of columns
		
		List<WebElement> columns = driver.findElements(By.xpath("//th"));
		int size = columns.size();
		System.out.println("Number of columns in the table:"+ size);
		
		//find the number of rows
		
		List<WebElement> rows = driver.findElements(By.xpath("//tr"));
		int Rowsize = rows.size();
		System.out.println("Number of rows in the table:"+ Rowsize);
		
		
		//Learn to interact with Elements
		//td[contains(text(),'Learn to interact with Elements')]
		
		WebElement percent = driver.findElement(By.xpath("//td[contains(text(),'Learn to interact with Elements')]//following::td[1]"));
		String text = percent.getText();
		System.out.println("The progress value for Learn to interact with Elements:" + text);
		
		//Least completed progress
		
		List<Integer> numberList = new ArrayList<Integer>();
		
		List<WebElement> li = driver.findElements(By.xpath("//td[2]"));
		int size1 = li.size();
		System.out.println("Size of the Progress column: "+ size1);
	
		
		for (WebElement webElement : li) {
			String value = webElement.getText().replace("%", "");
			numberList.add(Integer.parseInt(value));
			
			
		}
		System.out.println(numberList);
		
		
		
		Collections.sort(numberList);
		System.out.println(numberList.get(0));
		
		
		
		
		//Check the checkbox for least vital task
		
		
		
		driver.close();
		
		
		
		
		

	}

}
