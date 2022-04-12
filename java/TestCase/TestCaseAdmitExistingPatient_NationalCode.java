package TestCase;

import org.testng.annotations.Test;

import cispackage.DataProviders;
import cispackage.element_Highlight;
import pageObject.PageObgectLogin;
import pageObject.PageObject_Admit;
import pageObject.PageObject_AdmitList;
import pageObject.PageObject_Landing;
import pageObject.PageObject_MainMenu;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestCaseAdmitExistingPatient_NationalCode {
	element_Highlight eh= new element_Highlight();
    WebDriver driver;

	
  @Test(dataProvider="AdmitData",dataProviderClass=DataProviders.class)
  public void f(String URL ,String UserName ,String Password,String electronicNumber ,String name ,String familyName,String nationalCode,String clinic,String trapist , String assistant, String shift, String model)  throws Throwable {
	  
	  driver.navigate().to(URL);
	  driver.manage().window().maximize();


	  
	  //Login
	  PageObgectLogin admLoginPage = 
				PageFactory.initElements(driver, PageObgectLogin.class);
		admLoginPage.login(driver, URL ,UserName , Password);

		//Landing
		PageObject_Landing Icon = PageFactory.initElements(driver, PageObject_Landing.class);
		Icon.CIS_Icon(driver);
	      Thread.sleep(500);

		  	  System.out.println(driver.getCurrentUrl());
	  for(String window : driver.getWindowHandles() ) {
		  driver.switchTo().window(window);
	  }

	  Thread.sleep(6000);
	  
	  //AdmitExisingtPatientWithName&Family
	  PageObject_Admit admit =PageFactory.initElements(driver, PageObject_Admit.class);
      Thread.sleep(1000);
      admit.Admit_NationalCode(driver, nationalCode);
      Thread.sleep(1000);
	  admit.Admit_Data(driver, clinic,trapist, assistant, shift, model);
      Thread.sleep(500);

   
	  //EnterToAdmitListPage
	  PageObject_MainMenu menu = PageFactory.initElements(driver, PageObject_MainMenu.class);
	  menu.Admit_List_menu(driver);
	  Thread.sleep(3000);
	 for(String window : driver.getWindowHandles() ) {
	  driver.switchTo().window(window);
	  }
	 
	   //CheckAdmit
	  PageObject_AdmitList serchectronicNumbe =PageFactory.initElements(driver, PageObject_AdmitList.class);
	  serchectronicNumbe.Search_Admit_NationalCode(driver, nationalCode);
	  
      WebElement GrideNationalCode=  driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-admit-list/div/div[3]/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[6]"));
      Thread.sleep(2000);
      eh.highlightElement(driver, GrideNationalCode);
      String w = GrideNationalCode.getText();
      System.out.print("resulte:"+ w);
      Assert.assertEquals(nationalCode, w);
      Thread.sleep(2000);


      
      
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/driver/chromedriver.exe");
	  driver = new ChromeDriver(); 
  }

  @AfterMethod
  public void afterMethod() {
		driver.quit();
  }

}
