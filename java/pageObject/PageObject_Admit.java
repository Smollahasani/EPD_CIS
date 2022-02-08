package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cispackage.element_Highlight;

public class PageObject_Admit {
	
	  element_Highlight eh= new element_Highlight();

      WebDriver driver;

	   @FindBy(name="NationalCode")
	   WebElement NationalCode;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/app-admit-patient-search/div[1]/form/div[2]/div[2]/div/div[1]/div[1]/div/div[1]/kendo-combobox/span/kendo-searchbar/input")
	   WebElement Meliat;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/app-admit-patient-search/div[1]/form/div[2]/div[2]/div/div[1]/div[1]/div/div[1]/kendo-combobox/span/span[1]")
	   WebElement ClearMeliat;
	   
	   @FindBy(name="ElectronicNumber")
	   WebElement ElectronicNumber;

	   @FindBy(name="Name")
	   WebElement Name;

	   @FindBy(name="FamilyName")
	   WebElement FamilyName;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/div/div/div[1]/app-admit-form/form/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div/div/kendo-combobox/span/kendo-searchbar/input")
	   WebElement Trapist;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/div/div/div[1]/app-admit-form/form/div/div[1]/div/div[2]/div[1]/div/div[1]/div/div/div/kendo-combobox/span/kendo-searchbar/input")
	   WebElement Clinic;

	   @FindBy(id="filterAfterEdit")
	   WebElement FilterAfterEdit;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/div/div/div[1]/app-admit-form/form/div/div[1]/div/div[3]/kendo-combobox/span/kendo-searchbar/input")
	   WebElement Assistant;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/div/div/div[1]/app-admit-form/form/div/div[1]/div/div[4]/div[1]/div/kendo-combobox/span/kendo-searchbar/input")
	   WebElement Shift;
	   
	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/div/div/div[1]/app-admit-form/form/div/div[1]/div/div[4]/div[1]/div/kendo-combobox/span/span[1]")
	   WebElement ClearShift;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/div/div/div[1]/app-admit-form/form/div/div[2]/div/div[1]/kendo-combobox/span/kendo-searchbar/input")
	   WebElement Model;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/div/div/div[2]/app-admit-service-search/div/div/div/div[1]/div[1]/div[1]/div/kendo-combobox/span/kendo-searchbar/input")
	   WebElement ServicesCombo;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/div/div/div[2]/app-admit-service-search/div/div/div/div[1]/div[1]/div[1]/div/kendo-combobox/span/span[1]")
	   WebElement ClearServicesCombo;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/div/div/div[2]/app-admit-service-search/div/div/div/div[1]/div[1]/div[5]/div/div[1]/a/img")
	   WebElement SearchServices;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-admit/div/div[1]/button[3]")
	   WebElement Sabt;


        public void Admit_Exisingt_Patient_ElectronicNumber (WebDriver driver, String electronicNumber ) throws InterruptedException {
        	
			 Actions action = new Actions(driver);
		     eh.highlightElement(driver, ElectronicNumber);
		     action.click(ElectronicNumber).perform();
		     action.sendKeys(electronicNumber).perform();
			 Thread.sleep(500);
			 action.sendKeys(Keys.ENTER).perform();
			 eh.unhighlightLastB(driver, ElectronicNumber);
			
        }
	   
        public void Admit_Exisingt_Patient_Name (WebDriver driver, String name ,String familyName) throws InterruptedException {
        	
			 Actions action = new Actions(driver);
		     eh.highlightElement(driver, Name);
		     action.click(Name).perform();
		     action.sendKeys(name).perform();
			 Thread.sleep(500);
			 eh.unhighlightLastB(driver, Name);
		     eh.highlightElement(driver, FamilyName);
		     action.click(FamilyName).perform();
		     action.sendKeys(familyName).perform();
		     eh.highlightElement(driver, FamilyName);
			 action.sendKeys(Keys.ENTER).perform();

			
       }
        
        public void Admit_Exisingt_NationalCode (WebDriver driver, String nationalCode ) throws InterruptedException {
        	
			 Actions action = new Actions(driver);
		     eh.highlightElement(driver, NationalCode);
		     action.click(NationalCode).perform();
		     action.sendKeys(nationalCode).perform();
			 Thread.sleep(500);
			 eh.unhighlightLastB(driver, NationalCode);
			 action.sendKeys(Keys.ENTER).perform();
			
       }

	   
        public void Admit_Data (WebDriver driver, String clinic,String trapist, String assistant, String shift, String model) throws InterruptedException {
        	
			 Actions action = new Actions(driver);
			 //AddClinic
		     eh.highlightElement(driver, Clinic);
		     action.click(Clinic).perform();
		     action.sendKeys(clinic).perform();
		     action.sendKeys(Keys.DOWN).perform();
		     action.sendKeys(Keys.ENTER).perform();
		     eh.unhighlightLastB(driver, Clinic);
			 Thread.sleep(1000);
			 //AddTrapist
		     eh.highlightElement(driver, Trapist);
		     action.click(Trapist).perform();
		     action.sendKeys(trapist).perform();
		     action.sendKeys(Keys.DOWN).perform();
		     action.sendKeys(Keys.ENTER).perform();
			 eh.unhighlightLastB(driver, Trapist);
			 Thread.sleep(1000);
		     //AddAssistant
		     eh.highlightElement(driver, Assistant);
		     action.click(Assistant).perform();
		     action.sendKeys(assistant).perform();
		     eh.unhighlightLastB(driver, Assistant);
		     //AddShift
		     eh.highlightElement(driver, Shift);
		     action.click(ClearShift).perform();
			 Thread.sleep(500);
		     action.click(Shift).perform();
		     action.sendKeys(shift).perform();
		     eh.unhighlightLastB(driver, Shift);
		     Thread.sleep(1000);
		     //AddModel
		     eh.highlightElement(driver, Model);
		     action.click(Model).perform();
		     action.sendKeys(model).perform();
		     eh.unhighlightLastB(driver, Model);
		     Thread.sleep(1000);
		     //AddServicesList
		     eh.highlightElement(driver, SearchServices);
		     action.click(SearchServices).perform();
		     eh.unhighlightLastB(driver, SearchServices);
		     Thread.sleep(1000);
		     //AddServices
		     WebElement SelectServices1=driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/div/div/div[2]/app-admit-service-search/div/div/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]"));
		     eh.highlightElement(driver, SelectServices1);
		     action.click(SelectServices1).perform();
		     eh.unhighlightLastB(driver, SelectServices1);
		     Thread.sleep(500);
		     //AddServices
		     WebElement SelectServices5= driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/div/div/div[2]/app-admit-service-search/div/div/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[5]"));
		     eh.highlightElement(driver, SelectServices5);
		     action.click(SelectServices5).perform();
		     eh.unhighlightLastB(driver, SelectServices5);
		     Thread.sleep(500);
		     //Sabt
		     eh.highlightElement(driver, Sabt);
		     action.click(Sabt).perform();
		     eh.unhighlightLastB(driver, Sabt);
		     //SuccesfulAdmit
		     WebElement POPUP= driver.findElement(By.xpath("/html/body/div[2]/div/div/snack-bar-container"));
		      eh.highlightElement(driver, POPUP);
		      Thread.sleep(1000);
		      String c= driver.findElement(By.xpath("/html/body/div[2]/div/div/snack-bar-container")).getText();
		      System.out.print("resulte:"+ c);
		      Assert.assertEquals(c, "پذیرش بیمار با موفقیت ثبت شد.\n"
		      		+ "x");
		      Thread.sleep(1000);
	
       }

        
}

