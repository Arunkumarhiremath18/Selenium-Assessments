package capgeminiAssignmentsOnSelenium.FinalAssessment.Assignment1.Assignment2;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import capgeminiAssignmentsOnSelenium.Day12.OrangeHrmLoginPom;

public class OrangeHrmBaseClass1 {
	WebDriver driver = null;

    @BeforeSuite
    public void BS() {
    	Reporter.log("--> Establish DB Connection",true);
    }

    @BeforeTest
    public void BT() {
    	Reporter.log("-->Pre-conditions",true);
    }

    @BeforeClass
    public void BC() {
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Reporter.log("-->Launching the Browser",true);
    }

    @BeforeMethod
    public void BM() throws IOException, InterruptedException {       
		FileInputStream fis = new FileInputStream(".//src/test/java/capgeminiAssignmentsOnSelenium/FinalAssessment/Assignment1/Assignment2/OrangeHrm.properties");
		Properties p = new Properties();
		p.load(fis);
		//properties file
		String BROWSER = p.getProperty("browser");
		if(BROWSER.equals("chrome")) {
			driver= new ChromeDriver();
		}
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String URL = p.getProperty("url");
		String USERNAME = p.getProperty("username");
		String PASSWORD = p.getProperty("password");
		
		driver.get(URL);
		OrangeHrmLoginPom o= new OrangeHrmLoginPom(driver);
		o.getUn(USERNAME);
		o.getPwd(PASSWORD);
		o.getLgbutton();
        Reporter.log("-->Login Successfull",true);
    }
//    @AfterMethod
//    public void AM() throws InterruptedException {
//    	OrangeHrmHomePom h=new OrangeHrmHomePom(driver);
//    	h.getProfie();
//    	h.getLogout();
//    	Reporter.log("-->Logged Out Successfully",true);
//    }
//    @AfterClass
//    public void AC() throws InterruptedException{
//    	Thread.sleep(3000);
//    	Reporter.log("-->Closing the Browser",true);
//    	driver.quit();
//    }
//    @AfterTest 
//    public void AT() {
//    	Reporter.log("-->Post-Conditions",true);
//    	
//    }
//    @AfterSuite
//    public void AS() {
//    	Reporter.log("-->Disconnect the DB Connection",true);
//    }    

}
