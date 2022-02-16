package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import cispackage.element_Highlight;

public class PageObgect_AddTrapistService{
	

	element_Highlight eh= new element_Highlight();
	
	String  ServiceName;
	String  ServiceNameAdded;
	String  ServiceName2;
	String  ServiceNameAdded2;
	String  TrapistName;
    String  TrapistFirstName;
    String  TrapistLastName;
    String  TrapistCodeWithTitle;
    String  TrapistCode;




	    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-service/div/div/div[2]/app-therapist-single/div[1]/div[1]/div/div[1]")
		WebElement trapistSearchButtom;

	    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-service/div/div/div[2]/app-therapist-single/div[1]/div[2]/div/div[1]/kendo-textbox-container/input")
		WebElement trapistNameSearch;
	    
	    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-service/div/div/div[2]/app-therapist-single/div[1]/div[2]/div/div[2]/kendo-textbox-container/input")
		WebElement trapistFamilySearch;
	    
	    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-service/div/div/div[2]/app-therapist-single/div[1]/div[2]/div/div[3]/kendo-textbox-container/input")
		WebElement trapistCodeSearch;
	    
	    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-service/div/div/div[2]/app-therapist-single/div[2]/div[2]/div/div[1]/div/div[2]/div")
		WebElement trapistCode;
	    
	    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-service/div/div/div[2]/app-therapist-single/div[2]/div[2]/div/div[1]/div/div[1]/mat-checkbox/label/span")
		WebElement trapistName;

    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-service/div/div/div[2]/app-therapist-single/div[2]/div[2]/div/div[1]/div/div[1]/mat-checkbox/label/div")
	WebElement trapistCheckbox;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-service/div/div/div[3]/app-services/div/div[2]/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[3]/td[4]")
	WebElement serviceName;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-service/div/div/div[3]/app-services/div/div[2]/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[7]/td[4]")
	WebElement serviceName2;

    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-service/div/div/div[3]/app-services/div/div[2]/form/div/div[1]/kendo-combobox/span/span/span")
	WebElement openMainservice;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-service/div/div/div[3]/app-services/div/div[2]/form/div/div[2]/kendo-combobox/span/span/span")
	WebElement openUnderservice;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-service/div/div/div[3]/app-services/div/div[2]/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[3]/td[1]/input")
	WebElement serviceCheckbox;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-service/div/div/div[3]/app-services/div/div[2]/div/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[7]/td[1]/input")
	WebElement serviceCheckbox2;

    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-service/div/div/div[1]/button")
	WebElement sabtButton;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-therapist-service/div/div/div[2]/app-therapist-single/div[1]/div[1]/div/div[2]")
	WebElement refreshButton;

    

    


    
    public void AddServicToTrapist ( WebDriver driver ) throws InterruptedException {
    	
		Actions action = new Actions(driver);
    	element_Highlight eh= new element_Highlight();
    	
    	
	    //choose trapist
    	eh.highlightElement(driver, trapistCheckbox);
    	action.click(trapistCheckbox).perform();
		eh.unhighlightLast(driver, trapistCheckbox);
		Thread.sleep(1000);
		//choose Service
		eh.highlightElement(driver, openMainservice);
		action.click(openMainservice).perform();
		eh.unhighlightLast(driver, openMainservice);
    	action.sendKeys(Keys.DOWN).perform();
		Thread.sleep(1000);
    	action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		action.click(openUnderservice).perform();
    	action.sendKeys(Keys.DOWN).perform();
		Thread.sleep(500);
    	action.sendKeys(Keys.DOWN).perform();
		Thread.sleep(500);
    	action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		//choose $ get service
		ServiceName= serviceName.getText();
    	eh.highlightElement(driver, serviceCheckbox);
    	action.click(serviceCheckbox).perform();
		eh.unhighlightLast(driver, serviceCheckbox);
		//choose $ get service2
		Thread.sleep(2000);
		ServiceName2= serviceName2.getText();
    	eh.highlightElement(driver, serviceCheckbox2);
    	action.click(serviceCheckbox2).perform();
		eh.unhighlightLast(driver, serviceCheckbox2);
		Thread.sleep(1000);
		
		//sabt
    	eh.highlightElement(driver, sabtButton);
    	sabtButton.click();
	    eh.unhighlightLast(driver, sabtButton);
	    //SuccecfulAddMessage
	    WebElement POPUP= driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/snack-bar-container/simple-snack-bar"));
	    eh.highlightElement(driver, POPUP);
	    Thread.sleep(1000);
	    String c= POPUP.getText();
	    System.out.print("resulte:"+c);
	    Assert.assertEquals(c,"Ø«Ø¨Øª Ø¨Ø§ Ù…ÙˆÙ�Ù‚ÛŒØª Ø§Ù†Ø¬Ø§Ù… Ø´Ø¯\n"
	    		+ "x");
	    eh.unhighlightLast(driver, POPUP);

	    
	    //check sabt service
    	action.click(trapistCheckbox).perform();
		Thread.sleep(1000);
        WebElement addedService=driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-therapist-service/div/div/div[2]/app-therapist-single/div/div[2]/div[2]/div/div[1]/div/div/div/div/span"));
	    eh.highlightElement(driver, addedService);
		Thread.sleep(1000);
        ServiceNameAdded=addedService.getText();
        Assert.assertTrue(ServiceNameAdded.contains(ServiceName));
	    //check sabt service2
		Thread.sleep(1000);
        WebElement addedService=driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-therapist-service/div/div/div[2]/app-therapist-single/div/div[2]/div[2]/div/div[1]/div/div/div/div[2]/span"));
	    eh.highlightElement(driver, addedService);
		Thread.sleep(1000);
        ServiceNameAdded2=addedService.getText();
        Assert.assertTrue(ServiceNameAdded2.contains(ServiceName2));
        action.click(refreshButton).perform();
	}
    
