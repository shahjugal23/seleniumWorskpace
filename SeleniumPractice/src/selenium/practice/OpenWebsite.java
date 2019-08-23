package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class OpenWebsite {

	public static void main(String args[]) throws InterruptedException{
		/*System.setProperty("webdriver.gecko.driver", "C:\\Selenium browser drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		*/
		// Windows on Demand feature.	
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://www.newtours.demoaut.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		//driver.manage().deleteAllCookies();
		Thread.sleep(3000);

		String title = driver.getTitle();
		if(title.equalsIgnoreCase("Welcome: Mercury Tours")){
			System.out.println("The title is correct!");
		}
		else{
			System.out.println("The title is incorrect!");
		}
		
		
		driver.findElement(By.name("userName")).sendKeys("jshah");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("pwd");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		try{
			driver.findElement(By.xpath("//*[contains(text(),'Preferences')]")).isDisplayed();
			System.out.println("The preference is displayed correctly!!");
		}
		catch(Exception e){
			System.out.println("The preference is not displayed.!");
		}
		
		//SELECT
		Thread.sleep(2000);
		System.out.println("Selecting the from port!");
		Select s = new Select( driver.findElement(By.xpath("//*[@*='fromPort']")));
		s.selectByIndex(2);
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//a[contains(text(),'SIGN-OFF')]")).click();
		Thread.sleep(3000);
		
		System.out.println("Signed off.");
		driver.close();
		System.out.println("Closed!");
	}
}
