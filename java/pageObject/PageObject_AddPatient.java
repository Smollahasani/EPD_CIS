package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import cispackage.element_Highlight;

public class PageObject_AddPatient {
	
	element_Highlight eh= new element_Highlight();

     WebDriver driver;


	
	   @FindBy(name="name")
	   WebElement NAME;

	   @FindBy(name="familyName")
	   WebElement FAMILY;

	   @FindBy(name="fatherName")
	   WebElement FATHER;

	   @FindBy(name="NationalCode")
	   WebElement MELICODE;

	   @FindBy(id="PatientCode")
	   WebElement Passport;

	   @FindBy(xpath="//*[@id=\\\"file\\\"]\"")
	   WebElement Avatar;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-add-patient/form/div[2]/div[2]/div[1]/div[3]/div[2]/kendo-combobox/span/kendo-searchbar/input")
	   WebElement sex;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-add-patient/form/div[2]/div[2]/div[1]/div[3]/div[4]/mat-form-field/div/div[1]/div[1]/input")
	   WebElement birthdate;

	   @FindBy(name="BirthPlaceOut")
	   WebElement birthPlace;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-add-patient/form/div[2]/div[2]/div[1]/div[3]/div[7]/kendo-combobox/span/kendo-searchbar/input")
	   WebElement mahaltavalod;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-add-patient/form/div[2]/div[2]/div[1]/div[3]/div[3]/kendo-combobox/span/kendo-searchbar/input")
	   WebElement tahol;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-add-patient/form/div[2]/div[2]/div[1]/div[4]/div/div[2]/div[1]/div[2]/kendo-combobox/span/kendo-searchbar/input")
	   WebElement city;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-add-patient/form/div[2]/div[2]/div[1]/div[4]/div/div[3]/kendo-textbox-container/textarea")
	   WebElement adress;

	   @FindBy(name="telNo")
	   WebElement PHONE;

	   @FindBy(name="EAddress")
	   WebElement eMAIL;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-add-patient/form/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/kendo-combobox/span/kendo-searchbar/input")
	   WebElement bime;
	   
	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-add-patient/form/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/kendo-combobox/span/kendo-searchbar/input")
	   WebElement sandogh;
	   
	   @FindBy(name="InsuranceNo")
	   WebElement BIMECODE;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-add-patient/form/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/mat-form-field/div/div[1]/div[1]/input")
	   WebElement bimedate;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-add-patient/form/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/kendo-combobox/span/kendo-searchbar/input")
	   WebElement nesbat;

	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-add-patient/form/div[1]/button[1]")
	   WebElement Sabt;
	   
	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-add-patient/form/div[2]/div[2]/div[1]/div[2]/div[5]/kendo-combobox/span/kendo-searchbar/input")
	   WebElement meliat;
	   
	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-add-patient/form/div[2]/div[2]/div[1]/div[2]/div[5]/kendo-combobox/span/span[1]")
	   WebElement clearmeliat;
	   
