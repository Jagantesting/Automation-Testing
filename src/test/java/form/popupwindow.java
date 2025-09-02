 package form;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class popupwindow {
	
	public WebDriver driver;
	public Actions action;
	
	
  @Test
  public void popup() throws Exception { 
	  
	  action=new Actions(driver);
	  
	  WebElement ele= driver.findElement(By.linkText("SwitchTo"));
	  
	  action.moveToElement(ele).build().perform();
	  
	  Thread.sleep(4000);

	  driver.findElement(By.linkText("Windows")).click();
	  
	  Thread.sleep(4000);
	  
	  
	  
	  
  }
  
  
  @BeforeTest
  public void openurl() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://demo.automationtesting.in/Windows.html");
	  driver.manage().window().maximize();
	  
	  
  }
  
  
  
  

  @AfterTest
  public void afterTest() {
  }

}
