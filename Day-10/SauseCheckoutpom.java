package capgeminiAssignmentsOnSelenium.Day10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauseCheckoutpom {
	WebDriver driver;
	public SauseCheckoutpom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//checkout
		@FindBy(xpath = "//button[@id=\"checkout\"]")
		private WebElement checkout;
		public void getCheckout() {
			checkout.click();;
		}
		//FIRSTNAME
		@FindBy(xpath = "//input[@placeholder=\"First Name\"]")
		private WebElement fn;
		public void getFn(String value) {
			fn.sendKeys(value);
		}
		//lastname
		@FindBy(xpath = "//input[@placeholder=\"Last Name\"]")
		private WebElement ln;
		public void getLn(String value) {
			ln.sendKeys(value);
		}
		//postalcode
		@FindBy(xpath = "//input[@placeholder=\"Zip/Postal Code\"]")
		private WebElement pcode;
		public void getPcode(String value) {
			pcode.sendKeys(value);
		}
		//click on continue
		@FindBy(xpath = "//input[@id=\"continue\"]")
		private WebElement continuebutton;
		public void getContinuebutton() {
			continuebutton.click();
		}
		//finish
		@FindBy(xpath = "//button[@id=\"finish\"]")
		private WebElement finishclick;
		public void getFinishclick() {
			 finishclick.click();;
		}
		
		

}
