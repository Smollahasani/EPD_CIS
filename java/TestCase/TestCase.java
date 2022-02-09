package TestCase;

import org.testng.annotations.Test;

import cispackage.DataProviders;
import cispackage.element_Highlight;
import pageObject.PageObgectLogin;
import pageObject.PageObject_AddPatient;
import pageObject.PageObject_Landing;
import pageObject.PageObject_ListPatient;
import pageObject.PageObject_MainMenu;

import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestCaseAddPatient {
      String nationalCode;

      
      WebDriver driver;
	element_Highlight eh= new element_Highlight();


  @Test()
  public void f() throws Throwable {
	 


	  

  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samane\\seleniumWebDriver3\\chromedriver.exe");
	  driver = new ChromeDriver();
      driver.get("http://mellicode.azmads.com/Home/");
	  WebElement Code = driver.findElement(By.xpath("/html/body/div[2]/div[1]/h2[2]"));
	  eh.highlightElement(driver, Code);
	  Thread.sleep(1000);
	  nationalCode = driver.findElement(By.xpath("/html/body/div[2]/div[1]/h2[2]")).getText();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	  
	  	
  }
	   @AfterMethod
  public void afterMethod() {
		driver.quit();
	  
  }

}
