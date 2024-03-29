package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import cispackage.element_Highlight;

public class PageObject_ListPatient {
	
	element_Highlight eh= new element_Highlight();

     WebDriver driver;


	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-patient-list/div/app-patient-search/div[1]/form/div[2]/div[2]/div/div/div/div/kendo-textbox-container[1]/input")
	   WebElement SEARCHMELICOD;
	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-patient-list/div/app-patient-search/div[1]/form/div[2]/div[1]/button")
	  WebElement More;
	   
	   public void Search_Patient_melicode (WebDriver driver, String elment) throws Throwable {
		   

		      eh.highlightElement(driver, SEARCHMELICOD);
		      Thread.sleep(500);
		      SEARCHMELICOD.click();
		      SEARCHMELICOD.sendKeys(elment);
		      SEARCHMELICOD.sendKeys(Keys.ENTER);
		      Thread.sleep(3000);
	   }
	   public void Search_Patient_Passport (WebDriver driver, String meli, String pass) throws Throwable {
		   
			 Actions action = new Actions(driver);

		      eh.highlightElement(driver, More);
		      Thread.sleep(500);
		      action
		      .click(More).perform();
		      WebElement meliat=driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-patient-list/div/app-patient-search/div[1]/form/div[2]/div[2]/div/div/div/div[2]/div[4]/kendo-combobox/span/kendo-searchbar/input"));
		      action
		      .click(meliat)
		      .sendKeys(meliat,meli).perform();
		      WebElement passport=driver.findElement(By.name("PassportNumber"));
		      action
		      .click(passport)
		      .sendKeys(passport,pass)
		      .sendKeys(Keys.ENTER)
		      .perform();
		      Thread.sleep(3000);
	   }

	   
	  
	   
}
