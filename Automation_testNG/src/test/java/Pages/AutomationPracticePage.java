package Pages;

import java.io.File;
import java.io.IOException;
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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AutomationPracticePage {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	//Select_field
	By Name=By.id("name");
	By Email=By.id("email");
	By Phone=By.id("phone");
	By Address=By.id("textarea");
	By Male=By.id("male");
	By Female=By.id("female");
	By Day1=By.id("sunday");
	By Day2=By.id("tuesday");
	By Country=By.id("country");
	By Colors=By.id("colors");
	By Animals=By.id("animals");
	//Date_picker
	By Date_picker1=By.id("datepicker");
	By Date1=By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[4]/a");
	By Date_picker2=By.id("txtDate");
	By Date2=By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[7]/a");
	By Start_date=By.id("start-date");
	By End_date=By.id("end-date");
	By Submit_button=By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[8]/button");
	//Upload_files
	By Single_input=By.id("singleFileInput");
	By Multiple_input=By.id("multipleFilesInput");
	//alerts
	By Alrt_btn=By.id("alertBtn");
	By conf_btn=By.id("confirmBtn");
	By prmpt_btn=By.id("promptBtn");
	//Tabs
	By Tabs=By.id("Wikipedia1_wikipedia-search-input");
	//Actions
	By Dyn_click=By.xpath("//*[@id=\"HTML5\"]/div[1]/button");
	By Dub_click=By.xpath("//*[@id=\"HTML10\"]/div[1]/button");
	By Drag=By.id("draggable");
	By Drop=By.id("droppable");
	By Mouse=By.xpath("//*[@id=\"HTML3\"]/div[1]/div/button");
	By Slider=By.xpath("(//span[@class=\"ui-slider-handle ui-corner-all ui-state-default\"])[1]");
	By Combobox=By.id("comboBox");
	By Scroll=By.xpath("//*[@id=\"dropdown\"]/div[4]");
	//Forms
	By Sel1=By.xpath("//*[@id=\"productTable\"]/tbody/tr[2]/td[4]/input");
	By Sel2=By.xpath("//*[@id=\"productTable\"]/tbody/tr[1]/td[4]/input");
	By Input1=By.id("input1");
	By Btn1=By.id("btn1");
	By Input2=By.id("input2");
	By Btn2=By.id("btn2");
	By Input3=By.id("input3");
	By Btn3=By.id("btn3");
	By Shadow_host=By.id("shadow_host");
	By Text=By.cssSelector("input[type='text']");
	By Box=By.cssSelector("input[type='checkbox']");
	By File=By.cssSelector("input[type='file']");
	//Pop-up & New tab
	By New_tab=By.xpath("//button[normalize-space()='New Tab']");
	By Pop_up=By.xpath("//*[@id=\"PopUp\"]");
	//Links
	By Link1=By.linkText("Lenovo");
	By Error1=By.linkText("Errorcode 404");
	By Error2=By.linkText("Errorcode 500");
	
	
	public AutomationPracticePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Select_field(String nameData, String emailData,
            String phoneData, String addressData,
            String gender) {
		
		driver.findElement(Name).sendKeys(nameData);
        driver.findElement(Email).sendKeys(emailData);
        driver.findElement(Phone).sendKeys(phoneData);
        driver.findElement(Address).sendKeys(addressData);

        if(gender.equalsIgnoreCase("Male")) {
            driver.findElement(Male).click();
        }
        else {
            driver.findElement(Female).click();
        }

        driver.findElement(Day1).click();
        driver.findElement(Day2).click();

        WebElement coun=driver.findElement(Country);
   	    coun.click();
   	    coun.sendKeys("Canada");
   	    coun.sendKeys(Keys.ENTER);
   	    WebElement col=driver.findElement(Colors);
   	    Select col1=new Select(col);
   	    col1.selectByValue("red");
   	    WebElement sort=driver.findElement(Animals);
   	    Select sort1=new Select(sort);
   	    sort1.selectByValue("cheetah");
	}
	
	public void Date_picker() {
		driver.findElement(Date_picker1).click();
		driver.findElement(Date1).click();
		driver.findElement(Date_picker2).click();
		driver.findElement(Date2).click();
		driver.findElement(Start_date).sendKeys("05-06-2026");
		driver.findElement(End_date).sendKeys("17-06-2026");
		driver.findElement(Submit_button).click();
	}
	public void Upload_files() {
		WebElement upload=driver.findElement(Single_input);
		upload.sendKeys("C:\\Users\\HP\\Downloads\\Ayan.png");
		WebElement upload1=driver.findElement(Multiple_input);
		upload1.sendKeys("C:\\Users\\HP\\Downloads\\Ayan.png");
		upload1.sendKeys("C:\\Users\\HP\\Downloads\\Ayan Mal Photo 3.jpeg");
	}
	public void alerts() {
		//Simple alert
		driver.findElement(Alrt_btn).click();
		driver.switchTo().alert().accept();
		//confirmation alert
		driver.findElement(conf_btn).click();
		driver.switchTo().alert().dismiss();
		//prompt Alert
		driver.findElement(prmpt_btn).click();
		Alert alert= driver.switchTo().alert();
		alert.sendKeys("Welcome to java");
		alert.accept();
	}
	public void Tabs() {
		WebElement tab=driver.findElement(Tabs);
		tab.click();
		tab.sendKeys("Hii");
		tab.sendKeys(Keys.ENTER);
	}
	public void Actions() {
//dynamic click
		WebElement dcc=driver.findElement(Dyn_click);
		Actions ac1=new Actions(driver);
		ac1.moveToElement(dcc).click().perform();
//Double click
		WebElement dc=driver.findElement(Dub_click);
		Actions ac2=new Actions(driver);
		ac2.doubleClick(dc).perform();
//Drag and Drop
		 WebElement sr=driver.findElement(Drag);
		 WebElement tg=driver.findElement(Drop);
		 Actions ac=new Actions(driver);
		 ac.dragAndDrop(sr, tg).perform();	
//Mouse hover
         WebElement moc=driver.findElement(Mouse);
         ac.moveToElement(moc).perform();
//slider 
		 WebElement sr1=driver.findElement(Slider);
         Actions ac3=new Actions(driver);
         ac3.dragAndDropBy(sr1, 50, 0).perform();// move right   
//Scrolling drop down 
         driver.findElement(Combobox).click();
         WebElement sdd=driver.findElement(Scroll);
         sdd.click();
	}
	public void Form() {
		//Pagination
		driver.findElement(Sel1).click();
		driver.findElement(Sel2).click();
		//Form
		WebElement sec1=driver.findElement(Input1);
		sec1.sendKeys("Nice to");
		driver.findElement(Btn1).click();
		WebElement sec2=driver.findElement(Input2);
		sec2.sendKeys("Meet");
		driver.findElement(Btn2).click();
		WebElement sec3=driver.findElement(Input3);
		sec3.sendKeys("You");
		driver.findElement(Btn3).click();
		//Shadowdom
		WebElement shadowHost = driver.findElement(Shadow_host);
		SearchContext shadowRoot = shadowHost.getShadowRoot();
		shadowRoot.findElement(Text).sendKeys("Everything will be ok");
		shadowRoot.findElement(Box).click();
		shadowRoot.findElement(File).sendKeys("C:\\Users\\HP\\Downloads\\Ayan.png");
	}
	public void Pop_up() throws InterruptedException {
		 // New Tab 
		String mainWindowHandle=driver.getWindowHandle();
		WebElement newTabBtn=driver.findElement(New_tab);
		newTabBtn.click();
	    Thread.sleep(2000);
	    

	    Set<String> allHandles = driver.getWindowHandles();
	    for (String handle : allHandles) {
	        if (!handle.equals(mainWindowHandle)) {
	            driver.switchTo().window(handle);
	            System.out.println("Switched to New Tab URL: " + driver.getCurrentUrl());
	            driver.close();
	            Thread.sleep(2000);
	            System.out.println("New tab closed");
	            break;
	        }
	    }
	    driver.switchTo().window(mainWindowHandle);
	    Thread.sleep(2000);
	    //Popup Window
		
	    WebElement popupBtn=driver.findElement(Pop_up);
	    popupBtn.click();
	    Thread.sleep(2000);

	    allHandles = driver.getWindowHandles();
	    for (String handle : allHandles) {
	        if (!handle.equals(mainWindowHandle)) {
	            driver.switchTo().window(handle);
	            System.out.println(" Switch to Popup Window URL: " + driver.getCurrentUrl());
	            driver.manage().window().maximize();
	            Thread.sleep(2000);
	            driver.close(); 
	            break;  
	        }
	    }
	    driver.switchTo().window(mainWindowHandle);
	}
	public void Links() throws InterruptedException, IOException {
		//Validate the Lenovo link using assert 
		WebElement brklink = driver.findElement(Link1);
		brklink.click();

		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.lenovo.com/in/en/"; 

		Assert.assertEquals(actualUrl, expectedUrl,
		        "URL validation failed!");

		System.out.println("URL validation passed");

		// Go back to previous page
		driver.navigate().back();
		Thread.sleep(2000);

		//Broken Links
		WebElement brklink1=driver.findElement(Error1);
		brklink1.click();
		Thread.sleep(2000);
		TakesScreenshot err1=(TakesScreenshot)driver;
		File sc=err1.getScreenshotAs(OutputType.FILE);
		File dest=new File("Error1.png");
		FileHandler.copy(sc, dest);
		Thread.sleep(2000);

		// Go back to previous page
		driver.navigate().back();
		Thread.sleep(2000);
		
		WebElement brklink2=driver.findElement(Error2);
		brklink2.click();
		Thread.sleep(2000);
		TakesScreenshot err2=(TakesScreenshot)driver;
		File sc1=err2.getScreenshotAs(OutputType.FILE);
		File dest1=new File("Error2.png");
		FileHandler.copy(sc1, dest1);
		Thread.sleep(2000);

		// Go back to previous page
		driver.navigate().back();
		Thread.sleep(2000);		
	}

}
