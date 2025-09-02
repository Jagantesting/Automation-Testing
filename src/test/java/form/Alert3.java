 package form;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Alert3 {
	
	public WebDriver driver;
	
  @Test
  public void Alert4() throws Exception {
	  
	  driver.findElement(By.id("confirmButton")).click();
	  
	  String str= driver.switchTo().alert().getText();
	  
	  System.out.println(str);
	  Thread.sleep(6000);
	  
	  driver.switchTo().alert().accept();
  }
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://demoqa.com/alerts");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
