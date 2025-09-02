package Practice;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class a1a {
	 public WebDriver driver;

	  
  @Test
  public void alerts() throws Exception {
	  driver.findElement(By.id("alertButton")).click();
	  String str = driver.switchTo().alert().getText();
	  System.out.println(str);
	  
	  Thread.sleep(3000);
	  
	  //handling alert
	  driver.switchTo().alert().accept();
 } 
 
  @BeforeTest
  public void openurl() throws Exception {
	  WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

		  driver.get("https://demoqa.com/alerts");
		  
		  Thread.sleep(3000);
		  
		  driver.manage().window().maximize(); 
	 
  }

  @AfterTest
  public void afterTest() {
  }

}
