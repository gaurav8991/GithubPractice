package Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "M:\\Documents\\Testing class notes\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
//		driver.get("https://www.amazon.in/s?k=mobiles&rh=n%3A1389401031&ref=nb_sb_noss");
//		Thread.sleep(2000);
//		
//		WebElement samGalaxyM53 = driver.findElement(By.xpath("//html[@lang='en-in']//h2//a[1]"));
//		samGalaxyM53.click();
//		Thread.sleep(2000);
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		
		WebElement mixJagdish = driver.findElement(By.xpath("(//ytd-rich-grid-renderer[@class='style-scope ytd-two-column-browse-results-renderer']//h3//yt-formatted-string)[2]"));
		mixJagdish.click();
	}
}
