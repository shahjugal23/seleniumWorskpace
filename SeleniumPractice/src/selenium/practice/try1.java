package selenium.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class try1 {

	public static void main(String[] args) {
	System.out.println(System.getProperty("user.dir")) ;
	
	System.setProperty("webdriver.gecko.driver", "C:\\Selenium browser drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	driver.close();
	System.out.println("DONE!!");
	}

}
