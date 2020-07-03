package lao.pack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TablesEx {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("http://leafground.com/pages/table.html");

		// Get the count of number of columns

		List<WebElement> columns = driver.findElements(By.xpath("//th"));
		int colsize = columns.size();
		System.out.println("Number of columns is: " + colsize);

		// Get the count of number of rows

		List<WebElement> rows = driver.findElements(By.xpath("//tr"));
		int rowsize = rows.size();
		System.out.println("Number of rows is: " + rowsize);

		// WebElement LearnElements =
		// driver.findElement(By.xpath("//td[contains(text(),'Learn to interact with
		// Elements')]"));
		// LearnElements.

		WebElement Progress = driver
				.findElement(By.xpath("//td[contains(text(),'Learn to interact with Elements')]//following::td[1]"));
		String ProgPercentage = Progress.getText();
		System.out.println("Progress Percentage: " + ProgPercentage);

		// Check the vital task for the least completed progress

		List<WebElement> ProgressCol = driver.findElements(By.xpath("//td[2]"));
		// int ProgressSize = ProgressCol.size();
		// System.out.println(ProgressCol);

		List<Integer> numberList1 = new ArrayList<Integer>();

		for (WebElement Pro : ProgressCol) {
			String Values = (Pro.getText().replace("%", ""));

			numberList1.add(Integer.parseInt(Values));

		}
		System.out.println(numberList1);
		int smallNum = Collections.min(numberList1);
		System.out.println(smallNum);

		String NewString = Integer.toString(smallNum) + "%";

		String xpath = "//td[contains(text()," + "\"" + NewString + "\"" + ")]//following::td[1]";
		System.out.println(xpath);

		WebElement check = driver.findElement(By.xpath(xpath));
		Actions actions = new Actions(driver);
		actions.moveToElement(check).click();
		actions.build().perform();

	}

	// td[contains(text(),"30"%)]//following::td[1]

	// td[contains(text(),'30%')]//following::td[1]

}
