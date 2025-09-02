package Practice;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class A2_MouseOverActions {
	
	
	public WebDriver driver;
	public Actions action;

  @Test
  public void mouseOver() throws Exception {
	  
	  action= new Actions(driver);
	  
	  WebElement ele = driver.findElement(By.linkText("SwitchTo"));
	//Action command
	  action.moveToElement(ele).build().perform();
	  Thread.sleep(3000);

	  driver.findElement(By.linkText("Windows")).click();

	  Thread.sleep(3000);
  }
  @BeforeTest
  public void beforeTest() {
	  

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	  driver.get("http://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
  }

  
  @AfterTest
  public void afterTest() {
	  	  
  }

}
