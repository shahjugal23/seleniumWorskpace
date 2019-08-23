package selenium.practice;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("http://www.globalsqa.com/demo-site/frames-and-windows");
		driver.findElement(By.xpath("//*[@id='post-2632']/div[2]/div/div/div[1]/a")).click();
		
		ArrayList<String> tabs =new ArrayList<> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("https://www.amazon.com");
		
		driver.switchTo().window(tabs.get(0));
		driver.get("https://www.flipkart.com");
		driver.quit();
	}

}