	   @FindBy(name="oldId")
	   WebElement oldId;


	   
	   public void AddPatient (WebDriver driver, String Name ,String Family ,String Father
				 ,String Avatar,String Sex ,String TAHOL ,String BIRTHDATE ,String Mahaltavalod 
				  ,String City ,String Adress ,String Email ,String BIME ,String SANDOGH ,String BIMEDATE ,String NESBAT,String Meliat,String OLDID) throws Throwable {
		   
			 Actions action = new Actions(driver);

		     //name
		     eh.highlightElement(driver, NAME);
		     action.click(NAME).perform();
		     action.sendKeys(Name).perform();
			 Thread.sleep(500);
			 eh.unhighlightLastB(driver, NAME);
			 
             //family
		     eh.highlightElement(driver, FAMILY);
		     action.click(FAMILY).perform();
			 action.sendKeys(Family).perform();
			 Thread.sleep(500);
			 eh.unhighlightLastB(driver, FAMILY);
			 
             //father name
		     eh.highlightElement(driver, FATHER);
		     action.click(FATHER).perform();
			 action.sendKeys(Father).perform();
		     Thread.sleep(2000);
			 eh.unhighlightLastB(driver, FATHER);
			 
			 //meliat
		     eh.highlightElement(driver, meliat);
		     action.click(meliat).perform();
		     action.click(clearmeliat).perform();
		     Thread.sleep(1000);
			 action.sendKeys(Meliat).perform();
		     Thread.sleep(2000);
			 eh.unhighlightLastB(driver, meliat);

			 

			  //Avatar
			  WebElement upload_file = driver.findElement(By.xpath("//*[@id=\"file\"]"));
			  upload_file.sendKeys(Avatar);
			  //upload_file.sendKeys("C:/Users/s.mollahasani/Desktop/CIS/mr2.png");
			  
              //sex
			  eh.highlightElement(driver, sex);
			  Thread.sleep(500);
			  action.click(sex).perform();
			  action.sendKeys(Sex).perform();
			  eh.unhighlightLast(driver, sex);
			  
			//TAHOL
		      eh.highlightElement(driver, tahol);
		      Thread.sleep(500);
		      action.click(tahol).perform();
		      action.sendKeys(TAHOL).perform();
    		  eh.unhighlightLast(driver, tahol);


			  //tarikh tavalod
			  eh.highlightElement(driver, birthdate);
			  Thread.sleep(500);
			  birthdate.sendKeys(BIRTHDATE);
		      eh.unhighlightLast(driver, birthdate);
		      
		      //mahal tavalod
		      eh.highlightElement(driver, mahaltavalod);
		      Thread.sleep(500);
		      action.click(mahaltavalod).perform();
		      action.sendKeys(Mahaltavalod).perform();
		 	  eh.unhighlightLast(driver, mahaltavalod);
		 	  
		 	      		  
    		  //city
    		  eh.highlightElement(driver, city);
    		  Thread.sleep(500);
    		  action.click(city).perform();
    		  action.sendKeys(City).perform();
    	      eh.unhighlightLast(driver, city);
    	      
    	      //Adress
    	      eh.highlightElement(driver, adress);
    	      Thread.sleep(500);
    	      adress.sendKeys(Adress);
    	      eh.unhighlightLastB(driver, adress);
    	      
    	      //Phone
    	      int x= (int)(Math.random()*100000000);
    	      WebElement PHONE= driver.findElement(By.name("telNo"));
    	      eh.highlightElement(driver, PHONE);
    	      Thread.sleep(500);
    	      PHONE.sendKeys("0935"+x);
    	      eh.unhighlightLastB(driver, PHONE);
    	      
    	      //Email
    	      //WebElement EMAIL= driver.findElement(By.name("EAddress"));
    	      eh.highlightElement(driver, eMAIL);
    	      Thread.sleep(500);
    	      eMAIL.sendKeys(Email);
    	      eh.unhighlightLastB(driver, eMAIL);
    	      
    	      //Bime
    	      eh.highlightElement(driver, bime);
    	      Thread.sleep(500);
    	      action.click(bime).perform();
    	      action.sendKeys(BIME).perform();
    	      eh.unhighlightLast(driver, bime);
    	      
    	      //Sandogh
    	      Thread.sleep(1000);
    	      eh.highlightElement(driver, sandogh);
    	      Thread.sleep(500);
    	      action.click(sandogh).perform();
    	      action.sendKeys(SANDOGH).perform();
    	      eh.unhighlightLast(driver, sandogh);

    	      //BimeCode
    	      int y= (int)(Math.random()*10000000);
    	      WebElement BIMECODE=driver.findElement(By.name("InsuranceNo"));
    	      eh.highlightElement(driver, BIMECODE);
    	      Thread.sleep(500);
    	      BIMECODE.sendKeys("1"+y);
    	      eh.unhighlightLastB(driver, BIMECODE);

    	      //BimeDate
    	      eh.highlightElement(driver, bimedate);
    	      Thread.sleep(500);
    	      bimedate.sendKeys(BIMEDATE);
    	      eh.unhighlightLast(driver, bimedate);

    	      //Nesbat
    	     eh.highlightElement(driver, nesbat);
    	     Thread.sleep(500);
    	     action.click(nesbat).perform();
    	     action.sendKeys(NESBAT).perform();
    	      eh.unhighlightLast(driver, nesbat);
    	      Thread.sleep(500);
    	      
    	      //OldId
    	      eh.highlightElement(driver, oldId);
    	      Thread.sleep(500);
    	      eMAIL.sendKeys(OLDID);
    	      eh.unhighlightLastB(driver,oldId);


    	      //Sabt
    	      eh.highlightElement(driver, Sabt);
    	      Thread.sleep(500);
    	      eh.unhighlightLast(driver, Sabt);
    		  Thread.sleep(1000);
    		  Sabt.click();
    	      Thread.sleep(1000);
    	      
    	      //SuccecfulAddMessage
    	      WebElement POPUP= driver.findElement(By.xpath("/html/body/div[2]/div/div/snack-bar-container"));
    	      eh.highlightElement(driver, POPUP);
    	      Thread.sleep(1000);
    	      String c= POPUP.getText();
    	      System.out.print("resulte:"+ c);
    	      Assert.assertEquals(c, "پرونده بیمار با موفقیت ثبت شد.\n"
    	      		+ "x");
          		   } 
	   
