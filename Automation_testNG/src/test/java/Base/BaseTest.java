package Base;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected JavascriptExecutor js;
    

    @BeforeTest(alwaysRun = true)
    public void setup() {
    	
    	 ChromeOptions options = new ChromeOptions();

         options.addArguments("--headless=new");
         options.addArguments("--no-sandbox");
         options.addArguments("--disable-dev-shm-usage");
         options.addArguments("--window-size=1920,1080");

         driver = new ChromeDriver(options);
  
       // driver = new ChromeDriver();
       // driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        js = (JavascriptExecutor) driver;
        System.out.println("Browser opened");
    }

    @AfterTest(alwaysRun = true)
    public void tearDown() {

        if(driver != null) {
            driver.quit();
        }

        System.out.println("All tabs closed");
    }
}
