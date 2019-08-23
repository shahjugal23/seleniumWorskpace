package com.practice.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class TestBeforeAfter {
  @Test(groups="myGroup")
  public void TestMethod1() {
	  System.out.println("I am method 1");
  }
  @Test(groups="myGroup")
  public void TestMethod2() {
	  System.out.println("I am method 2");
  }
  @Test(groups="first")
  public void TestMethod3() {
	  System.out.println("I am method 3");
  }
  @Test(groups="myGroup")
  public void TestMethod4() {
	  System.out.println("I am method 4");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println(" We are Before Method!");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println(" We are After Method!");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println(" We are Before Test!");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println(" We are After Test!");
  }
@BeforeClass
public void beforeClass(){
	System.out.println(" We are Before Class!");
}
@AfterClass
public void afterClass(){
	System.out.println(" We are After Class!");
}
}
