package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import cispackage.element_Highlight;

public class PageObgect_AddTrapistToClinic{
	

	element_Highlight eh= new element_Highlight();
	
	String  ClinicName;
	String  ClinicNameAdded;
	String  TrapistName;
	String  TrapistNameAdded;



    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-clinic-therapist/div/div/div[2]/app-clinic-single/div/div[2]/kendo-textbox-container/input")
	WebElement clinicNameSearch;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-clinic-therapist/div/div/div[2]/app-clinic-single/div/div[2]/div[2]/div/div/div/mat-checkbox/label/div")
	WebElement clinicCheckbox;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-clinic-therapist/div/div/div[2]/app-clinic-single/div/div[2]/div[2]/div/div[1]/div")
	WebElement clinicName;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-clinic-therapist/div/div/div[3]/app-therapists/div[2]/div[2]/div/div[1]/div/div[2]/div[1]")
	WebElement trapistName;

    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-clinic-therapist/div/div/div[3]/app-therapists/div[1]/div[1]/div/div[1]")
	WebElement trapistSearchButtom;

    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-clinic-therapist/div/div/div[3]/app-therapists/div[1]/div[2]/div/div[1]/kendo-textbox-container/input")
	WebElement trapistNameSearch;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-clinic-therapist/div/div/div[3]/app-therapists/div[1]/div[2]/div/div[2]/kendo-textbox-container/input")
	WebElement trapistFamily;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-clinic-therapist/div/div/div[3]/app-therapists/div[1]/div[2]/div/div[3]/kendo-textbox-container/input")
	WebElement trapistCode;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-clinic-therapist/div/div/div[3]/app-therapists/div[2]/div[2]/div/div/div/div[1]/mat-checkbox/label/div")
	WebElement trapistCheckbox;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-clinic-therapist/div/div/div[1]/button")
	WebElement sabtBtton;
    
    @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-clinic-therapist/div/div/div[3]/app-therapists/div[1]/div[1]/div/div[1]")
	WebElement searchtBtton;

    
    public void AddPatientToClinic ( WebDriver driver ) throws InterruptedException {
    	
		Actions action = new Actions(driver);
    	element_Highlight eh= new element_Highlight();
    	
    	
	    //choose clinic
    	eh.highlightElement(driver, clinicCheckbox);
    	action.click(clinicCheckbox).perform();
		eh.unhighlightLast(driver, clinicCheckbox);
		Thread.sleep(1000);
		//choose trapist
		eh.highlightElement(driver, searchtBtton);
		action.click(searchtBtton).perform();
		eh.unhighlightLast(driver, searchtBtton);
    	eh.highlightElement(driver, trapistName);
		Thread.sleep(1000);
    	TrapistName= trapistName.getText();
		eh.unhighlightLast(driver, trapistName);
    	eh.highlightElement(driver, trapistCheckbox);
    	action.click(trapistCheckbox).perform();
		eh.unhighlightLast(driver, trapistCheckbox);
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
        WebElement addedTrtapist=driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-clinic-therapist/div/div/div[2]/app-clinic-single/div/div[2]/div[2]/div/div[1]/div/div/div/div/span"));
	    eh.highlightElement(driver, addedTrtapist);
		Thread.sleep(1000);
        TrapistNameAdded=addedTrtapist.getText();
        Assert.assertTrue(TrapistNameAdded.contains(TrapistName));
	}

}

