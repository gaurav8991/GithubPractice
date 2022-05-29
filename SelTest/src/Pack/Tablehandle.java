package Pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablehandle {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "M:\\Documents\\Testing class notes\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
				
		driver.get("https://barti.in/department_desc.php?id=Vkd0U1NsQlJQVDA9");
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		
		List<WebElement> cells = driver.findElements(By.xpath("(//table[@border='1'])[1]//tbody"));
		
		int size = cells.size();
		System.out.println(size);
		
		for(int i = 0; i<cells.size(); i++)
		{
			String text = cells.get(i).getText();
			System.out.println(text);
		}
		
		
		
	}

}
