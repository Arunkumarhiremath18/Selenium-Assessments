package capgeminiAssignmentsOnSelenium.FinalAssessment.Assignment1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {
	public static void main(String[] args) throws InterruptedException {
		//launching browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/toggle?sublist=0");
		driver.findElement(By.xpath("//a[normalize-space()='Disabled']")).click();
		//click on disabled elements
		JavascriptExecutor js = (JavascriptExecutor) driver;
		List<WebElement> toggles = driver.findElements(
		    By.xpath("//input[@type='checkbox' and @disabled]")
		);
		for (WebElement toggle : toggles) {
		    js.executeScript("arguments[0].removeAttribute('disabled');", toggle);
		    js.executeScript("arguments[0].click();", toggle);
		}
		
		//place order
		driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
		
		//verification
		WebElement orderplaced = driver.findElement(By.xpath("//p[contains(text(),'ORDER PLACED')]"));
		if(orderplaced.isDisplayed()) {
			System.out.println("Order is placed");
		}
		else {
			System.out.println("Order not  is placed");
		}
		//close browser
				Thread.sleep(2000);
				driver.quit();
		
//		//first
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		 WebElement firstToggle = driver.findElement(By.xpath("(//input[@type=\"checkbox\"and @disabled])[1]"));
//		 js.executeScript("arguments[0].removeAttribute('disabled');", firstToggle);
//		 js.executeScript("arguments[0].click();", firstToggle);
//		 //second
//		 WebElement secondToggle = driver.findElement(By.xpath("(//input[@type='checkbox' and @disabled])[2]"));
//		 js.executeScript("arguments[0].removeAttribute('disabled');", secondToggle);
//		 js.executeScript("arguments[0].click();", secondToggle);
//		 //third
//		 WebElement thirdToggle = driver.findElement(By.xpath("(//input[@type=\"checkbox\"and @disabled])[3]"));
//		 js.executeScript("arguments[0].removeAttribute('disabled');", thirdToggle);
//		 js.executeScript("arguments[0].click();", thirdToggle);
//		 //forth
//		 WebElement fourthToggle = driver.findElement(By.xpath("(//input[@type=\"checkbox\"and @disabled])[4]"));
//		 js.executeScript("arguments[0].removeAttribute('disabled');", fourthToggle);
//		 js.executeScript("arguments[0].click();", fourthToggle);
		
		
		
	}

}
