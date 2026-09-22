package capgeminiAssignmentsOnSelenium.FinalAssessment.Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class TestCase4 {
	public static void main(String[] args) throws InterruptedException {
				//launching browser
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://www.shoppersstack.com/");
				Thread.sleep(10000);
				//click on product
				driver.findElement(By.xpath("//span[text()='iphone']")).click();
				//check delivary
				driver.findElement(By.id("Check Delivery")).sendKeys("583231");
				Thread.sleep(3000);
				//click on check
				driver.findElement(By.xpath("//button[@name=\"Check\"]")).click();
				//verfication
				WebElement check = driver.findElement(By.xpath("//a[text()='Check deliverable pins.']"));
				if(check.isDisplayed()) {
					System.out.println("Product is not diliverable to Your location");
				}else{
					System.out.println("Product is diliverable to Your location");
				}
				//close browser
				Thread.sleep(2000);
				driver.quit();
				
				
	}

}
