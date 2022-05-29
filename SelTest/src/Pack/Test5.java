package Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test5 {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "M:\\Documents\\Testing class notes\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/sql/trysql.asp?filename=trysql_select_all");
		Thread.sleep(2000);
		
		WebElement RunSQL = driver.findElement(By.xpath("//button[@class='ws-btn']"));
		RunSQL.click();
		
		WebElement SQLStmet = driver.findElement(By.xpath("//pre [@class=' CodeMirror-line ']"));
		SQLStmet.clear();
		Thread.sleep(2000);
		
		
		
	}

}