    public void TrapistServicePriority ( WebDriver driver ) throws InterruptedException {
    	
		Actions action = new Actions(driver);
    	element_Highlight eh= new element_Highlight();
    	//get service name in position 2
    	action.click(trapistCheckbox).perform();
		Thread.sleep(1000);
        WebElement addedService2=driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-therapist-service/div/div/div[2]/app-therapist-single/div/div[2]/div[2]/div/div[1]/div/div/div/div[2]/span"));
	    eh.highlightElement(driver, addedService);
        ServiceNameAdded2=addedService2.getText();
        //move service to position 1
         actions
		.moveToElement(addedService2)
		.clickAndHold()
		.moveByOffset(130, 0)
		.release()
		.perform();
         //sabt changes
     	eh.highlightElement(driver, sabtButton);
     	sabtButton.click();
 	    eh.unhighlightLast(driver, sabtButton);
		Thread.sleep(1000);
 	   //check Priority 
    	action.click(trapistCheckbox).perform();
		Thread.sleep(1000);
        WebElement addedService=driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-therapist-service/div/div/div[2]/app-therapist-single/div/div[2]/div[2]/div/div[1]/div/div/div/div[1]/span"));
	    eh.highlightElement(driver, addedService);
        ServiceNameAdded=addedService.getText();
        Assert.assertEquals(ServiceNameAdded2, ServiceNameAdded);
        return ServiceNameAdded2;

  	
    }
    public void Search_three_letter ( WebDriver driver ) throws InterruptedException {
		Actions action = new Actions(driver);
  	element_Highlight eh= new element_Highlight();

  	 
  	//get name
		eh.highlightElement(driver, trapistSearchButtom);
		action.click(trapistSearchButtom).perform();
		eh.unhighlightLast(driver, trapistSearchButtom);
  	eh.highlightElement(driver, trapistName);
		Thread.sleep(1000);
  	TrapistName= trapistName.getText();
		Thread.sleep(500);
		eh.unhighlightLast(driver, trapistName);
		action.click(refreshButton).perform();
		
		 //split trapist name
		String substrings[] = TrapistName.split(" "); 
		
		TrapistFirstName=substrings[0];
		TrapistLastName=substrings[1];
		
 	    //search name
		String threeN = TrapistFirstName.substring(0, 2);
		action.click(trapistNameSearch).perform();
		action.sendKeys(threeN).perform();

		eh.highlightElement(driver, trapistSearchButtom);
		action.click(trapistSearchButtom).perform();
		eh.unhighlightLast(driver, trapistSearchButtom);
		Thread.sleep(1000);
		Assert.assertTrue(TrapistName.contains(TrapistFirstName));
		trapistNameSearch.clear();
		action.click(refreshButton).perform();
		Thread.sleep(1000);

		
		//search Family
	    threeN = TrapistLastName.substring(0, 2);
		action.click(trapistFamilySearch).perform();
		action.sendKeys(threeN).perform();
		eh.highlightElement(driver, trapistSearchButtom);
		action.click(trapistSearchButtom).perform();
		eh.unhighlightLast(driver, trapistSearchButtom);
		Thread.sleep(1000);
		Assert.assertTrue(TrapistName.contains(TrapistLastName));
		action.click(refreshButton).perform();

   } 
    
    public void Search_trapist_code ( WebDriver driver ) throws InterruptedException {
		Actions action = new Actions(driver);
  	element_Highlight eh= new element_Highlight();
  	
  	//get Code
		eh.highlightElement(driver, trapistSearchButtom);
		action.click(trapistSearchButtom).perform();
		eh.unhighlightLast(driver, trapistSearchButtom);
  	eh.highlightElement(driver, trapistCode);
		Thread.sleep(1000);
  	TrapistCodeWithTitle= trapistCode.getText();
		eh.unhighlightLast(driver, trapistCode);
		action.click(refreshButton).perform();

		
	    //split trapist code
		String substrings[] = TrapistCodeWithTitle.split(" "); 
		TrapistCode=substrings[2];
		
 	    //search code
		eh.highlightElement(driver, trapistCodeSearch);
		action.click(trapistCodeSearch).perform();
		action.sendKeys(TrapistCode).perform();
		Thread.sleep(1000);
		eh.unhighlightLast(driver, trapistCodeSearch);
		eh.highlightElement(driver, trapistSearchButtom);
		action.click(trapistSearchButtom).perform();
		eh.unhighlightLastB(driver, trapistSearchButtom);
		Thread.sleep(1000);
		Assert.assertTrue(TrapistCodeWithTitle.contains(TrapistCode));
		trapistNameSearch.clear();
		  	
    }

}
