package Tests;

import org.testng.annotations.Test;

import Pages.AutomationPracticePage;
import Utilities.ExcelUtils;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import Base.BaseTest;
import org.testng.annotations.Listeners;
import Listeners.TestListener;
@Listeners(TestListener.class)
public class AutomationPracticeTest extends BaseTest {
 
  AutomationPracticePage page;
 
  @DataProvider(name = "userData")
  public Object[][] getData() {
	  return ExcelUtils.getExcelData();
  }
 @Test(priority = 1, dataProvider = "userData",groups = {"Smoke"})
 public void Select_field(String nameData,String emailData,String phoneData,String addressData,String gender) {

     driver.navigate().refresh();
     
     page = new AutomationPracticePage(driver);
     page.Select_field(nameData, emailData, phoneData, addressData, gender);

	 System.out.println("All fields entered successfully");
	  
  }
  @Test(priority = 2,groups = {"Smoke"})
  public void Date_picker() {
	  
	  page = new AutomationPracticePage(driver);
	  page.Date_picker();
	  System.out.println("Dates are filled successfully");
	  
  }
  @Test(priority = 3,groups = {"Smoke"})
  public void Upload_files() {
	  
	  page = new AutomationPracticePage(driver);
	  page.Upload_files();
	  System.out.println("File uploaded successfully");
	  
  }
  @Test(priority = 4,groups = {"Smoke"})
  public void alerts() {
	page = new AutomationPracticePage(driver);
	page.alerts();
	System.out.println("All alerts handled successfully");
  }
  @Test(priority = 5,groups = {"Smoke"})
  public void Tabs(){
	  page = new AutomationPracticePage(driver);
	  page.Tabs();
	  System.out.println("Tab is working properly");
  }
  @Test(priority = 6,groups = {"Smoke"})
  public void Actions() {
	  page = new AutomationPracticePage(driver);
	  page.Actions();
	 
	  System.out.println("All actions performed successfully");

  }
@Test(priority = 7,groups = {"Smoke"})
public void Form() {
	page = new AutomationPracticePage(driver);
	page.Form();

	System.out.println("Shadow DOM & Form automation completed");

}
@Test(priority = 8,groups = {"Smoke"})
public void Pop_up() throws InterruptedException  {
	page = new AutomationPracticePage(driver);
	page.Pop_up();
	System.out.println("Popup Window handled successfully");


}
@Test(priority = 9,groups = {"Smoke"})
public void Links() throws InterruptedException, IOException  {
	page = new AutomationPracticePage(driver);
	page.Links();
	System.out.println("Errors are handled Successfully");	
	
}

}
