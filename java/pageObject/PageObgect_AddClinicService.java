package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import cispackage.element_Highlight;

public class PageObgect_AddClinicService{
	

	element_Highlight eh= new element_Highlight();
	
	String  ServiceName;
	String  ServiceNameAdded;



    @FindBy(xpath="")
	WebElement clinicNameSearch;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-clinic-service/div/div/div[2]/app-clinic-single/div/div[2]/div[2]/div/div[1]/div/mat-checkbox/label/div")
	WebElement clinicCheckbox;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-clinic-service/div/div/div[3]/app-services/div/div[2]/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[4]/td[4]")
	WebElement serviceName;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-clinic-service/div/div/div[3]/app-services/div/div[2]/form/div/div[1]/kendo-combobox/span/span/span")
	WebElement openMainservice;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-clinic-service/div/div/div[3]/app-services/div/div[2]/form/div/div[2]/kendo-combobox/span/span/span")
	WebElement openUnderservice;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-clinic-service/div/div/div[3]/app-services/div/div[2]/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[4]/td[1]/input")
	WebElement serviceCheckbox;

    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-clinic-service/div/div/div[1]/button")
	WebElement sabtBtton;
    

    


    
    public void AddServicToClinic ( WebDriver driver ) throws InterruptedException {
    	
		Actions action = new Actions(driver);
    	element_Highlight eh= new element_Highlight();
    	
    	
	    //choose clinic
    	eh.highlightElement(driver, clinicCheckbox);
    	action.click(clinicCheckbox).perform();
		eh.unhighlightLast(driver, clinicCheckbox);
		Thread.sleep(1000);
		//choose Service
		eh.highlightElement(driver, openMainservice);
		action.click(openMainservice).perform();
		eh.unhighlightLast(driver, openMainservice);
    	action.sendKeys(Keys.DOWN).perform();
		Thread.sleep(1000);
    	action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		action.click(openUnderservice).perform();
    	action.sendKeys(Keys.DOWN).perform();
		Thread.sleep(1000);
    	action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		ServiceName= serviceName.getText();
    	eh.highlightElement(driver, serviceCheckbox);
    	action.click(serviceCheckbox).perform();
		eh.unhighlightLast(driver, serviceCheckbox);
		Thread.sleep(1000);
		//sabt
    	eh.highlightElement(driver, sabtBtton);
    	sabtBtton.click();
	    eh.unhighlightLast(driver, sabtBtton);
	    //SuccecfulAddMessage
	    WebElement POPUP= driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/snack-bar-container/simple-snack-bar"));
	    eh.highlightElement(driver, POPUP);
	    Thread.sleep(1000);
	    String c= POPUP.getText();
	    System.out.print("resulte:"+c);
	    Assert.assertEquals(c,"ثبت با موفقیت انجام شد\n"
	    		+ "x");
	    eh.unhighlightLast(driver, POPUP);

	    
	    //check sabt
    	action.click(clinicCheckbox).perform();
		Thread.sleep(1000);
        WebElement addedService=driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-clinic-service/div/div/div[2]/app-clinic-single/div/div[2]/div[2]/div/div[1]/div/div/div/div/span"));
	    eh.highlightElement(driver, addedService);
		Thread.sleep(1000);
        ServiceNameAdded=addedService.getText();
        Assert.assertTrue(ServiceNameAdded.contains(ServiceName));
	}
    
}

