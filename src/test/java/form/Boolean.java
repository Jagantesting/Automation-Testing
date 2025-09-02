package form;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Boolean {
	
	public WebDriver driver;

	
  @Test
  public void condition() throws Exception {
	  
	  driver.findElement(By.xpath("//button[normalize-space()='Round Trip']")).click();
	  Thread.sleep(5000);
	 
	  boolean printcondition = driver.findElement(By.xpath("//button[normalize-space()='Round Trip']")).isDisplayed();
	  
	  System.out.println(printcondition);
	  
	  WebElement ele = driver.findElement(By.xpath("//button[normalize-space()='Round Trip']"));
	  
	  if(ele.isEnabled()) {
		  
		  System.out.println("Roundtrip is passed");
		  
	  }
		  else {
			  
			 System.out.println("Failed");
			 
			 
		  }
	  }
	  
	  
	  
  @BeforeTest
  public void openurl() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://www.savaari.com/");
	  driver.manage().window().maximize();
	  
	  
	
  }

  @AfterTest
  public void afterTest() {
	  
	  
	  
	  
	  
  }

}