	   public void AddPatientForeign (WebDriver driver, String Name ,String Family ,String Father
				 ,String Avatar,String Sex ,String TAHOL ,String BIRTHDATE ,String Mahaltavalod 
				  ,String City ,String Adress ,String Email ,String BIME ,String BIMEDATE ,String NESBAT ,String OLDID) throws Throwable {
		   
			 Actions action = new Actions(driver);

		     //name
		     eh.highlightElement(driver, NAME);
		     action.click(NAME).perform();
		     action.sendKeys(Name).perform();
			 Thread.sleep(500);
			 eh.unhighlightLastB(driver, NAME);
			 
             //family
		     eh.highlightElement(driver, FAMILY);
		     action.click(FAMILY).perform();
			 action.sendKeys(Family).perform();
			 Thread.sleep(500);
			 eh.unhighlightLastB(driver, FAMILY);
			 
             //father name
		     eh.highlightElement(driver, FATHER);
		     action.click(FATHER).perform();
			 action.sendKeys(Father).perform();
		     Thread.sleep(2000);
			 eh.unhighlightLastB(driver, FATHER);
			 

			  //Avatar
			  WebElement upload_file = driver.findElement(By.xpath("//*[@id=\"file\"]"));
			  upload_file.sendKeys(Avatar);
			  //upload_file.sendKeys("C:/Users/s.mollahasani/Desktop/CIS/mr2.png");
			  
              //jensiat
			  eh.highlightElement(driver, sex);
			  Thread.sleep(500);
			  action.click(sex).perform();
			  action.sendKeys(Sex).perform();
			  eh.unhighlightLast(driver, sex);
			  
			//TAHOL
		      eh.highlightElement(driver, tahol);
		      Thread.sleep(500);
		      action.click(tahol).perform();
		      action.sendKeys(TAHOL).perform();
    		  eh.unhighlightLast(driver, tahol);


			  //tarikh tavalod
			  eh.highlightElement(driver, birthdate);
			  Thread.sleep(500);
			  birthdate.sendKeys(BIRTHDATE);
		      eh.unhighlightLast(driver, birthdate);
		      
		      //mahal tavalod
		    WebElement birthPlace= driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-add-patient/form/div[2]/div[2]/div[1]/div[3]/div[5]/input"));
		      eh.highlightElement(driver, birthPlace);
		      Thread.sleep(500);
		      action.click(birthPlace).perform();
		      action.sendKeys(Mahaltavalod).perform();
		 	  eh.unhighlightLast(driver, birthPlace);
		 	  
		 	      		  
    		  //city
    		  eh.highlightElement(driver, city);
    		  Thread.sleep(500);
    		  action.click(city).perform();
    		  action.sendKeys(City).perform();
    	      eh.unhighlightLast(driver, city);
    	      
    	      //Adress
    	      eh.highlightElement(driver, adress);
    	      Thread.sleep(500);
    	      adress.sendKeys(Adress);
    	      eh.unhighlightLastB(driver, adress);
    	      
    	      //Phone
    	      int x= (int)(Math.random()*100000000);
    	      WebElement PHONE= driver.findElement(By.name("telNo"));
    	      eh.highlightElement(driver, PHONE);
    	      Thread.sleep(500);
    	      PHONE.sendKeys("0935"+x);
    	      eh.unhighlightLastB(driver, PHONE);
    	      
    	      //Email
    	      eh.highlightElement(driver, eMAIL);
    	      Thread.sleep(500);
    	      eMAIL.sendKeys(Email);
    	      eh.unhighlightLastB(driver, eMAIL);
    	      
    	      //Sabt
    	      eh.highlightElement(driver, Sabt);
    	      Thread.sleep(500);
    	      eh.unhighlightLast(driver, Sabt);
    		  Thread.sleep(1000);
    		  Sabt.click();
    	      Thread.sleep(1000);
    	      
    	      //SuccecfulAddMessage
    	      WebElement POPUP= driver.findElement(By.xpath("/html/body/div[2]/div/div/snack-bar-container"));
    	      eh.highlightElement(driver, POPUP);
    	      Thread.sleep(1000);
    	      String c= POPUP.getText();
    	      System.out.print("resulte:"+ c);
    	      Assert.assertEquals(c, "پرونده بیمار با موفقیت ثبت شد.\n"
    	      		+ "x");

		   
	   }
	   
	  
}
