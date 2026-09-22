package capgeminiAssignmentsOnSelenium.FinalAssessment.Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase2 {
	public static void main(String[] args) throws InterruptedException {
				//launching browser
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://demoapps.qspiders.com/ui/slider?sublist=0");
				//mouse action
				//slide upto men cotton jacket
				WebElement scroll = driver.findElement(By.id("slide"));
				Actions act = new Actions(driver);
				act.moveToElement(scroll, 100, 0).click().build().perform();
				//verification
				WebElement orderplaced = driver.findElement(By.xpath("//h3[contains(text(),'Mens Cotton Jacket')]"));
				if(orderplaced.isDisplayed()) {
					System.out.println("slided upto Mens Cotton Jacket");
				}
				else {
					System.out.println("Not slided upto Mens Cotton Jacket");
				}
				
				//close browser
				Thread.sleep(2000);
				driver.quit();
				
	}

}
