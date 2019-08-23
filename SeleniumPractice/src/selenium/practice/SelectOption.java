package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOption {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium browser drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://output.jsbin.com/osebed/2");
		
		Select s = new Select(driver.findElement(By.xpath("//select[@id='fruits']")));
		s.selectByVisibleText("Banana");
		s.selectByValue("apple");
		s.selectByIndex(3);
		
		Thread.sleep(5000);
		driver.close();
		System.out.println("Perfect!");
	}

}
