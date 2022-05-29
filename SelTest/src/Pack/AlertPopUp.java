package Pack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "M:\\Documents\\Testing class notes\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
				
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		WebElement confirmElement = driver.findElement(By.xpath("//button[@id='promtButton']"));
		
		confirmElement.click();
		
		Alert alt = driver.switchTo().alert();
		
		
//		String text = alt.getText();
//		System.out.println(text);
//		Thread.sleep(5000);
//		alt.accept();
		
		String text1 = alt.getText();
		System.out.println(text1);
		Thread.sleep(5000);
		alt.sendKeys("Hello");
		Thread.sleep(5000);
		alt.accept();
		
		
		
		
	}

}
