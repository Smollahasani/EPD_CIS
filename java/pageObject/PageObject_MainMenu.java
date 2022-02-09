package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cispackage.element_Highlight;

public class PageObject_MainMenu {
	
	  element_Highlight eh= new element_Highlight();


	   @FindBy(className="menu-btn")
	   WebElement main_menu;
	   
	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-menu/nav/ul/li[4]/a/span")
	   WebElement add_patient;
	   
	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-menu/nav/ul/li[5]/a/span")
	   WebElement list_patient;
	   
	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-menu/nav/ul/li[2]/a/span")
	   WebElement Admit_list;
	   
	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-menu/nav/ul/li[8]/a/span")
	   WebElement system_config;
	   
	   @FindBy(xpath="/html/body/app-root/div/app-cis-layout/app-menu/nav/ul/li[8]/ul/li[4]/a/span")
	   WebElement system_variable;




	   public void add_patient_menu ( WebDriver driver) throws InterruptedException {
	   
	   eh.highlightElement(driver,main_menu);
	    main_menu.click();
	    Thread.sleep(1000);
	    eh.highlightElement(driver,add_patient);
	    add_patient.click();
	    Thread.sleep(500);
	   }
	   
	   public void list_patient_menu (WebDriver driver) throws Throwable   {
	   eh.highlightElement(driver,main_menu);
	    main_menu.click();
	    Thread.sleep(1000);
	    eh.highlightElement(driver,list_patient);
	    list_patient.click();
	    Thread.sleep(500);   
}	   
	   public void Admit_List_menu (WebDriver driver) throws Throwable   {
	   eh.highlightElement(driver,main_menu);
	    main_menu.click();
	    Thread.sleep(1000);
	    eh.highlightElement(driver,Admit_list);
	    Admit_list.click();
	    Thread.sleep(500);   
}	   
	   public void system_variable_menu (WebDriver driver) throws Throwable   {
	   eh.highlightElement(driver,main_menu);
	    main_menu.click();
	    Thread.sleep(1000);
	    eh.highlightElement(driver,system_config);
	    system_config.click();
	    Thread.sleep(500); 
	    WebElement system_variable =driver.findElement(By.xpath"/html/body/app-root/div/app-cis-layout/app-menu/nav/ul/li[8]/a/span");
	    eh.highlightElement(driver,system_variable);
	    system_variable.click();
	    Thread.sleep(500);  
}	   

	   
}

   
   
   