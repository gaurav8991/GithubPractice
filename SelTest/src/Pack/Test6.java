package Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "M:\\Documents\\Testing class notes\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		
		WebElement from = driver.findElement(By.xpath("//input[@id='src']"));
		WebElement to = driver.findElement(By.xpath("//input[@id='dest']"));
		WebElement date = driver.findElement(By.xpath("//label[@for='onward_cal']"));
		
		from.sendKeys("Dwarka Circle, Nashik");
		to.sendKeys("Swargate, Pune");
		//date.click();
		Thread.sleep(2000);
		
		WebElement selectDate = driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']"));
		selectDate.sendKeys("30-Apr-2022");
		Thread.sleep(2000);
		
		WebElement searchBuses = driver.findElement(By.xpath("//button[@id='search_btn']"));
		searchBuses.click();
		Thread.sleep(2000);
		
		String text = searchBuses.getText();
		boolean result = text.equals("Search Buses");
		if(result==true)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}

}
