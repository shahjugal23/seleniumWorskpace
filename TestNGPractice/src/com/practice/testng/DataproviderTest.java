package com.practice.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderTest {

	WebDriver driver;
	@DataProvider(name="login")
	public Object[][] getLogin(){
		return new Object[][]
		{
			{"Google"},
			{"Microsoft"},
			{"Amazon"},
			{"Flipkart"}
		};

	}	
		
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium browser drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider="login")
	public void testLogin(String searchKey) throws InterruptedException{
		driver.get("http://www.google.com/");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(searchKey);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@name='btnK'])[1]")).click();
		Thread.sleep(3000);
		
		System.out.println("Search results are opened");
		
		driver.findElement(By.xpath("//h3[text()='Searches related to "+searchKey+"']")).isDisplayed();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='q']")).clear();
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
