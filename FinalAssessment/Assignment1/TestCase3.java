package capgeminiAssignmentsOnSelenium.FinalAssessment.Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase3 {
	public static void main(String[] args) throws InterruptedException {
		//launching browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToMultiple?sublist=3");
		Thread.sleep(5000);
		//laptopcharger
		WebElement laptopcharger = driver.findElement(By.id("dragElement1"));
		//mobile cover
		WebElement mobilecover = driver.findElement(By.id("dragElement2"));
		//laptopcover
		WebElement lapcover = driver.findElement(By.id("dragElement3"));
		//mobilecharger
		WebElement mobilecharger = driver.findElement(By.id("dragElement4"));
		
		//lapaccessories
		WebElement laptopaccessories = driver.findElement(By.id("dropZone2"));
		//mobile accessories
		WebElement mobileaccessories = driver.findElement(By.id("dropZone1"));
		
		//mouse action
	    // Mobile Cover, Mobile Charger -> Mobile Accessories
		 Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).click(mobilecover).click(mobilecharger).keyUp(Keys.CONTROL).perform();
        // draging to Mobile Accessories
        actions.clickAndHold(mobilecover).moveToElement(mobileaccessories).release().perform();
        Thread.sleep(2000);

        // laptop Cover, laptop Charger -> Mobile Accessories
        actions.keyDown(Keys.CONTROL).click(lapcover).click(laptopcharger).keyUp(Keys.CONTROL).perform();
        // draging to laptop Accessories
        actions.clickAndHold(lapcover).moveToElement(laptopaccessories).release().perform();
        Thread.sleep(2000);
		
		
		//close browser
		Thread.sleep(2000);
		driver.quit();
	}

}
