package form;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Asset {
	
	public WebDriver driver;
	


  @Test
  public void fun() {
	  
	  String Actualtittle= "Mercury Tours";
	  String Expectedtittle= driver.getTitle();
	  System.out.println(Expectedtittle);
	  
	  System.out.println(" Welcome to selenium");
	  
	  Assert.assertEquals(Actualtittle,Expectedtittle);
	  
	  System.out.println("Assertion starts here");
	  System.out.println("A blog for software Testers");
	 
	  
	  
  }
  @BeforeTest
  public void openurl() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver= new ChromeDriver();
	  driver.get("http://demo.guru99.com/test/newtours/");
	  driver.manage().window().maximize();
	  	  
  }

  @AfterTest
  public void afterTest() {
  }

}
