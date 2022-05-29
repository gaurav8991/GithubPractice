package Pack;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "M:\\Documents\\Testing class notes\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
				
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(3000);
		
		WebElement tryItYourself = driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert']"));
		tryItYourself.click();
		
		String mainpage = driver.getWindowHandle();
		System.out.println(mainpage);
		
		ArrayList<String> add = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(add.get(1));
		
		WebElement iFrame1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(iFrame1);
		
		
		WebElement tryIt = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
		tryIt.click();
		
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		
		
		
	}

}
