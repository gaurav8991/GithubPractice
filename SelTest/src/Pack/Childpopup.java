package Pack;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childpopup {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "M:\\Documents\\Testing class notes\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
				
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(3000);
		
		WebElement alertBox = driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert']"));
		WebElement confirmBox = driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_confirm']"));
		WebElement promptBox = driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_prompt']"));
		WebElement lineBreaksBox = driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert2']"));
		
		
		
		alertBox.click();
		Thread.sleep(3000);
		confirmBox.click();
		Thread.sleep(3000);
		promptBox.click();
		Thread.sleep(3000);
		lineBreaksBox.click();
		Thread.sleep(3000);
		
		String mainpage = driver.getWindowHandle();
		System.out.println(mainpage);
		
		
		ArrayList<String> addr = new ArrayList<String> (driver.getWindowHandles());
		
		for(int i=0;i<5;i++)
		{
			System.out.println(addr.get(i));
		}
		
		driver.switchTo().window(addr.get(0)) ;
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(addr.get(1)) ;
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(addr.get(2)) ;
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(addr.get(3)) ;
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(addr.get(4)) ;
		System.out.println(driver.getCurrentUrl());
		
		
		
		
	}

}
