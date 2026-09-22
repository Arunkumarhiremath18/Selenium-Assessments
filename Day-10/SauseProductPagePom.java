package capgeminiAssignmentsOnSelenium.Day10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauseProductPagePom {
	WebDriver driver;
	public SauseProductPagePom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//addcart
		@FindBy(xpath = "//button[@id=\"add-to-cart-sauce-labs-backpack\"]")
		private WebElement addcart;
		public void getAddcart() {
			addcart.click();
		}
		
		@FindBy(xpath = "//a[@data-test=\"shopping-cart-link\"]")
		private WebElement cartClick;
		public void getCartClick() {
			 cartClick.click();;
		}

}
