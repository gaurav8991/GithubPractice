package Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test7 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "M:\\Documents\\Testing class notes\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.get("https://www.spotify.com/in-en/signup?forward_url=https%3A%2F%2Fopen.spotify.com%2F");
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.xpath("//input[@id='year']"));
		year.sendKeys("1995");
		
		WebElement month = driver.findElement(By.xpath("//select[@name='month']"));
		Select s = new Select(month);
		s.selectByVisibleText("May");
		
		WebElement date = driver.findElement(By.xpath("//input[@id='day']"));
		date.sendKeys("19");
		
		WebElement female = driver.findElement(By.xpath("//span[text()='Female']"));
		boolean result = female.isSelected();
		if(result == true)
		{
			System.out.println(result);
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
			female.click();
		}
		result = female.isSelected();
		System.out.println(result);
			
		
	}

}
