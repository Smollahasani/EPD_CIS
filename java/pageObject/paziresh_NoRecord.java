package pageObject;

import org.testng.annotations.Test;

import cispackage.element_Highlight;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class paziresh_NoRecord {
      String NationalCode;
	  String name;
      String familyName;
	  String fatherName;
	  String meliat;
	  String sex;
	  String BirthDate;
	  String MahalTavalod;
	  String Tahol;
	  String shahr;
	  String Adress;
	  String Bime;
	  String Sandogh;
	  String BimeDate;
	  String Nesbat;
	  
		WebElement FamilyName;
		String FamilyName1;
		
		WebElement select;

		
		WebElement Trapist;
		String Trapist1;
		
		WebElement Clinic;
		String Clinic1;
		
		WebElement shift;
		String shift1;
		
		WebElement Computational;
		String Computational1;
		
		WebElement SerialBooklet;
		String SerialBooklet1;
		
		WebElement bookletPage;
		String bookletPage1;
		
		WebElement Service;
		String Service1;
		
		WebElement supplementary;
		String supplementary1;
		
		WebElement letternumber;
		String letternumber1;

		WebElement letterDate;
		String letterDate1;

		WebElement Percentage;
		String Percentage1;

		WebElement ceiling;
		String ceiling1;

		WebElement sabt;

		WebElement Switch;
		
		WebElement Lock;
		
		WebElement admitList;
		
		WebElement NationalCodeA;
		String NationalCode1;
		
		WebElement NationalCodeB;

	  
	  
	WebDriver driver;
	element_Highlight eh= new element_Highlight();


  @Test
  public void f() throws InterruptedException {
	  
	  

	
	  Thread.sleep(1000);
	  FamilyName = driver.findElement(By.name("FamilyName"));
      eh.highlightElement(driver, FamilyName);
      FamilyName.clear();
	  Thread.sleep(1000);
	  FamilyName.sendKeys(FamilyName1);
	  FamilyName.sendKeys(Keys.ENTER);
	  eh.unhighlightLastB(driver, FamilyName);
	  Thread.sleep(5000);
	  
//	  WebElement Popup1=driver.findElement(By.xpath("//*[@id=\"cdk-overlay-0\"]/snack-bar-container/simple-snack-bar/span\n"
//	  		+ ""));
//      eh.highlightElementA(driver, Popup1);
//	  Thread.sleep(1000);
//	  String B=Popup1.getText();
//	  System.out.println(B);
//	  Assert.assertEquals(B, "");
//	  eh.unhighlightLast(driver, Popup1);

	  
	  
	 //name
	 WebElement NAME =driver.findElement(By.name("name"));
     eh.highlightElement(driver, NAME);
	 NAME.sendKeys(name);
	 Thread.sleep(500);
	 eh.unhighlightLastB(driver, NAME);

	 //family
	 WebElement FAMILY = driver.findElement(By.name("familyName"));
	 FAMILY.clear();
     eh.highlightElement(driver, FAMILY);
	 FAMILY.sendKeys(familyName);
	 Thread.sleep(500);
	 eh.unhighlightLastB(driver, FAMILY);

     //father
	 WebElement FATHER =driver.findElement(By.name("fatherName"));
     eh.highlightElement(driver, FATHER);
	 FATHER.sendKeys(fatherName);
     Thread.sleep(2000);
	 eh.unhighlightLastB(driver, FATHER);

     //meliat
     WebElement MELIAT =driver.findElement(By.xpath(" /html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/app-add-patient-admit/form/div/div/div[1]/div[1]/div/div[2]/div[1]/div[3]/kendo-combobox/span/kendo-searchbar/input"));
    
     eh.highlightElement(driver, MELIAT);
     MELIAT.sendKeys(meliat);
     MELIAT.sendKeys(Keys.DOWN);
     Thread.sleep(500);
     MELIAT.sendKeys(Keys.ENTER);
	 eh.unhighlightLast(driver, MELIAT);

     
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	 //meliCode
     WebElement MELICODE =driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/app-add-patient-admit/form/div/div/div[1]/div[1]/div/div[2]/div[2]/div[1]/input"));
     MELICODE.click();
     eh.highlightElement(driver, MELICODE);
     MELICODE.sendKeys(NationalCode);
     Thread.sleep(500);
	 eh.unhighlightLastB(driver, MELICODE);
	 
	 WebElement upload_file = driver.findElement(By.xpath("//*[@id=\"file\"]"));
	 upload_file.sendKeys("C:/Users/s.mollahasani/Desktop/CIS/miss3.png");
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	 


     //passport
     //driver.findElement(By.id("PatientCode")).sendKeys("987546321");
     //sex
     WebElement SEX =driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/app-add-patient-admit/form/div/div/div[1]/div[1]/div/div[2]/div[2]/div[2]/kendo-combobox/span/kendo-searchbar/input"));
     eh.highlightElement(driver, SEX);
     Thread.sleep(500);
     SEX.sendKeys(sex);
     SEX.sendKeys(Keys.DOWN);
     SEX.sendKeys(Keys.ENTER);
	 eh.unhighlightLast(driver, SEX);

     //BirthDate
     WebElement BIRTHDATE =driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/app-add-patient-admit/form/div/div/div[1]/div[1]/div/div[2]/div[2]/div[3]/mat-form-field/div/div[1]/div[1]/input"));
     eh.highlightElement(driver, BIRTHDATE);
     Thread.sleep(500);
     BIRTHDATE.sendKeys(BirthDate);
	 eh.unhighlightLast(driver, BIRTHDATE);

     //BirthPlaceout
	 //driver.findElement(By.name("BirthPlaceOut")).sendKeys("MahalTavalod");
     //MahalTavalod
     WebElement BIRTHPLACE=driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/app-add-patient-admit/form/div/div/div[1]/div[1]/div/div[2]/div[2]/div[5]/kendo-combobox/span/kendo-searchbar/input"));
     BIRTHPLACE.clear();
     eh.highlightElement(driver, BIRTHPLACE);
     Thread.sleep(500);
     BIRTHPLACE.sendKeys(MahalTavalod);
     BIRTHPLACE.sendKeys(Keys.DOWN);
     BIRTHPLACE.sendKeys(Keys.ENTER);
	 eh.unhighlightLast(driver, BIRTHPLACE);

     //Tahol
     WebElement TAHOL=driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/app-add-patient-admit/form/div/div/div[1]/div[1]/div/div[2]/div[2]/div[6]/kendo-combobox/span/kendo-searchbar/input"));
     eh.highlightElement(driver, TAHOL);
     Thread.sleep(500);
     TAHOL.sendKeys(Tahol);
     TAHOL.sendKeys(Keys.DOWN);
     TAHOL.sendKeys(Keys.ENTER);
	 eh.unhighlightLast(driver, TAHOL);

     //shahr
     WebElement SHAHR=driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/app-add-patient-admit/form/div/div/div[1]/div[2]/div/div[2]/div[1]/div/div[2]/kendo-combobox/span/kendo-searchbar/input"));
     eh.highlightElement(driver, SHAHR);
     Thread.sleep(500);
     SHAHR.sendKeys(shahr);
     SHAHR.sendKeys(Keys.DOWN);
     SHAHR.sendKeys(Keys.ENTER);
	 eh.unhighlightLast(driver, SHAHR);

     //Adress
     WebElement ADRESS= driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/app-add-patient-admit/form/div/div/div[1]/div[2]/div/div[3]/kendo-textbox-container/textarea"));
     eh.highlightElement(driver, ADRESS);
     Thread.sleep(500);
     ADRESS.sendKeys(Adress);
     eh.unhighlightLastB(driver, ADRESS);

     //Phone
     int x= (int)(Math.random()*100000000);
     WebElement PHONE= driver.findElement(By.name("telNo"));
     eh.highlightElement(driver, PHONE);
     Thread.sleep(500);
     PHONE.sendKeys("0935"+x);
     eh.unhighlightLastB(driver, PHONE);

     //Email
     WebElement EMAIL= driver.findElement(By.name("EAddress"));
     eh.highlightElement(driver, EMAIL);
     Thread.sleep(500);
     EMAIL.sendKeys("test@hmail.com");
     eh.unhighlightLastB(driver, EMAIL);

     //Bime
     WebElement BIME= driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/app-add-patient-admit/form/div/div/div[2]/div/div[2]/div[1]/div[1]/kendo-combobox/span/kendo-searchbar/input"));
     eh.highlightElement(driver, BIME);
     Thread.sleep(500);
     BIME.sendKeys(Bime);
     BIME.sendKeys(Keys.DOWN);
     BIME.sendKeys(Keys.ENTER);
     eh.unhighlightLast(driver, BIME);

      //Sandogh
      Thread.sleep(1000);
      WebElement SANDOGH= driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/app-add-patient-admit/form/div/div/div[2]/div/div[2]/div[1]/div[2]/kendo-combobox/span/kendo-searchbar/input"));
      eh.highlightElement(driver, SANDOGH);
      Thread.sleep(500);
      SANDOGH.sendKeys(Sandogh);
      SANDOGH.sendKeys(Keys.DOWN);
      SANDOGH.sendKeys(Keys.ENTER);
      eh.unhighlightLast(driver, SANDOGH);

      //BimeCode
      int y= (int)(Math.random()*10000000);
      WebElement BIMECODE=driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/app-add-patient-admit/form/div/div/div[2]/div/div[2]/div[1]/div[3]/input"));
      eh.highlightElement(driver, BIMECODE);
      Thread.sleep(500);
      BIMECODE.sendKeys("1"+y);
      eh.unhighlightLastB(driver, BIMECODE);

      //BimeDate
      WebElement BIMEDATE=driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/app-add-patient-admit/form/div/div/div[2]/div/div[2]/div[2]/div[1]/mat-form-field/div/div[1]/div[1]/input"));
      eh.highlightElement(driver, BIMEDATE);
      Thread.sleep(500);
      BIMEDATE.sendKeys(BimeDate);
      eh.unhighlightLast(driver, BIMEDATE);

      //Nesbat
     WebElement NESBAT=driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/app-add-patient-admit/form/div/div/div[2]/div/div[2]/div[2]/div[2]/kendo-combobox/span/kendo-searchbar/input"));
     eh.highlightElement(driver, NESBAT);
     Thread.sleep(500);
      NESBAT.sendKeys(Nesbat);
      NESBAT.sendKeys(Keys.DOWN);
      NESBAT.sendKeys(Keys.ENTER);
      eh.unhighlightLast(driver, NESBAT);
      Thread.sleep(500);


      //Sabt
      WebElement sabt=  driver.findElement(By.xpath("/html/body/app-root/div/app-cis-layout/app-admit/div/div[2]/div[1]/div[2]/app-add-patient-admit/form/div/div/div[2]/div/div[3]/div/button"));
      eh.highlightElement(driver, sabt);
      Thread.sleep(500);
      eh.unhighlightLast(driver, sabt);
	  Thread.sleep(1000);
      sabt.click();
      Thread.sleep(1000);
     // WebElement POPUP= driver.findElement(By.xpath("/html/body/div[2]/div/div/snack-bar-container"));
     // WebElement POPUP= driver.findElement(By.xpath("/div/snack-bar-container/simple-snack-bar/span\n"
     // 		+ ""));


//      eh.highlightElement(driver, POPUP);
//      Thread.sleep(1000);
//      String c= POPUP.getText();
//      System.out.print("resulte:"+ c);
//      Assert.assertEquals(c, "پرونده بیمار با موفقیت ثبت شد.\n"
//      		+ "x");

    
	 
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\s.mollahasani\\webdriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
	   name="رز";
	   familyName="راوی";
	   fatherName="خرداد";
	   meliat="ایرانی";
	   sex="زن";
	   BirthDate="1369/09/23";
	   MahalTavalod="سراب";
	   Tahol="مجرد";
	   shahr="رشت";
	   Adress="خیابان صرن";
	   Bime="تامین اجتماعی";
	   Sandogh="بیمه اجباری";
	   BimeDate="1400/07/24";
	   Nesbat="پدر";
	   
	   FamilyName1="jmh";
	   Trapist1="مسعود";
	   Clinic1="جراحی";
	   shift1="ظهر";
		
		 Computational1="بستری";
		
		 SerialBooklet1="569";
		 
		 bookletPage1="2";
		
		 Service1="";
		
		 supplementary1="تامین اجتماعی";
		
		 letternumber1="687";

		 letterDate1="1400/07/13";

		 Percentage1="20";

		 ceiling1="25000";
		 
		 driver.get("http://mellicode.azmads.com/Home/");
		   WebElement Code = driver.findElement(By.xpath("/html/body/div[2]/div[1]/h2[2]"));
		   JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		   jsExecutor.executeScript("arguments[0].style.border='2px solid yellow'", Code); 
		   Thread.sleep(1000);
		   NationalCode = driver.findElement(By.xpath("/html/body/div[2]/div[1]/h2[2]")).getText();


		  driver.get("http://79.175.176.91:8027/");
		   driver.manage().window().maximize();
		   WebElement user= driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/div/div/div[3]/form/div[1]/div/input"));
		      eh.highlightElement(driver, user);
			  Thread.sleep(500);
			  user.sendKeys("0099820099");
			  eh.unhighlightLast(driver, user);
			  //JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			 // jsExecutor.executeScript("arguments[0].style.border='3px solid yellow'", user);  
			  Thread.sleep(500);
			  
		      WebElement pass= driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/div/div/div[3]/form/div[2]/div/input[2]"));
		      eh.highlightElement(driver, pass);
			  Thread.sleep(500);
			  pass.sendKeys("NZ0kdKF2");
			  eh.unhighlightLast(driver, pass);
			  Thread.sleep(500);

			  WebElement login= driver.findElement(By.xpath("//*[@id=\"login-schedule-btn\"]"));
		      eh.highlightElement(driver, login);
			  Thread.sleep(500);
			  login.click();
			  eh.unhighlightLast(driver, login);

			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  
			  WebElement cis= driver.findElement(By.xpath("/html/body/app-root/div/app-layout/div/div/div[2]/div/div[2]/his-home/div[1]/div/div/div/nav/div/div[2]/a/span"));
		      eh.highlightElement(driver, cis);
			  Thread.sleep(3000);
			  cis.click();
			  eh.unhighlightLast(driver, cis);
			  System.out.println(driver.getCurrentUrl());
			  //System.out.println(driver.getWindowHandles());
			  for(String window : driver.getWindowHandles() ) {
				  driver.switchTo().window(window);
			  }
			  Thread.sleep(3000);
	  
	   

  }
	   @AfterMethod
  public void afterMethod() {
		//driver.quit();
	  
  }

}
