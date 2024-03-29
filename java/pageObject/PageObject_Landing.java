package pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cispackage.element_Highlight;

public class PageObject_Landing {

  element_Highlight eh= new element_Highlight();

   @FindBy(xpath="/html/body/app-root/div/app-layout/div/div/div[2]/div/div[2]/his-home/div/div/div/div/nav/div/div[3]/a/span")
   WebElement HR;

   @FindBy(xpath="/html/body/app-root/div/app-layout/div/div/div[2]/div/div[2]/his-home/div/div/div/div/nav/div/div[2]/a/span")
   WebElement GV;

   @FindBy(xpath="/html/body/app-root/div/app-layout/div/div/div[2]/div/div[2]/his-home/div/div/div/div/nav/div/div[1]/a/span")
   WebElement CIS;

   public void CIS_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,CIS);
	   Thread.sleep(1000);
	   CIS.click();
	   Thread.sleep(10000);

	   
	   
   }
	   
 }
